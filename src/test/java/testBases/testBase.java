package testBases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class testBase {
    public WebDriver driver;

    @BeforeClass
    public void onStart(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.practo.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
