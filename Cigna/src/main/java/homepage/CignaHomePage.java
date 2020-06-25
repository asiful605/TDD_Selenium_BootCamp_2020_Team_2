package homepage;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;

import static webelements.webelements.*;


public class CignaHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = userrlogin)
    WebElement useuserrlogin;
    @FindBy(how = How.XPATH, using = searchHomePage)
    WebElement usesearchHomePage;

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public void Enter(){
        Actions drpdown = new Actions(driver);
        drpdown.sendKeys(Keys.ENTER).perform();
    }
    public void CignaLogin(){
        maximizeWindow();
        useuserrlogin.click();
    }
    public void searchomepage(){
        maximizeWindow();
        usesearchHomePage.sendKeys("Broker");
        Enter();
    }

}
