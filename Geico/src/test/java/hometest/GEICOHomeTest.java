package hometest;

import common.WebAPI;
import homepage.GEICOHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;


public class GEICOHomeTest extends WebAPI {

    static GEICOHomePage geicoHomePage;

    public static void getInitElements(){
        geicoHomePage = PageFactory.initElements(driver, GEICOHomePage.class);
    }

        @DataProvider
       public static Object[][] getData() throws IOException, IOException {
            DataReader reader= new DataReader();
       Object[][] Data  =  reader.fileReader3("login");
           return Data;
        }

      @Test(dataProvider="getData",enabled = true)
              public void TestlogIn(String id,String pass){
               getInitElements();
               geicoHomePage.logIn(id, pass);
            }

}
