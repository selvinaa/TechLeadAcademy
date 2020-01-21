package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class HomePage extends TestBase {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "pseudonym_session_unique_id")
    public WebElement login_Field;

    @FindBy(id = "pseudonym_session_password")
    public WebElement passwordField;

    @FindBy(id = "pseudonym_session_remember_me")
    public WebElement staySignInBox;

    @FindBy(xpath = "//button[@class='Button Button--login']")
    public WebElement logIn_Button;


    public void enterEmailToSignIn(String email, String password){
        SeleniumUtils.click(login_Field);
        SeleniumUtils.sendKeys(login_Field, email);
        SeleniumUtils.sendKeys(passwordField,password);
        SeleniumUtils.click(staySignInBox);
        SeleniumUtils.click(logIn_Button);



    }


}
