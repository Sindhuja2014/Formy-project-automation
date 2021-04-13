import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium jars and drivers/Drivers/Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.manage().window().maximize();
        WebElement newtabbutton = driver.findElement(By.id("new-tab-button"));
        newtabbutton.click();
        String originalWindowHandle = driver.getWindowHandle();

        for (String WindowHandle1 : driver.getWindowHandles()) {
            driver.switchTo().window(WindowHandle1);
        }
        //System.out.println("Window title"+driver.getTitle());

       driver.switchTo().window(originalWindowHandle);


        driver.quit();
    }
}
