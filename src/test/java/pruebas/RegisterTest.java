package pruebas;

import org.testng.Assert;
import org.testng.annotations.Test;

import paginas.paginaRegister;

public class RegisterTest extends TestBase{
	  paginaRegister register;
	
	  @Test(enabled = false)
	  public void register_valid() throws Exception {
			
		  
			register= new paginaRegister(driver);
			register.registerPage();
	    	register.submitRegister("Juan","Perez","test1@gmail.com","123","123");
	        Assert.assertEquals(register.getvalidNote(),"Note: Your user name is test1@gmail.com."
	        		+ "");
	    }
	  
	  @Test
	  public void register_invalid_1() throws Exception {
			
		  
			register= new paginaRegister(driver);
			register.registerPage();
	    	register.submitRegister("Juan","Perez","test1@gmail.com","123","1234");
	        Assert.assertEquals(register.getvalidNote(),"PAssword and con.password does not match"
	        		+ "");
	    }

	//*[text() = 'PAssword and con.password does not match']
}
