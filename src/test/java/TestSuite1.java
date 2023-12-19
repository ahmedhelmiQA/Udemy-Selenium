import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSuite1 {
    EdgeDriver driver;
    @BeforeTest (groups = "signing")
    public void OpenBrowser()
    {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

    }
    SoftAssert softAssert = new SoftAssert();

    @Test (priority = 1,groups = "signing")
    public  void login()
    {
        WebElement username =  driver.findElement(By.name("username"));
                //// clear
        username.clear();
        username.sendKeys("tomsmith");

        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.className("radius")).click();

        String expected = "You logged into a secure area!";
        String actual = driver.findElement(By.xpath("//div[@id=\"flash-messages\"]")).getText();

                              /// Assert.assertFalse //
       // softAssert.assertFalse(actual.contains(expected));
                                /// Assert.assertTrue //
       softAssert.assertTrue(actual.contains(expected));

                               //// Assert.assertEquals //
       // softAssert.assertEquals(actual,expected);
        softAssert.assertAll();
    }
    @Test (priority = 2,groups = "signing")
    public void logout()
    {
        driver.get("https://the-internet.herokuapp.com/secure");
        driver.findElement(By.xpath("//a[@class=\"button secondary radius\"]")).click();
    }

                                // dependsOnMethods تعتمد على تست كيس اخرى
    @Test (priority = 3,dependsOnMethods = "logout")
    public void invalidlogin () {
       WebElement username =  driver.findElement(By.name("username"));
       username.clear();
       username.sendKeys("tomith");

        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.className("radius")).click();

        ////////////////// Assert.assertFalse //
        String expected = "You logged into a secure area!";
        String actual = driver.findElement(By.xpath("//div[@id=\"flash\"]")).getText();
        Assert.assertFalse(actual.contains(expected));
    }
    @Test (priority = 4,groups = "signing")
    public void link()
    {
        driver.findElement(By.linkText("Elemental Selenium")).click();

    }
    @AfterTest (groups = "signing")
    public void quite() {
        driver.quit();
    }


}
