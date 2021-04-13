import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Program Files//Selenium jars and drivers//Drivers//Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        driver.manage().window().maximize();
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
        autocomplete.sendKeys("1155 East Oakton Street, Des Plaines");
        Thread.sleep(1000);

        WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
        autocompleteresult.click();


        driver.quit();
    }
}
