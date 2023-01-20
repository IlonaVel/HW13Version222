package someTest;

import Config.BaseClass;
import Config.Browsers;
import Config.DriverConfig;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.PracticeForm;

public class PracticeTest extends BaseClass {
    static PracticeForm practiceForm;

    @BeforeClass
    public static void initial() {
        BaseClass.driver = DriverConfig.createDriver(Browsers.CHROME);
        driver.get("https://demoqa.com/automation-practice-form");
        practiceForm = new PracticeForm(driver);
    }
    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
    @Test
    public void test1(){
        practiceForm.setFirstName("Ilosha");
    }
    @Test
    public void  test2(){
        practiceForm.completeForm("Ilona", "Vel", "ilona1717@gmail.com", "Male", "0968754542");
    }
}
