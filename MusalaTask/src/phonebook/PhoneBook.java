package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
	public static final int NORMALIZED_TELEPHONE_SIZE = 13;
	public static final int NORMALIZED_TELEPHONE_SIZE_NO_CHAR = 14;
	public static final int MOBILE_TELEPHONE_SIZE = 10;
	//<Name, Telephones>
	Map<String, ArrayList<String>> phoneBook;
	//<Telephone,Calls>
	Map<String,Integer> numCalls;
	public PhoneBook() {
		phoneBook = new HashMap<String,ArrayList<String>>();
		numCalls = new HashMap<String,Integer>();
	}
	public PhoneBook constructFromFile(File file) {
		PhoneBook filePhoneBook = new PhoneBook();
		try(Scanner sc = new Scanner(file)) {
			while(sc.hasNext()){
				String line = sc.nextLine();
				String[] words = line.replace('(',' ').replace(')',' ').trim().split(",");
				filePhoneBook.addPair(words[0], words[1]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error constructing from File" + e.getMessage());
		}
		return filePhoneBook;
	}
	public boolean addPair(String name, String telephone) {
		String normalizedTelephone = validateAndNormalize(telephone);
		if (normalizedTelephone != null) {
			if (phoneBook.containsKey(name)) {
				phoneBook.get(name).add(normalizedTelephone);
			} else {
				phoneBook.put(name, new ArrayList<String>());
				phoneBook.get(name).add(normalizedTelephone);
			}
			return true;
		}
		return false;
	}
	public boolean deletePair(String name) {
		if (phoneBook.containsKey(name)) {
			phoneBook.remove(name);
			return true;
		}
		return false;
	}
	public List getTelephone(String name) {
		List<String> result = new ArrayList<String>();
		if (phoneBook.containsKey(name)) {
			result.addAll(phoneBook.get(name));
		}
		return result;
	}
	public void printAllPairs() {
		TreeMap<String, List<String>> result = new TreeMap<String, List<String>>();
		for (Entry<String,ArrayList<String>> entryPhoneBook : phoneBook.entrySet()) {
			String personName = entryPhoneBook.getKey();
			result.put(personName, entryPhoneBook.getValue());
		}
		System.out.println(result.toString());
	}
	public void printTopCalls(){
		//<num calls,<telephone,name>>
		TreeMap<Integer,Map<String,String>> sortedCalls = new TreeMap<Integer, Map<String, String>>(Collections.reverseOrder());
		for(Entry<String,Integer> entry:numCalls.entrySet()){
			Integer numCalls = entry.getValue();
			String telephone = entry.getKey();
			String personName = getNameByTelephone(telephone);
			if(sortedCalls.containsKey(numCalls)){
				sortedCalls.get(numCalls).put(telephone, personName);
			} else {
				sortedCalls.put(numCalls, new HashMap<String,String>());
				sortedCalls.get(numCalls).put(telephone, personName);
			}
		}
		int counter = 0;
		for(Entry<Integer,Map<String,String>> entry : sortedCalls.entrySet()){
			
			for(Entry<String,String> entryCalls : entry.getValue().entrySet()){
				System.out.println(entryCalls.getValue() + " " + entryCalls.getKey());
				counter++;
				if(counter >= 5){
					return;
				}
			}
		}
	}
    private String getNameByTelephone(String telephone) {
		for(Entry<String,ArrayList<String>> entry : phoneBook.entrySet()){
			if(entry.getValue().contains(telephone)){
				return entry.getKey();
			}
		}
		return null;
	}
	private String validateAndNormalize(String telephone) {
		if(telephone.startsWith("+3598") && telephone.length() == NORMALIZED_TELEPHONE_SIZE){
			String subTelephone = telephone.substring(5, NORMALIZED_TELEPHONE_SIZE);
			if(validSubTelephone(subTelephone)){
				return telephone;
			}
		}
		else if(telephone.startsWith("08") && telephone.length() == MOBILE_TELEPHONE_SIZE){
			String subTelephone = telephone.substring(2, MOBILE_TELEPHONE_SIZE);
			if(validSubTelephone(subTelephone)){
				return "+359" + telephone.substring(1,MOBILE_TELEPHONE_SIZE);
			}
		}
		else if(telephone.startsWith("003598") && telephone.length() == NORMALIZED_TELEPHONE_SIZE_NO_CHAR){
			String subTelephone = telephone.substring(6, NORMALIZED_TELEPHONE_SIZE_NO_CHAR);
			if(validSubTelephone(subTelephone)){
				return "+" + telephone.substring(2,NORMALIZED_TELEPHONE_SIZE_NO_CHAR);
			}
		}
		return null;
	}
	private boolean validSubTelephone(String subTelephone){
		if(subTelephone.charAt(0) >= '7' && subTelephone.charAt(0) <= '9') {
			if(subTelephone.charAt(1) >= '2' && subTelephone.charAt(1) <= '9') {
				for(int i = 2; i<subTelephone.length();i++) {
					if(subTelephone.charAt(i) <= '0' || subTelephone.charAt(i) >= '9'){
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		File file = new File("/koala.txt");
		PhoneBook test = new PhoneBook();
		test = test.constructFromFile(file);
		test.printAllPairs();
		System.out.println(test.getTelephone("ivan").toString());
	
	}
}
