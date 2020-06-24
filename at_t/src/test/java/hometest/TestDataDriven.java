//package hometest;
//
//import common.WebAPI;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import utility.DataDriven;
//
//import java.util.List;
//
//public class TestDataDriven extends WebAPI {
//
//    DataDriven read;
//    @BeforeMethod
//    public void initializeElement () {
//        read= PageFactory.initElements(driver, DataDriven.class);
//    }
//    @Test
//    public void webElementName(){
//        List actual = read.getItemValue();
//        List expected = read.getItemValue();
//        Assert.assertEquals(actual,expected);
//    }
//}
//
