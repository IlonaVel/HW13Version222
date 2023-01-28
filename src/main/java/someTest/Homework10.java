package someTest;

import Config.BaseClass;
import Config.Browsers;
import Config.DriverConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework10 extends BaseClass {
    @BeforeClass
    public static void iniTPage() {
        BaseClass.driver = DriverConfig.createDriver(Browsers.CHROME);
        driver.get("https://www.saucedemo.com/");
    }

   @Test
   public void test1() {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
       driver.findElement(By.id("login-button")).click();
       System.out.println(driver.getTitle());

   }
    @AfterClass
    public static void enD() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

