package scripts_Vtiger;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomRepo.OrganisationPage;

public class Script5_Test extends BaseClass{

	@Test(groups = "organisation")
	public void script5() throws InterruptedException {
		OrganisationPage op= new OrganisationPage(driver);
		Thread.sleep(2000);
		op.getOrganisationLink().click();
		Thread.sleep(2000);
	}
}
