

package notepad;

public class Page {

	private String headline;
	private String text;

	Page() {
		headline = "";
		text = "";
	}
	void addText(String text) {
		this.text += text;
	}
	void deleteText() {
		this.text = "";
	}
	String showText() {
		return headline + "\n" + text;
	}
	void setHeadline(String headline) {
		this.headline = headline;
	}

	boolean searchWord(String word) {
		String[] result = this.text.split(" ");
		for(int i = 0 ;i < result.length; i++) {
			if(result[i].equalsIgnoreCase(word)) {
				System.out.println("You have the word \"" + word + "\" in the text");
				return true;
			}
		}
		System.out.println("You haven't got the word \"" + word + "\" in the text");
		return false;
	}
	boolean containsDigits() {
		for(int i = 0 ; i < this.text.length(); i++) {
			if(this.text.charAt(i) >= '0' && this.text.charAt(i) <= '9') {
				System.out.println("Your text contains digits");
				return true;
			}
		}
		System.out.println("Your text doesn't contain digits");
		return false;	
	}
}