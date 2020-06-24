package homepage;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.IntPurchaseWebelements.*;

public class InternetPurchase extends WebAPI {

    @FindBy(how = How.XPATH,using = internet)
    WebElement clickinternet;
    @FindBy(how = How.XPATH,using = support)
    WebElement usesupport;
    @FindBy(how = How.XPATH, using = shopalloffers)
    WebElement useshopalloffers;
    @FindBy(how = How.XPATH, using = adressfield)
    WebElement enteradressfield;
    @FindBy(how = How.XPATH, using = zipcode)
    WebElement usezipcode;
    @FindBy(how = How.XPATH, using = Baddresscheckbox)
    WebElement checkBaddresscheckbox;
    @FindBy(how = How.XPATH, using = listclick)
    WebElement checklistclick;
    @FindBy(how = How.XPATH, using = submitdeals)
    WebElement checksubmitdeals;

    public void clickSupport(){
        usesupport.click();
    }
    public void shopAllOfferClick() throws InterruptedException {
        clickinternet.click();
        useshopalloffers.click();
        Thread.sleep(200);
    }
    public void enteradressfield() throws InterruptedException {
        clickinternet.click();
        useshopalloffers.click();
        enteradressfield.sendKeys("452 main st");
        checklistclick.click();
        usezipcode.sendKeys("11789");
        checkBaddresscheckbox.isSelected();
        checksubmitdeals.click();
        Thread.sleep(5000);
    }
    public void Baddresscheckbox() throws InterruptedException {
        clickinternet.click();
        useshopalloffers.click();
        checkBaddresscheckbox.isSelected();
        Thread.sleep(5000);
    }
}
