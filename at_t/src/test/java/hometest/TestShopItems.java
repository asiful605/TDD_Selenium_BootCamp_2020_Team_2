package hometest;

import common.WebAPI;
import homepage.ShopItems;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestShopItems extends WebAPI {

    static ShopItems mainhomepage;
    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, ShopItems.class);
    }

//    @Test(priority = 1)
//    public void testHomePage() throws InterruptedException {
//        mainhomepage.findDeals(); //working
//        mainhomepage.clickAccessories(); //working
//    }
//    @Test(priority = 2)
//    public void testShopNow() throws InterruptedException {
//        getInitElements();
//        mainhomepage.clickShopnow();
//        Thread.sleep(500);
//    }
//    @Test(priority = 3)
//    public void testColor() throws InterruptedException {
//        getInitElements();
//        mainhomepage.clickColor();
//        Thread.sleep(100);
//    }
//    @Test(priority = 4)
//    public void testMemory() throws InterruptedException {
//        getInitElements();
//        mainhomepage.clickMemory();
//        Thread.sleep(100);
//    }
//    @Test(priority = 5)
//    public void testwirelesssec(){
//        getInitElements();
//        mainhomepage.wirelessection();
//    }
    @Test(priority = 6)
    public void tests20PO(){
        getInitElements();
        mainhomepage.selectpriceOption();
    }
}
