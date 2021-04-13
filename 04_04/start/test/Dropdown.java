import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium jars and drivers/Drivers/Chromedriver/Chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
       // WebElement pageScroll = driver.findElement(By.xpath("/html/body/div/div/div/a[12]"));
        //pageScroll.click();
        WebElement completeFormItem = driver.findElement(By.xpath("/html/body/div/div/div/a[15]"));
        completeFormItem.click();
        
        driver.quit();
    }
}
