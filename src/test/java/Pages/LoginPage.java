package Pages;

import Framework.Helper;
import io.cucumber.java.bs.A;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    By homePageLoginButton= By.cssSelector(".container .login");
    By loginPageContainer= By.cssSelector(".body .ob-auth");
    By loginPageLoginButton= By.cssSelector(".login .login-button");
    By loginPageEmailInput= By.xpath("//input[@type=\"email\"]");
    By loginPagePasswordInput= By.xpath("//input[@type=\"password\"]");
    By loginPageWrongEmailText= By.id("username-error");
    By loginPageWrongPasswordText= By.id("password-error");
    By loginPageEmptyEmail= By.id("username-error");
    By loginPageEmptyPassword = By.id("password-error");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper=new Helper(driver);
    }

    public void goToLoginPage()
    {
        elementHelper.findElement(homePageLoginButton).click();

    }

    public void getLoginPageContainer()
    {
        elementHelper.findElement(loginPageContainer).isDisplayed();
    }

    public void setLoginEmail(String setEmail)
    {
        elementHelper.findElement(loginPageEmailInput).sendKeys(setEmail);

    }

    public void setLoginPassword(String setPassword)
    {
        elementHelper.findElement(loginPagePasswordInput).sendKeys(setPassword);
    }

    public void getEmailErrorMessage(String emailText)
    {
        String wrongEmailText= elementHelper.findElement(loginPageWrongEmailText).getText();
        Assert.assertEquals(emailText,wrongEmailText);
    }

    public void getPasswordEmailErrorMessage(String passwordText)
    {
        String  wrongPasswordText= elementHelper.findElement(loginPageWrongPasswordText).getText();
        Assert.assertEquals(passwordText,wrongPasswordText);
    }

    public void clickLoginButton()
    {
        elementHelper.findElement(loginPageLoginButton).click();
    }

    public void getEmptyEmail(String EmptyEmail)
    {
        String emptyEmail= elementHelper.findElement(loginPageEmptyEmail).getText();
        Assert.assertEquals(emptyEmail,EmptyEmail);
    }

    public void getEmptyPassword(String EmptyPass)
    {
        String emptyPassword= elementHelper.findElement(loginPageEmptyPassword).getText();
        Assert.assertEquals(emptyPassword,EmptyPass);
    }





}
