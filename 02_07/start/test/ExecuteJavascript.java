import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium jars and drivers/Drivers/Chromedriver/Chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");
        WebElement ModalButton = driver.findElement(By.id("modal-button"));
        ModalButton.click();
        //Thread.sleep(1000);
        WebElement CloseButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",CloseButton);

        //System.out.println("Window Title"+Title);

        //Alert alert = driver.switchTo().alert();



        //driver.quit();
    }
}
