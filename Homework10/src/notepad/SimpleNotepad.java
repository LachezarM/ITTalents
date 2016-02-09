package notepad;

public class SimpleNotepad implements INotepad {

	protected Page[] pages;

	SimpleNotepad(int numPages) {
		pages = new Page[numPages];
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page();
		}
	}

	@Override
	public void addText(String text, int pageNum) {
		pages[pageNum].addText(text);

	}

	@Override
	public void truncText(String text, int pageNum) {
		deleteText(pageNum);
		pages[pageNum].addText(text);

	}

	@Override
	public void deleteText(int pageNum) {
		pages[pageNum].deleteText();

	}

	@Override
	public void showInfo() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println((i + 1) + " page: ");
			System.out.println(pages[i].showText());
		}

	}

	@Override
	public boolean searchWord(String word) {
		for(int i = 0; i < this.pages.length; i++) {
			if(pages[i].searchWord(word)) {
				System.out.println("One of your pages contains the word \"" + word + "\"");
				return true;
			}
		}
		System.out.println("None of your pages contains the word \"" + word + "\"");
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for(int i = 0; i < this.pages.length; i++) {
			if(pages[i].containsDigits()) {
				pages[i].showText();
			}
		}
	}

}
