package notepad;


public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{
	private boolean isStarted;
	ElectronicSecuredNotepad(int numPages, String password) {
		super(numPages, password);
	}

	@Override
	public void start() {
		isStarted = true;
	}

	@Override
	public void stop() {
		isStarted = false;
	}

	@Override
	public boolean isStarted() {
		if(isStarted) {
			return true;
		} 
		System.out.println("The device is off");
		return false;
	}
	@Override
	protected boolean inputPassword() {
		if(isStarted()) {
			return super.inputPassword();
		} else {
			System.out.println("The device is off");
			return false;
		}
	}
	@Override
	public void addText(String text, int pageNum) {
		if(isStarted()) {
			super.addText(text, pageNum);
		}
	}
	@Override
	public void deleteText(int pageNum) {
		if(isStarted()) {
			super.deleteText(pageNum);
		}
	}
	@Override
	public void truncText(String text, int pageNum) {
		if(isStarted()) {
			super.truncText(text, pageNum);
		}
	}
	@Override
	public void showInfo() {
		if(isStarted()) {
			super.showInfo();
		}
	}

}
