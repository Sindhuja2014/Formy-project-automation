import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    private static Object Action;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium jars and drivers/Drivers/Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        driver.manage().window().maximize();
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Sindhuja Rajkumar");
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("04/09/2021");


        driver.quit();
    }
}
