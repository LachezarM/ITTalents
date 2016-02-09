
package notepad;
import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad{

	
	private String password;
	Scanner sc = new Scanner(System.in);

	SecuredNotepad(int numPages,String password) {
		super(numPages);
		if(isStrongPassword(password)) {
			this.password = password;
		} else {
			throw new IllegalArgumentException ("Password should be atleast 5 digits ,with atleast one small and big character,"
					+ "and atleast one digit");
		}
	}

	protected boolean inputPassword() {
		System.out.println("Input password: ");
		if(sc.nextLine().equals(this.password)) {
			System.out.println("Correct!");
			return true;
		} else {
			System.out.println("Incorect password");
			return false;
		}
	}
	@Override
	public void addText(String text, int pageNum) {
		System.out.print("In order to add text u should: ");
		if(inputPassword()) {
			super.addText(text, pageNum);
		}
	}
	@Override
	public void truncText(String text, int pageNum) {
		System.out.print("In order to delete the previous text u should: ");
		if(inputPassword()) {
			super.truncText(text, pageNum);
		}
	}
	@Override
	public void deleteText(int pageNum) {
		System.out.print("In order to delete text u should: ");
		if(inputPassword()) {
			super.deleteText(pageNum);
		}
	}
	@Override
	public void showInfo() {
		System.out.print("In order to print all the info  u should: ");
		if(inputPassword()) {
			super.showInfo();
		}
	}
	protected boolean hasSmallChar(String text) {
		for(int i = 0;i < text.length(); i++) {
			if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				return true;
			}
		}
		return false;
	}
	protected boolean hasBigChar(String text) {
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				return true;
			}
		}
		return false;
	}
	protected boolean hasDigits(String text) { //could have used object page's method containsDigits() but had to add String and change 
									//it's signature,also had to add a getter for the page's text because its private
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) >= '0' && text.charAt(i) <= '9') {
				return true;
			}
		}
		return false;
	}
	protected boolean isStrongPassword(String text) {
		if(text.length() >= 5 && hasSmallChar(text) && hasBigChar(text) && hasDigits(text)) {
			return true;
		}
		return false;
	}
	
	
	
}
