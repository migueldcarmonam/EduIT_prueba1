package paginas;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
public class paginaLogin {

	  
	public paginaLogin(WebDriver driver) {
		 PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20),this);
		 
	 }
  
    // Using FindBy for locating elements
    @FindBy(name="userName")
    WebElement emailTextBox;
  
    @FindBy(name="password")
    WebElement passwordTextBox;
    
    @FindBy(name="submit")
    WebElement nextButton;
    
    
    @FindBy(xpath="//tbody//tr//td//h3")
    WebElement title;
    
    @FindBy(xpath="//span[contains(text(),'Enter your userName and password correct')]")
    WebElement invalidLogin;
   
    public void setEmail(String strEmail) {
            emailTextBox.sendKeys(strEmail);
        }
        // This method is to set Password in the password text box
    public void setPassword(String strPassword) {
            passwordTextBox.sendKeys(strPassword);
        }
        // This method is to click on Next Button
    public void clickOnNextButton() {
        nextButton.click();
    }
    
    public String getTitle() {
    	 return title.getText();
    }
  
    public String getInvalid() {
   	 return invalidLogin.getText();
   }

}