package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.GEICOWebElements.*;

public class GEICOHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = logInTadWebElement)
    public WebElement logIn;
    @FindBy(how = How.ID, using = userIdWebElement)
    public WebElement userId;
    @FindBy(how = How.ID, using = passwordWebElement)
    public WebElement password;
    @FindBy(how = How.XPATH, using = logInButtonWebElement)
    public WebElement logInButton;
    @FindBy(how = How.XPATH, using = cookieWebElement)
    public WebElement cookieClose;
    public void closeCookie() {
        cookieClose.click();}
    public void clickLogIn() {
        logIn.click();
    }

    public void clickLogInButton() {
        logInButton.click();
    }

    public void logIn(String id,String pass){
      closeCookie();
      clickLogIn();
     // userId.clear();
      userId.sendKeys(id);
      //password.clear();
      password.sendKeys(pass);
      clickLogInButton();



    }







}