package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initializer();
        homePage = new HomePage();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifySignInButton(){
        SeleniumUtils.waitForVisivilityOfElement(homePage.login_Field);
        Assert.assertEquals(driver.getTitle(), "Log In to Canvas");
    }

    @Test
    public void sighInWithEmail(){
        SeleniumUtils.waitForVisivilityOfElement(homePage.staySignInBox);
        //SeleniumUtils.waitForVisivilityOfElement(homePage.logIn_Button);
        homePage.enterEmailToSignIn("selvinasencio@gmail.com", "Selvin$$");

    }


    }


