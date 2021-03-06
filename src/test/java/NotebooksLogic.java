import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NotebooksLogic {
    By firstProductInCatalog = By.xpath("//a[@class='goods-tile__heading']");
    By buyButton = By.xpath("//button[@class='buy-button goods-tile__buy-button']");
    By basketCounter = By.xpath("//span[@class='header-actions__button-counter']");
    By basket = By.xpath("//a[@class='header-actions__button header-actions__button_type_basket header-actions__button_state_active']");
    By productInBasket = By.xpath("//a[@class='cart-product__title']");

    private final WebDriver driver;
    private final WebDriverWait wait;

    public NotebooksLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public String firstProductInCatalogText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductInCatalog));
        return driver.findElement(firstProductInCatalog).getText();
    }

    public NotebooksLogic buyButtonClick() {
        driver.findElement(buyButton).click();
        return this;
    }

    public String basketCounterText() {
        return driver.findElement(basketCounter).getText();
    }

    public NotebooksLogic basketClick() {
        driver.findElement(basket).click();
        return new NotebooksLogic(driver, wait);
    }

    public String productInBasketText() {
        return driver.findElement(productInBasket).getText();
    }

    public NotebooksLogic assertTestInNotebooksLogic() {
        Assert.assertEquals(basketCounterText(), "1", "В корзине больше одного товара");
        return this;
    }

    public NotebooksLogic assertCountInBasketLogic() {
        Assert.assertEquals(productInBasketText(), firstProductInCatalogText(), "В корзине больше одного товара");
        return this;
    }
}