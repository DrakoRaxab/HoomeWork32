import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComputersAndNotebooksLogic {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public ComputersAndNotebooksLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void notebookImgClick() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement notebookImg = driver.findElement(By.xpath("//img[@alt='Ноутбуки']"));
        jse.executeScript("arguments[0].click();", notebookImg);
    }
}
