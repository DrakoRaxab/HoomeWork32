//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//public class BasketLogic {
//
//    By productInBasket = By.xpath("//a[@class='cart-product__title']");
//
//    private final WebDriver driver;
//    private final WebDriverWait wait;
//
//    public BasketLogic(WebDriver driver, WebDriverWait wait) {
//        this.driver = driver;
//        this.wait = wait;
//    }
//
//    public String productInBasketText() {
//        return driver.findElement(productInBasket).getText();
//    }
//
//    public String assertFirstProductInCatalogText() {
////        driver.findElement(firstProductInCatalogText()).click();
//        return new NotebooksLogic(driver, wait).firstProductInCatalogText();
//    }
//
//    public BasketLogic assertCountInBasketLogic() {
////        driver.findElement(buyButton).click();
//        Assert.assertEquals(productInBasketText(), assertFirstProductInCatalogText(), "В корзине больше одного товара");
//        return this;
//    }
////    Assert.assertEquals(notebooksLogic.firstProductInCatalogText(), basketLogic.productInBasketText(), "Товар в корзине отличается от товара из каталога");
//}
//NotebooksLogic notebooksLogic=new NotebooksLogic(driver,wait);