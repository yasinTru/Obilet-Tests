package Pages;

import org.openqa.selenium.Keys;
import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelpPage {

    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    By clickHelpPageBtn= By.xpath("//a[@data-event-category=\"Main Menu\"]");
    By helpPageContainer= By.cssSelector(".section.hero");
    By helpPageSearchBox= By.id("query");
    By _2thResult= By.xpath("//a[contains(text(),'Aldığım otobüs bileti ile birlikte ne kadar bagaj')]");
    By searchedTitle=By.cssSelector("h1[title='Aldığım otobüs bileti ile birlikte ne kadar bagaj hakkım var?']");
    By searhedPage= By.cssSelector(".article");

    public HelpPage(WebDriver driver)
    {
        this.driver= driver;
        this.wait= new WebDriverWait(driver,10);
        this.elementHelper= new Helper(driver);
    }

    public void clickHelpPage()
    {
        elementHelper.findElement(clickHelpPageBtn).click();
    }

    public void getHelpPageContainer()
    {
        elementHelper.findElement(helpPageContainer).isDisplayed();
    }

    //functions suspended because of captcha

    public void clickSearchBox(String otobus)
    {
        elementHelper.sendKey(helpPageSearchBox, otobus);
       // elementHelper.findElement(helpPageSearchBox).sendKeys(Keys.ENTER);
    }

    public void click2thResult()
    {
        elementHelper.clickElement(_2thResult);
    }

    public void checkTextTitle()
    {
        elementHelper.checkElement(searchedTitle);
    }

    public void checkDetails()
    {
        elementHelper.checkElement(searhedPage);
    }

}
