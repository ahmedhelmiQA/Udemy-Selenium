import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.time.Duration;

public class LoginData {
    EdgeDriver driver;
    @BeforeTest
      public void browser()
    {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @DataProvider(name = "Test Data")
    public static Object [] [] Data ()
    {
        return new Object[][]{
        {"tomsmith","SuperSecretPassword!"},
        {"tomsmth","SuperSecretPassword!"},
        {"tomsmith","SuperSeretPassword!"}
        };

    }
    @Test (dataProvider = "Test Data")
    public void validlogin(String user , String password)
    {
        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.className("radius")).click();
    }

}
