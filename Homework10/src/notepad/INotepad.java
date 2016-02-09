package notepad;

public interface INotepad {

		void addText(String text,int pageNum);
		void truncText(String text,int pageNum);
		void deleteText(int pageNum);
		void showInfo();
		boolean searchWord(String word);
		void printAllPagesWithDigits();
}
