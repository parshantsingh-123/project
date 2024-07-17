package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getCreateContactButton() {
		return createContactButton;
	}

	public WebElement getLastnameTxtBox() {
		return lastnameTxtBox;
	}

	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createContactButton;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTxtBox;
	
	
}
