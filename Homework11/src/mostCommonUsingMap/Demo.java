package mostCommonUsingMap;

import java.util.Map;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		
		TreeMap<Character , Integer> map = new TreeMap<Character, Integer>();
		TreeMap<Integer , Character> map2 = new TreeMap<Integer, Character>();
		String userText = "His name is slim shady";
		fillMap(userText , map);
		swapEntryMap(map,map2);
		showMap(map);
	
	
		
	
	
	}
	private static void swapEntryMap(TreeMap<Character, Integer> map,TreeMap<Integer, Character> map2) {
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			map2.put(entry.getValue(), entry.getKey());
		}
		
	}
	static void fillMap(String userText,TreeMap<Character, Integer> map) {
		for(Character word : userText.toCharArray()) {
			if((word >= 65 && word <= 90) || (word >=97 && word <= 122)) {
				if(map.containsKey(Character.toUpperCase(word))) {
					map.put(Character.toUpperCase(word), map.get(Character.toUpperCase(word)) + 1);
				}
				else {
					map.put(Character.toUpperCase(word),1);
				}
			}
		}
	}
	static void showMap(TreeMap<Character, Integer> map) {
		for(Map.Entry<Character , Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
