import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageLogic {
    By computersAndNotebookMenu = By.linkText("Ноутбуки и компьютеры");


    private final WebDriver driver;
    private final WebDriverWait wait;

    public MainPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public MainPageLogic computersAndNotebookMenuClick() {
        driver.findElement(computersAndNotebookMenu).click();
        return this;
    }
}