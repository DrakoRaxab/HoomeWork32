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
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Hillel\\urok18\\driver\\chromedriver.exe");
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

        BasketLogic basketLogic = new BasketLogic(driver, wait);
        NotebooksLogic notebooksLogic = new NotebooksLogic(driver, wait);

//        String title = basketLogic.productInBasketText();
//        System.out.println(title);

        Assert.assertEquals(notebooksLogic.basketCounterText(), "1", "В корзине больше одного товара");
//        System.out.println(notebooksLogic.basketCounterText());

        Assert.assertEquals(notebooksLogic.firstProductInCatalogText(), basketLogic.productInBasketText(), "Товар в корзине отличается от товара из каталога");
        System.out.println(notebooksLogic.firstProductInCatalogText() + " - " + basketLogic.productInBasketText());

    }

    @AfterMethod
    public void after() {

        //driver.quit();
    }
}