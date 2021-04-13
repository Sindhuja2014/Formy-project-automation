import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium jars and drivers/Drivers/Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
        fileUpload.sendKeys("WIN_20141201_184626.jpg");


        driver.quit();
    }
}
