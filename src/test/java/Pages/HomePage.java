package Pages;

import Framework.Helper;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.lang.Thread;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    By homePageContainer= By.cssSelector("#search-container");
    By homePageBusIcon= By.cssSelector(".selected .icon");
    By departurePointInput= By.cssSelector("#origin-input");
    By arrivePointInput= By.cssSelector("#destination-input");
    By homePageTomorrowButton= By.cssSelector("#tomorrow");
    By homePageSearchButton= By.id("search-button");
    By filteredResults= By.cssSelector(".container .tns-outer");

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper= new Helper(driver);
    }

    public void getHomePageUrl()
    {
        String homePageUrl="Ucuz Otobüs Bileti Fiyatları, Otobüs Bileti Al - obilet.com";
        String currentUrl= driver.getTitle();
        Assert.assertEquals(homePageUrl,currentUrl);
        System.out.println(homePageUrl);
        System.out.println(currentUrl);


    }

    public void getHomePageContainer()
    {

        elementHelper.findElement(homePageContainer).isDisplayed();
    }

    public void clickHomePageBusIcon()
    {
        elementHelper.findElement(homePageBusIcon).click();
    }

    public  void setDeparturePoint(String departurePointCity) throws InterruptedException
    {

        elementHelper.findElement(departurePointInput).click();
        elementHelper.findElement(departurePointInput).sendKeys(departurePointCity);
        Thread.sleep(2000);
        //elementHelper.findElement(departurePointInput).sendKeys(Keys.ARROW_DOWN);
        elementHelper.findElement(departurePointInput).sendKeys(Keys.ENTER);

    }
    public void setArrivePoint(String arrivePointCity) throws InterruptedException
    {
        elementHelper.findElement(arrivePointInput).click();
        elementHelper.findElement(arrivePointInput).sendKeys(arrivePointCity);
        Thread.sleep(2000);
        elementHelper.findElement(arrivePointInput).sendKeys(Keys.ENTER);

    }

    public void clickTomorrowButton()
    {
        elementHelper.findElement(homePageTomorrowButton).click();

    }

    public void clickSearchButton() {
        elementHelper.findElement(homePageSearchButton).click();
    }

    public void getFilteredResults()
    {
        elementHelper.findElement(filteredResults).isDisplayed();

    }




}
