package hometest;

import common.WebAPI;
import homepage.CignaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class CignaHomePageTest extends WebAPI {

    static CignaHomePage mainhomepage;
    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, CignaHomePage.class);
    }
    @Test(priority = 1)
    public void testCignaLogin(){
        getInitElements();
        mainhomepage.CignaLogin();
    }
    @Test(priority = 2)
    public void testsearchbox() {
        getInitElements();
        mainhomepage.searchomepage();
    }



}
