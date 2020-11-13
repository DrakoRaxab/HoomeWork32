import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class HomeWork32 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "D:\\QA Automation\\Rozetka\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = (new WebDriverWait(driver, 5));
        driver.get("https://www.rozetka.com.ua");

    }

    @Test
    public void pageObject() {
        new MainPageLogic(driver, wait).computersAndNotebookMenuClick();
        new ComputersAndNotebooksLogic(driver, wait).notebookImgClick();
        new NotebooksLogic(driver, wait).buyButtonClick();
        new NotebooksLogic(driver, wait).basketClick();
        new NotebooksLogic(driver, wait).basketCounterText();
        new NotebooksLogic(driver, wait).assertTestInNotebooksLogic();
        new NotebooksLogic(driver, wait).assertCountInBasketLogic();


    }

    @AfterMethod
    public void after() {

        driver.quit();
    }
}