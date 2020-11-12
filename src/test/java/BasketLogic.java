import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketLogic {

    By productInBasket = By.xpath("//a[@class='cart-product__title']");

    private final WebDriver driver;
    private final WebDriverWait wait;

    public BasketLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public String productInBasketText() {
        return driver.findElement(productInBasket).getText();
    }
}
