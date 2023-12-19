import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class a {
    EdgeDriver driver;
@BeforeTest
        public void user_navigates_to_login_page() {
    WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }


}
