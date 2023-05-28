package pruebas;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
	
	 public static WebDriver driver = null;
	  
	    @BeforeMethod
	    public void initialize() throws IOException {
	  
	        System.setProperty("webdriver.chrome.driver","..\\Project_POM_Example\\Drivers\\chromedriver.exe");
	    
	        ChromeOptions options=new ChromeOptions();
			options.addArguments("remote-allow-origins=*");
			driver= new ChromeDriver(options);	
	    
	        // To maximize browser
	        driver.manage().window().maximize();
	    
	        // To open  site
	        driver.get("https://demo.guru99.com/test/newtours/index.php");
	    }
	  
	    @AfterMethod
	    // Test cleanup
	    public void TeardownTest() {
	        TestBase.driver.quit();
	    }
}