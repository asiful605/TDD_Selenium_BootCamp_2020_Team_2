package homepage;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

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
    //////////////////////////////////////////////////////////////////////////////////////////////////
    @FindBy(how = How.XPATH, using = searchInputX)
    public WebElement searchInput;
    @FindBy(how = How.XPATH, using = emailSignUpInputX)
    public WebElement emailSignUpInput;
    @FindBy(how = How.XPATH, using = signMeUpEmailsX)
    public WebElement signMeUpEmail;

    @FindBy(how = How.XPATH, using = supportButtonX)
    public WebElement supportButton;
    @FindBy(how = How.XPATH, using = supportButtonTooltipX)
    public WebElement supportButtonToolTip;

    @FindBy(how = How.XPATH, using = webElementSearchDropDownAccountXpath)
    public WebElement dropDown;

    @FindBy(how = How.XPATH, using = webElementSearchDropDownAccountOptionsXpath)
    public WebElement dropDownOptions;

    @FindBy(how = How.XPATH, using = resultsRowX)
    public WebElement resultsRow;
    //////////////////////////////////////////////////////////////////////////////////////////////////

    public void clickSupport(){
        usesupport.click();
    }
    public void shopAllOfferClick() {
        clickinternet.click();
        useshopalloffers.click();
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

    //////////////////////---------------------------------------------------------------------------------
    public void useToolTip() {
        //        //Instantiate Action Class
        Actions actions = new Actions(driver);
        //        // Use action class to mouse hover
        actions.moveToElement(supportButton).perform();
        // To get the tool tip text and assert
        String toolTipText = supportButtonToolTip.getText();
        System.out.println("toolTipText-->" + toolTipText);

        //Verification if tooltip text is matching expected value
        if (toolTipText.equalsIgnoreCase("Support.")) {
            System.out.println("Pass* : Tooltip matching expected value");
        } else {
            System.out.println("Fail : Tooltip NOT matching expected value");
        }

    }



    public void searchResultsWithSSLCertificate(){
        DesiredCapabilities handlSSLErr = new DesiredCapabilities();
        handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
//        WebDriver driver = new ChromeDriver (handlSSLErr);

        searchInput.sendKeys("Iphone");
        searchInput.sendKeys("\n");
        List<WebElement> results = driver.findElements(By.xpath("//meta[@name='description']"));;
        //Get the Total Count
        System.out.println(results.size());
        if(results.size() ==100)
        {
            System.out.println("100 REsults are found as Expected");
        }
        //To display the http value for each results
        for(WebElement each : results)
        {
            System.out.println(each.getAttribute("href"));
        } }

    public void javaScriptExcutor(){
        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Launching the Site.
        driver.get("http://att.com");

        //Fetching the Domain Name of the site. Tostring() change object to name.
        String DomainName = js.executeScript("return document.domain;").toString();
        System.out.println("Domain name of the site = "+DomainName);

        //Fetching the URL of the site. Tostring() change object to name
        String url = js.executeScript("return document.URL;").toString();
        System.out.println("URL of the site = "+url);

        //Method document.title fetch the Title name of the site. Tostring() change object to name
        String TitleName = js.executeScript("return document.title;").toString();
        System.out.println("Title of the page = "+TitleName);


        //Navigate to new Page i.e to generate access page. (launch new url)
        js.executeScript("window.location = 'https://www.att.com/internet/'");

    }


    public void doSearch() throws InterruptedException {

        driver.manage().deleteAllCookies();

        searchInput.sendKeys("Iphone 12");
        searchInput.sendKeys("\n");


    }

    public void signMeUpEmail() {
        emailSignUpInput.sendKeys("Nyjetsfantic@yahoo.com");
        signMeUpEmail.click();
        navigateBack();
    }


}
