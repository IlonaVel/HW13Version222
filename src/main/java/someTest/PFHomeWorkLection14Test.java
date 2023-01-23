package someTest;

import Config.BaseClass;
import hillel.pageobject.tests.util.BlogPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import util.Scrolling;

import static Config.BaseClass.driver;

public class PFHomeWorkLection14Test extends BaseClass {
    static PFHomeWorkLection14 blogteachers = PageFactory.initElements(driver, PFHomeWorkLection14.class);
    String mainUrl = "https://dnipro.ithillel.ua/";

    @Before
    public void setUpBeforeMainScreen() {
        if (!driver.getCurrentUrl().contains(mainUrl)) {
            driver.get(mainUrl);
        }
    }

    @Test
    public void test1() throws InterruptedException {
        int i=0;
        while(true){
            if(blogteachers.getSizeListteachers()>i){
                i=blogteachers.getSizeListteachers();
                Scrolling.scroll(driver);
                Thread.sleep(1000);
            }else {
                break;
            }
        }

        blogteachers.printListteachers();

    }


    }



