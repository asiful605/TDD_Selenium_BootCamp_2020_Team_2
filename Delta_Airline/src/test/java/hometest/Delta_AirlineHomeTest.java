package hometest;

import common.WebAPI;
import homepage.Delta_AirlineHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class Delta_AirlineHomeTest extends WebAPI {

    static Delta_AirlineHomePage delta_airlineHomePage;

    public static void getInitElements() {
        delta_airlineHomePage = PageFactory.initElements(driver, Delta_AirlineHomePage.class);
    }
    @Test
    public void testDeltaCarriersSearchPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.deltaCareersSearchPage();
    }
    @Test
    public void testCheckNotifications() {
        getInitElements();
        delta_airlineHomePage.checkNotifications();
    }
    @Test
    public void testCheckFlightStatus() {
        getInitElements();
        delta_airlineHomePage.checkFlightStatus();
    }
    @Test
    public void testSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.searchButtonOptions();
    }
    @Test
    public void testGetTextFromWebElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));        getInitElements();
        delta_airlineHomePage.getTextFromWebElements();
    }
    @Test
    public void testUseMouseHover() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.useMouseHover();
    }
    @Test
    public void testHandleAlertPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.handleAlertPage();
    }
    @Test
    public void testUseCheckBoxButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.useCheckBoxButton();
    }
    @Test
    public void testReadDeltaLogoImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.readDeltaLogoImage();
    }
    @Test
    public void testTryToLogIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.tryToLogIn();
    }
}















