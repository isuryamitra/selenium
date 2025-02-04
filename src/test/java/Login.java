
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Login {

WebDriver driver=null;
    @BeforeSuite
    public void config()
    {
        //WebDriverManager.chromedriver().driverVersion("113.0.5672.63").setup();
        WebDriverManager.edgedriver().setup();

        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();

        // Open a URL

    }

    @Test
    public void openUrl() throws InterruptedException {
        driver.get("https://www.example.com");
        driver.findElement(By.xpath("//a[text()='More information...']")).click();
        Thread.sleep(5000);

    }
}
