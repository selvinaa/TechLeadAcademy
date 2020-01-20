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

    @FindBy(id = "global_nav_courses_link")
    public WebElement courses_Btn;

    public void getCoursesInTo(){
        SeleniumUtils.click(courses_Btn);
        Assert.assertEquals(driver.getTitle(), "dash");

    }


}
