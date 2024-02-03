package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DentistsPage extends BasePage{

    public DentistsPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    @FindBy(xpath = "//div[@class='c-filter__top']//div[2]")
    WebElement PatientStoriesFilter;

    @FindBy(xpath = "//div[@class='c-filter__box u-pos-rel c-dropdown open']//ul[@role='listbox']/li[1]/span")
    WebElement PatientStoriesFirstOption;
    @FindBy(xpath = "//div[@class='c-filter__box u-pos-rel c-dropdown open']//ul[@role='listbox']/li[2]/span")
    WebElement PatientStoriesSecondOption;
    @FindBy(xpath = "//div[@class='c-filter__box u-pos-rel c-dropdown open']//ul[@role='listbox']/li[3]/span")
    WebElement PatientStoriesThirdOption;

    @FindBy(xpath = "//div[@class='c-filter__box u-pos-rel c-dropdown'][3]")
    WebElement experienceFilter;
    @FindBy(xpath = "//ul[@class='c-dropdown__list']/li[1]")
    WebElement experienceFirstOption;

    // Actions
    public void setPatientStoriesFilter(){
        PatientStoriesFilter.click();
    }

    public void setFilterFirstOption(){
        PatientStoriesFirstOption.click();
    }
    public void setFilterSecondOption(){
        PatientStoriesSecondOption.click();
    }
    public void setFilterThirdOption(){
        PatientStoriesThirdOption.click();
    }
    public void setExperienceFilter(){
        experienceFilter.click();
    }
    public void setExperienceFirstOption(){
        experienceFirstOption.click();
    }
}
