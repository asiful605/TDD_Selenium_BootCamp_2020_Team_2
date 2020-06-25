package hometest;

import common.WebAPI;
import homepage.at_tHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class at_tHomeTest extends WebAPI {

    static at_tHomePage mainhomepage;
    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, at_tHomePage.class);
      }
//    @Test(priority = 1)
//    public void testusersearchbox() throws InterruptedException {
//        getInitElements();
//        mainhomepage.usersearchbox();
//      }
//    @Test(priority = 2)
//    public void testsearchclickbutton() throws InterruptedException {
//        getInitElements();
//        mainhomepage.usersearchbox();
//        mainhomepage.searchclickbutton();
//        //Thread.sleep(3000);
//      }
//      @Test (priority = 3)
//      public void testscroll() throws InterruptedException {
//        getInitElements();
//        mainhomepage.scrolldownwebpage();
//        Thread.sleep(3000);
//      }
//      @Test (priority = 4)
//      public void testscrolltoend() throws InterruptedException {
//        getInitElements();
//        mainhomepage.scrolltoend();
//      }
//      @Test(priority = 5)
//      public void testclickaccountlogin(){
//        getInitElements();
//        mainhomepage.clickaccountlogin();
//      }
//      @Test(priority = 6)
//      public void testiphoneimage() throws InterruptedException {
//          getInitElements();
//          mainhomepage.clickoniphoneimage();
//          Thread.sleep(3000);
//      }
//      @Test(priority = 7)
//      public void testpricingoption() throws InterruptedException {
//          getInitElements();
//          mainhomepage.clickoniphoneimage();
//          mainhomepage.selectpricingoption();
//     }
//     @Test(priority = 8)
//     public void testhoveringOnMenuElement() throws InterruptedException {
//     getInitElements();
//     mainhomepage.hoveringOnMenuElement();
//      }
//     @Test(priority = 9)
//     public void testUserclickOnImageelement(){ getInitElements();
//     mainhomepage.UserclickOnImageelement();
//      }
//     @Test(priority = 10)
//      public void testUserhandleAlert(){
//      getInitElements();
//      mainhomepage.handleAlert();
//      }
//      @Test(priority = 11)
//      public void testupdateUserDeals() throws InterruptedException {
//        getInitElements();
//        mainhomepage.userDealsUpdate();
//      }
//      @Test(priority = 12)
//      public void testcheckUpgrade(){
//          getInitElements();
//          mainhomepage.checkUpgrade();
//      }
//        @Test(priority = 13)
//        public void testcheckMenuOption(){
//        getInitElements();
//        mainhomepage.menuOption();
//      }
//    @Test(priority = 14)
//    public void testBundles(){
//        getInitElements();
//        mainhomepage.usebundle();
//    }
//      @Test(priority = 15)
//      public void testBusiness(){
//      getInitElements();
//      mainhomepage.UseBusiness();
//      }
//      @Test(priority = 16)
//      public void testtv(){
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        getInitElements();
//        mainhomepage.useTV();
//    }
//    @Test(priority = 17)
//        public void testsupport(){
//        getInitElements();
//        mainhomepage.useonelinesupport();
//    }
    @Test(priority = 17)
    public void testbrokenlink(){
        getInitElements();
        mainhomepage.getBrokenLink();
    }


}
