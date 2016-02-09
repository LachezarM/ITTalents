package mostCommon;

public class Pair implements Comparable<Pair>{
	
	static String userText;
	private char character;
	private int occurences;
	private String graph;
	
	Pair(char character,int occurences) {
		this.character = character;
		this.occurences = occurences;
	}
	
	static void addTextLogic(String userText) {
		Pair.userText = userText;
	}
	
	char getChar() {
		return this.character;
	}
	int getOccurences() {
		return this.occurences;
	}
	@Override
	public int compareTo(Pair o) {
		if(this.occurences > o.occurences) {
			return 1;
		}
		else if (this.occurences < o.occurences){
			return -1;
		}
		else {
			if(this.character > o.character) {
				return 1;
			}
			else if(this.character < o.character) {
				return -1;
			}
			else return 0;
		}
	}
	
	public void incrementOccurences() {
		this.occurences ++;
		
	}
	@Override
	public String toString() {
		return this.character + ": " + this.occurences;
	}
	
}
