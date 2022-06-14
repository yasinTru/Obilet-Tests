package Pages;

import Framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelpPage {

    WebDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    By clickHelpPageBtn= By.xpath("//a[@data-event-category=\"Main Menu\"]");
    By helpPageContainer= By.cssSelector(".section.hero");

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

}
