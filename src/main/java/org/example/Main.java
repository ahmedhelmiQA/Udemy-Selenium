package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
/*
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://chat.openai.com");
        driver.manage().window().maximize();

      driver.navigate().to("https://dev.azure.com/Dexefdev0354/9AM/_testPlans/execute?planId=5992&suiteId=6108");
      driver.navigate().back();
      driver.navigate().forward();
      driver.manage().window().minimize();
        String url = driver.getWindowHandle();

         System.out.println(url);
       //  driver.quit();

 */
  /*
                          //// findElement(By.name + className //
        WebDriver driver = new EdgeDriver();
       driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        //WebElement login = driver.findElement(By.className("radius"));
        WebElement login = driver.findElement(By.className("fa"));
        login.click();
        driver.quit();

   */

 /*
        WebDriver driver = new EdgeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/login");
                            // By.id //
        driver.findElement(By.id("username")).sendKeys("tomsmith");
                             // By.name //
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
                             // By.className //
        driver.findElement(By.className("radius")).click();

        //driver.findElement(By.linkText("Elemental Selenium")).click();
        driver.findElement(By.partialLinkText("Elemental")).click();
        //driver.quit();

  */


        WebDriver driver = new EdgeDriver();
/*
        driver.navigate().to("https://the-internet.herokuapp.com/login");
                           // By.id //
        driver.findElement(By.id("username")).sendKeys("tomsmith");
                          // By.name  //
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

                              //By.cssSelector// 
       // driver.findElement(By.cssSelector("button[type=submit]")).click();

                           // By.xpath //
        //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

                           //By.cssSelector//  by parent
       // driver.findElement(By.cssSelector("form>button[type=\"submit\"]")).click();

                            // By.xpath //    by parent
       // driver.findElement(By.xpath("//form//button[@type=\"submit\"]")).click();

                               // By.xpath //    by parent & id
      //  driver.findElement(By.xpath("//form[@id=\"login\"]//button[@type=\"submit\"]")).click();

       // driver.quit();

 */
 //driver.navigate().to("https://www.office.com/?auth=1");
//          driver.findElement(By.id("ms-searchux-input-0")).sendKeys("ahmed.helmy@dexef.net");

/*
                      //WebElement DropDown //

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        WebElement DropDown = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
        Select select = new Select(DropDown);
        select.selectByIndex(1);
        select.selectByValue("1");
        select.deselectByVisibleText("Option 1");

        driver.findElement(By.linkText("Elemental Selenium")).click();

 */
/*
                              // right click
        driver.navigate().to("https://the-internet.herokuapp.com/context_menu");
        WebElement right = driver.findElement(By.xpath("//div[@id=\"hot-spot\"]"));
        Actions actions = new Actions(driver);
        actions.contextClick(right).perform();
*/
                               // double click
//        WebElement doublee = driver.findElement(By.xpath("//p[@id='message']"));
//        Actions actions = new Actions(driver);
//        actions.doubleClick(doublee).perform();
                             // move    ////
//        WebElement trigger = driver.findElement(By.xpath("//p[@id='message']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(trigger).perform();


/*
                                 /// checkbox
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
      WebElement check = driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]"));
                            // check for if the checkbox select or no
        boolean checked = check.isSelected();
        System.out.println(checked);
*/
/*
                         //// dragAndDrop
        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement source = driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
        WebElement dest = driver.findElement(By.xpath("//div[@id=\"column-b\"]"));
        Actions actions = new Actions(driver);
       actions.dragAndDrop(source,dest).perform();
       driver.quit();
*/

      /*
                       /// clickAndHold
        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement source = driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
        WebElement dest = driver.findElement(By.xpath("//div[@id=\"column-b\"]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(source).moveToElement(dest).release().build().perform();

 */
 /*
                                    /// window Handle
        driver.navigate().to("https://the-internet.herokuapp.com/windows");
        String main = driver.getWindowHandle();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> allwindows = driver.getWindowHandles(); // main + new windows + ...
        for (String s : allwindows) //2
        {
            if (!s.equals(main));
            driver.switchTo().window(s);
        }
        String windowsText = driver.findElement(By.tagName("h3")).getText();
        System.out.println(windowsText);
        driver.switchTo().window(main);
        String maintext = driver.findElement(By.tagName("h3")).getText();
        System.out.println(maintext);

  */
/*
                                  //// IFRAME
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.xpath("//body[@id=\"tinymce\"]")).sendKeys("Ahmed helmi");
 */
/*
                  /// nested_frames
        driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String left = driver.findElement(By.tagName("body")).getText();
        System.out.println(left);
                                         // middle
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        String middle = driver.findElement(By.id("content")).getText();
        System.out.println(middle);
        driver.switchTo().parentFrame();
*/
/*
                            /// Alert
        driver.navigate().to("https://the-internet.herokuapp.com/context_menu");
       WebElement rightclick = driver.findElement(By.xpath("//div[@id=\"hot-spot\"]"));
       Actions actions = new Actions(driver);
        actions.contextClick(rightclick).perform();
         String alert = driver.switchTo().alert().getText();
        System.out.println(alert);
 */

        driver.navigate().to("https://login.microsoftonline.com/common/oauth2/authorize?client_id=499b84ac-1321-427f-aa17-267ca6975798&site_id=501454&response_mode=form_post&response_type=code+id_token&redirect_uri=https%3A%2F%2Fspsprodweu5.vssps.visualstudio.com%2F_signedin&nonce=8d69230f-da26-44a8-8d77-bb56a50e3c50&state=realm%3Ddev.azure.com%26reply_to%3Dhttps%253A%252F%252Fdev.azure.com%252FDexefdev0354%252F9AM%252F_workitems%252Frecentlyupdated%252F%26ht%3D2%26hid%3Dc80faabd-5bab-4034-9023-de5a7391a404%26nonce%3D8d69230f-da26-44a8-8d77-bb56a50e3c50&resource=https%3A%2F%2Fmanagement.core.windows.net%2F&cid=8d69230f-da26-44a8-8d77-bb56a50e3c50&wsucxt=1&githubsi=true&msaoauth2=true");
       Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name=\"loginfmt\"]")).sendKeys("ahmed.helmy@dexef.net");
       driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();


    }
}