package WebdriverArch;

public class AmazonTest {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		
		//FireFoxDriver driver = new FireFoxDriver();
		
		//SafariDriver driver = new SafariDriver();
		
		String browserName = "chrome";
		
		//cross browser logic : top casting
		WebDriver driver = null;
		switch(browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
		break;
		case "FireFox":
			driver = new FireFoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Pls pass the right browser namr :" + browserName);
			
		}
		
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.sendKeys("search field", "Malar LLC");
		driver.click("searchIcon");
		driver.close();
		
		}

}
