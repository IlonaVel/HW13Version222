package someTest;

import Config.BaseClass;
import Config.Browsers;
import Config.DriverConfig;

public class TEST extends BaseClass {
    public static void main(String[] args) {
        BaseClass.driver = DriverConfig.createDriver(Browsers.CHROME);
        driver.get("https://google.com");

    }
}
