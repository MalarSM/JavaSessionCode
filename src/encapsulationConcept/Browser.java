package encapsulationConcept;

public class Browser {

	public void launchBrowser() {
		System.out.println("Launching browser");
		checkRAMSize();
		checkTheBrowserPolicy();
		checkthebrowserUpdate();
		System.out.println("Browser launched successfully");
	}

	private void checkRAMSize() {
		System.out.println("checkRAMSiz");
	}
 
	private void checkTheBrowserPolicy() {
		System.out.println("checkTheBrowserPolicy");
	}
	
	private void checkthebrowserUpdate() {
		System.out.println("checkthebrowserUpdate");
	}

}
