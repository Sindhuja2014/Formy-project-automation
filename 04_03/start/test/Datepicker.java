import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Program Files//Selenium jars and drivers//Drivers//Chromedriver//Chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.manage().window().maximize();

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("04/20/2022");
        dateField.sendKeys(Keys.RETURN);

        driver.quit();
    }
}