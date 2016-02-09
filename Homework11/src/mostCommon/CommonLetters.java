package mostCommon;

import java.util.TreeSet;

public class CommonLetters {
	
	TreeSet<Pair> set;
	
	CommonLetters() {
		set = new TreeSet<Pair>();
	}
	
	void makeGraph() {
		boolean isFound;
		if(Pair.userText.equals(null)) {
			 System.out.println("You haven't entered a text yet");
			 return;
		}
		for(Character word : Pair.userText.toCharArray()) {
			isFound = false;
			if((word >= 65 && word <= 90) || (word >= 97 && word <= 122)){
			
			for(Pair pair : set) {
				if(pair.getChar() == Character.toUpperCase(word)) {
					pair.incrementOccurences();
					isFound = true;
					break;					
				}
			}
			if(!isFound) {
		
				set.add(new Pair(Character.toUpperCase(word),1));
	
			}
		}
	}
	}
	
	void printGraph() {
		for(Pair pair : set) {
			System.out.println(pair);
		}
	}
}
