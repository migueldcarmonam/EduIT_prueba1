package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class paginaRegister {
	public paginaRegister(WebDriver driver) {
		 PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20),this);
		 
	 }
	
   @FindBy(xpath="//a[contains(text(),'REGISTER')]")
   WebElement registerLink;
   
   @FindBy(name="firstName")
   WebElement firstNameTextBox;
   
   @FindBy(name="lastName")
   WebElement lastNameTextBox;
   
   
   @FindBy(name="email")
   WebElement emailTextBox;
 
   @FindBy(name="password")
   WebElement passwordTextBox;
   
   @FindBy(name="confirmPassword")
   WebElement confirmPasswordTextBox;
   
   @FindBy(name="submit")
   WebElement nextButton;
   
   
   @FindBy(xpath="//tbody/tr[3]/td/p[3]/font/b")
   WebElement note;
   
   @FindBy(xpath = "//*[text() = 'PAssword and con.password does not match']")
   WebElement passConfir;
   
   public void registerPage() {
	   registerLink.click();
   }
   public void submitRegister(String strfirstName,String strlastName,String strEmail,String strPassword,String strconPassword)
   {
	   firstNameTextBox.sendKeys(strfirstName);
	   lastNameTextBox.sendKeys(strlastName);
	   emailTextBox.sendKeys(strEmail);
	   passwordTextBox.sendKeys(strPassword);
	   confirmPasswordTextBox.sendKeys(strconPassword);  
	   nextButton.click();
   }


   public String getvalidNote() {
   	 return note.getText();
   }
 
 

}
