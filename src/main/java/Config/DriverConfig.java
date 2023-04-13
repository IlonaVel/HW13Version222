//package Config;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class DriverConfig {
//    private static WebDriver driver;
//
//    public static WebDriver createDriver(Browsers browsers) {
//        if (driver == null) {
//            switch (browsers) {
//                //case CHROME -> createChrome();
//                case CHROME:
//                    createChrome();
//                    break;
//                case CHROMEINCOGNITO:
//                    createChromeIncognito();
//               case CHROMEPROXY:
//                    break;
//
//            }
//
//        }
//        return driver;
//    }
//
//
//
//    private static void createChromeIncognito() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");//open chrome in incognito made
//        options.addArguments("--start-maximized");//open chrome in window max
////            options.addArguments("--headless");//headlessmode
//        driver=new ChromeDriver(options);
//    }
//
//
//    private static void createChrome() {
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//}

package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.log.Log;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Level;

public class DriverConfig {
    private static WebDriver driver;

    public static WebDriver createDriver(Browsers browsers) {
        if (driver == null) {
            switch (browsers) {
                //case CHROME -> createChrome();
                case CHROME:
                    createChrome();
                    break;
                case CHROMEINCOGNITO:
                    createChromeIncognito();
//                case CHROMEPROXY:
//                    break;
                case CHROMELOGS: chromeWithLogsOptions();
            }

        }
        return driver;
    }



    private static void createChromeIncognito() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");//open chrome in incognito made
        options.addArguments("--start-maximized");//open chrome in window max
//            options.addArguments("--headless");//headlessmode
        driver=new ChromeDriver(options);
    }


//    private static void createChrome() {
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//    }

    private static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
//            options.addArguments("--headless");
        driver = new ChromeDriver(options);

    }
    private static void chromeWithLogsOptions(){
        LoggingPreferences prefs = new LoggingPreferences();
        prefs.enable(LogType.BROWSER, Level.ALL);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.LOGGING_PREFS, prefs);
        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
    }
}
