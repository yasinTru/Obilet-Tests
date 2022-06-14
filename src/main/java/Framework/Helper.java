package Framework;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Helper {

    WebDriver driver;
    WebDriverWait wait;

    public Helper(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);

    }

    public WebElement findElement(By elementName)
    {
        return
        driver.findElement(elementName);
    }

}
