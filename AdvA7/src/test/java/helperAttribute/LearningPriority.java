package helperAttribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningPriority {

	@Test(priority = 1)
	public void logout() {
		Reporter.log("user has logout",true);
	}
	
	@Test(priority = -1)
	public void login() {
		Reporter.log("user has login",true);
	}
	
	@Test(priority = 0)
	public void addCart() {
		Reporter.log("user added a product to cart",true);
	}
}
