package someTest;

import Config.BaseClass;
import Config.Browsers;
import Config.DriverConfig;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObject.POHomeWork11;
import pageObject.PracticeForm;

public class TestHomeWork11 extends BaseClass {
    static POHomeWork11 poHomeWork11;

    @BeforeClass
    public static void initial() {
        BaseClass.driver = DriverConfig.createDriver(Browsers.CHROME);
        driver.get("https://ithillel.ua/courses");
        poHomeWork11 = new POHomeWork11(driver);
    }

    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
    }

    @Test
    public void test1(){
        poHomeWork11.getCourseTitle();
        poHomeWork11.clickTitle();
        poHomeWork11.getCourseDescription();
        poHomeWork11.getCourseRate();
    }

    }


