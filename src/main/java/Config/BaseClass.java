//package Config;
//
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.openqa.selenium.WebDriver;
//
//public class BaseClass {
//    static public WebDriver driver;
//    @BeforeClass
//    public static void starT() {
//        driver = DriverConfig.createDriver(Browsers.CHROME);
//    }
//    @AfterClass
//    public static void enD() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.quit();
//    }
//}
package Config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import util.WorkWithFile;
import util.WorkWithLogs;

public class BaseClass {
    static public WebDriver driver;
    @BeforeClass
    public static void starT() {
        driver = DriverConfig.createDriver(Browsers.CHROME);
    }
    @AfterClass
    public static void enD() throws InterruptedException {
        //Thread.sleep(3000);
        //WorkWithLogs.printLogs(driver);
        WorkWithFile.createFile("HW24Ilona", WorkWithLogs.getLogEntries(driver));
        driver.quit();
    }
}