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
        WebElement inputName = driver.findElement(By.id("user-name"));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
       WebElement inputPass = driver.findElement(By.id("password"));
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
       WebElement clickLog = driver.findElement(By.id("login-button"));
       driver.findElement(By.id("login-button")).click();
       System.out.println(driver.getTitle());

   }
    @AfterClass
    public static void enD() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

