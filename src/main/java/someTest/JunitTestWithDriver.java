package someTest;

import Config.BaseClass;
import Config.Browsers;
import Config.DriverConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.*;

public class JunitTestWithDriver extends BaseClass {
    By inputYoutube = By.tagName("input");
    @BeforeClass
    public static void starT(){
        BaseClass.driver = DriverConfig.createDriver(Browsers.CHROMEINCOGNITO);
        driver.get("https:youtube.com");
    }
    @Test
    public void test1(){
        if ("YouTube".equals(driver.getTitle())){
            System.out.println("ok "+driver.getTitle());
        } else {
            System.out.println("ERROR "+driver.getTitle());
        }
    }

    @Test
    public void test2(){
        WebElement inputElement = driver.findElement(inputYoutube);
        inputElement.sendKeys("Ukraine");
        //driver.findElement(inputYoutube).submit();
        inputElement.sendKeys(Keys.ENTER);
        System.out.println(driver.getTitle());
    }
    @AfterClass
    public static void enD() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
