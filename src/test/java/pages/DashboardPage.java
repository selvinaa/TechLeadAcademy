package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class DashboardPage  extends TestBase {
    public DashboardPage (){
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Dashboard")
    public WebElement dashBoard_title;

    @FindBy(id = "global_nav_courses_link")
    public WebElement courses_Btn;

    @FindBy(xpath = "//a[@class='czbXA_bGBk eHiXd_bGBk eHiXd_brAJ eHiXd_ycrn eHiXd_bNlk eHiXd_cuTS']")
    public WebElement javaIcon;


    public void getCoursesInTo(){
        SeleniumUtils.click(courses_Btn);
        SeleniumUtils.getText(dashBoard_title);
        SeleniumUtils.click(javaIcon);
    }



}
