package tests;

import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.SeleniumUtils;

public class DashboardPageTest extends TestBase {

    HomePage homePage;
    DashboardPage dashboardPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initializer();
        homePage = new HomePage();
        dashboardPage = new DashboardPage();

    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void verifyDashboarIcon(){
        homePage.enterEmailToSignIn("selvinasencio@gmail.com", ConfigReader.readProperty(propertyPath, "password"));// TO START FROM THE BEGINNING CONFIG PROPERTIES FILE
        SeleniumUtils.waitForVisivilityOfElement(dashboardPage.courses_Btn);

    }

}
