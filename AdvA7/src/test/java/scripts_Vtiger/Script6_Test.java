package scripts_Vtiger;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomRepo.OrganisationPage;
import pomRepo.ProductPage;

public class Script6_Test extends BaseClass{

	@Test(groups = "product")
	public void script6() throws InterruptedException, EncryptedDocumentException, IOException {
		ProductPage pp= new ProductPage(driver);
		pp.getProductLink().click();
		pp.getCreateProduct().click();
		pp.getProductName().sendKeys(um.getDataFromExcelFile("product", 0, 0));
		OrganisationPage op= new OrganisationPage(driver);
		op.getSaveButton().click();
		
	}
}
