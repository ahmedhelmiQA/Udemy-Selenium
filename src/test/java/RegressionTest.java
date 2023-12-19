import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegressionTest {
        EdgeDriver driver;
        @BeforeTest
        public void OpenBrowser()
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.get("https://the-internet.herokuapp.com/login");

        }
        @Test
        public  void validlogin()
        {
            driver.findElement(By.name("username")).sendKeys("tomsmith");

            driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

            driver.findElement(By.className("radius")).click();

        }


    @Test
    public  void invalidlogin()
    {
        driver.findElement(By.name("username")).sendKeys("tomsmimth");

        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.className("radius")).click();

    }
        @Test
        public void logout()
        {
            driver.get("https://the-internet.herokuapp.com/secure");
            driver.findElement(By.xpath("//a[@class=\"button secondary radius\"]")).click();
        }

    }
