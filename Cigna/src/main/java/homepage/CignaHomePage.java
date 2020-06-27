package homepage;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import javax.swing.*;

import java.util.Set;

import static webelements.webelements.*;


public class CignaHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = userrlogin) WebElement useuserrlogin;
    @FindBy(how = How.XPATH, using = searchHomePage) WebElement usesearchHomePage;
    @FindBy(how = How.CSS, using = username ) WebElement useusername;
    @FindBy(how = How.CSS, using = password) WebElement usespassword;
    @FindBy(how = How.XPATH, using = loggin) WebElement usesloggin;

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public static void handleWindow() {
        String parentHandle = driver.getWindowHandle();
        System.out.println("parent window - " + parentHandle);
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            System.out.println(handle);
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
            }
        }
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
    public void searchPlansFromXlsx(String plans){
        usesearchHomePage.sendKeys(plans);
    }
    public void username(){
        useuserrlogin.click();
        handleWindow();
        useusername.sendKeys("asif");
    }

    public void useusernameandPAssword(String username, String Pass) throws InterruptedException {
        useuserrlogin.click();
        handleWindow();
        Thread.sleep(2000);
        useusername.sendKeys(username);
        usespassword.sendKeys(Pass);
        usesloggin.click();
    }
}
