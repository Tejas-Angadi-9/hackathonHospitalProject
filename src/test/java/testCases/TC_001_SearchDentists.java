package testCases;

import org.testng.annotations.Test;
import pageObjects.DentistsPage;
import pageObjects.HomePage;
import testBases.testBase;

public class TC_001_SearchDentists extends testBase {
    @Test
    public void searchingDentists() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        hp.setLocSearchBox().sendKeys("Bangalore");
        hp.setTypeSearchBox().click();
        hp.setDentist();
        Thread.sleep(3000);
    }

    @Test(dependsOnMethods = "searchingDentists")
    public void gettingDentistDetails() throws InterruptedException {
        DentistsPage dp = new DentistsPage(driver);
        dp.setPatientStoriesFilter();
        dp.setFilterFirstOption();
        Thread.sleep(1000);
        dp.setExperienceFilter();
        dp.setExperienceFirstOption(); 
    }
}
