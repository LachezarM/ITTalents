package notepad;

public class NotepadDemo {

	public static void main(String[] args) {
		
		SimpleNotepad notepad = new SimpleNotepad(2);
		notepad.addText("waza", 0);
		notepad.addText("waza", 0);
		notepad.addText("vaza  \n vaza  \n vaza", 1);
		notepad.truncText("vaza", 0);
		notepad.showInfo();
		SecuredNotepad notepadSecured1= new SecuredNotepad(4,"qwerTy1");
		notepadSecured1.addText("waza", 0);
		notepadSecured1.showInfo();
		SecuredNotepad notepadSecured2 = new SecuredNotepad(2,"god");
		notepadSecured2.addText("LeagueOfLegends sucks!",0);
		notepadSecured2.pages[0].setHeadline("TopConfidential");
		notepadSecured2.showInfo();
		Page page1 = new Page();
		page1.addText("Hello and Gooduy");
		page1.searchWord("hELlO");
		page1.containsDigits();
		ElectronicSecuredNotepad electric1 = new ElectronicSecuredNotepad(2, "OP");
		electric1.addText("Heyy", 0);
		electric1.start();
		electric1.addText("Heyy", 0);
		electric1.showInfo();
	}

}
		