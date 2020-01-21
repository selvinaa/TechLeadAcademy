package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class Java extends TestBase {

    public Java(){
        PageFactory.initElements(driver, this);
    }
   @FindBy(xpath = "//a[@class='ig-title title item_link']")
    public WebElement connecToMettingButton;

    public void connectToZoomMetting(){
        SeleniumUtils.click(connecToMettingButton);
    }
}
