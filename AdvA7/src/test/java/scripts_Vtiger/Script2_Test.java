package scripts_Vtiger;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomRepo.OrganisationPage;

public class Script2_Test extends BaseClass{

	@Test(groups = "organisation")
	public void script2() throws EncryptedDocumentException, IOException, InterruptedException {
		OrganisationPage op= new OrganisationPage(driver);
		Thread.sleep(2000);
		op.getOrganisationLink().click();
		op.getCreateOrganisation().click();
		int ranNum = ja.getRandomNumber();
		op.getNameTxtBox().sendKeys(um.getDataFromExcelFile("Organisation", 0, 0)+ranNum);
		wb.selectDropdownByValue(op.getIndustryDropdown(), "Healthcare");
		Thread.sleep(2000);
		op.getSaveButton().click();
		
	}
}
