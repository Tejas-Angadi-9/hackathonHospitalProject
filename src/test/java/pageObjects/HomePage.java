package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By locSearchBox = By.xpath("//div[@class='c-omni__wrapper u-clearfix c-omni__wrapper--locality']//div[@class='c-omni-searchbox_wrapper ']/input");

    By typeSearchBox = By.xpath("//div[@class='c-omni__wrapper u-clearfix c-omni__wrapper--keyword']//div[@class='c-omni-searchbox_wrapper ']/input");
    @FindBy(xpath = "//div[@class='c-omni-suggestion-list']/div[2]/div[2]")
    WebElement dentist;

    public WebElement setLocSearchBox(){
        return driver.findElement(locSearchBox);
    }
    public WebElement setTypeSearchBox(){
        return driver.findElement(typeSearchBox);
    }
    public void setDentist(){
        dentist.click();
    }
}
