import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Azurelogin {

    EdgeDriver driver;
    @BeforeTest

        public void OpenBrowser  () throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://login.microsoftonline.com/common/oauth2/authorize?client_id=499b84ac-1321-427f-aa17-267ca6975798&site_id=501454&response_mode=form_post&response_type=code+id_token&redirect_uri=https%3A%2F%2Fspsprodweu5.vssps.visualstudio.com%2F_signedin&nonce=8d69230f-da26-44a8-8d77-bb56a50e3c50&state=realm%3Ddev.azure.com%26reply_to%3Dhttps%253A%252F%252Fdev.azure.com%252FDexefdev0354%252F9AM%252F_workitems%252Frecentlyupdated%252F%26ht%3D2%26hid%3Dc80faabd-5bab-4034-9023-de5a7391a404%26nonce%3D8d69230f-da26-44a8-8d77-bb56a50e3c50&resource=https%3A%2F%2Fmanagement.core.windows.net%2F&cid=8d69230f-da26-44a8-8d77-bb56a50e3c50&wsucxt=1&githubsi=true&msaoauth2=true");

        Thread.sleep(5000,1000);
    }
    @Test
    public void login () throws InterruptedException
    {
        driver.findElement(By.xpath("//input[@name=\"loginfmt\"]")).sendKeys("ahmed.helmy@dexef.net");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        Thread.sleep(9000);
    }
    @Test
    public void logout()
    {
        driver.quit();
    }


}
