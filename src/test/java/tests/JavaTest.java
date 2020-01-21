package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.HomePage;
import pages.Java;
import utils.ConfigReader;
import utils.SeleniumUtils;

public class JavaTest extends TestBase {

    HomePage homePage;
    DashboardPage dashboardPage;
    Java java;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initializer();
        homePage = new HomePage();
        dashboardPage = new DashboardPage();
        java = new Java();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        //driver.quit();
    }
    @Test
    public void verifyJavaPage(){
        homePage.enterEmailToSignIn(ConfigReader.readProperty(propertyPath,"email"),ConfigReader.readProperty(propertyPath,"password"));
        SeleniumUtils.click(dashboardPage.courses_Btn);// EVERY TIME TO GO TO A DIFFERENT PAGE WE HAVE TO DO THIS STEPS
        SeleniumUtils.click(dashboardPage.javaIcon);
        SeleniumUtils.click(java.introToProgramming_Btn);
        SeleniumUtils.click(dashboardPage.courses_Btn);
        SeleniumUtils.click(dashboardPage.javaIcon);
        SeleniumUtils.click(java.connecToMettingButton);
        Assert.assertEquals(driver.getTitle(), "Topic: CONNECTION TO ZOOM MEETINGS");
    }
}
