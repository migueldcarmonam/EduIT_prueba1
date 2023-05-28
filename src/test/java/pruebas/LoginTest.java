package pruebas;

import org.testng.Assert;
import org.testng.annotations.Test;
import paginas.paginaLogin;


public class LoginTest  extends TestBase {
	
	paginaLogin login;
	@Test
    public void login_valid() throws Exception {
		
  
		login= new paginaLogin(driver);
    
        login.setEmail("tutorial");
        login.setPassword("tutorial"); 
        login.clickOnNextButton();
        Assert.assertEquals(login.getTitle(),"Login Successfully"
        		+ "");
    }
	@Test
	public void login_invalid() throws Exception {
		
		  
		login= new paginaLogin(driver);
    
        login.setEmail("inv_user");
        login.setPassword("inv_pass"); 
        login.clickOnNextButton();
        Assert.assertEquals(login.getInvalid(),"Enter your userName and password correct"
        		+ "");
    }
	
}
	
