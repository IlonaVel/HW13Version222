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
        driver.get("https://ithillel.ua/courses/java-basic");
        poHomeWork11 = new POHomeWork11(driver);
    }

   @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
    }

    @Test
    public void CourseTitletest1() throws Exception {
        if (!poHomeWork11.getCourseTitle().equals("Курс Java Basic")){
            throw new Exception("coursetitle is not equals");
        }
    }


    @Test
    public void test2() throws Exception {
        if (!poHomeWork11.getCourseDescription().equals("Курс Introduction Java не передбачає ніяких спеціальних знань і навичок, досить мати рівень впевненого користувача ПК.")){
            throw new Exception("description is not equals");
        }
    }
    @Test
    public void test3() throws Exception {
        if (!poHomeWork11.getCourseRate().equals("BASIC LEVEL")){
            throw new Exception("buttontext is not equals");
        }
    }

}



