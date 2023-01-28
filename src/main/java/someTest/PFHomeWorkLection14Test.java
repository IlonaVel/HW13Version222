package someTest;

import Config.BaseClass;
import hillel.pageobject.tests.util.BlogPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageObject.PFHomeWork12Lection14;
import util.Scrolling;

import static Config.BaseClass.driver;

public class PFHomeWorkLection14Test extends BaseClass {
    static PFHomeWork12Lection14 blogteachers = PageFactory.initElements(driver, PFHomeWork12Lection14.class);
    String mainUrl = "https://dnipro.ithillel.ua/";

    @Before
    public void setUpBeforeMainScreen() {
        if (!driver.getCurrentUrl().contains(mainUrl)) {
            driver.get(mainUrl);
        }
    }

    @Test
    public void schoolText() throws Exception {
        if (!blogteachers.getCschoolButton().equals("школа")) {
            throw new Exception("coursetitle is not equals");
        }
    }

    @Test
    public void blogButtonTest() {
        blogteachers.schoolButtonClick();
    }

    @Test
    public void schoolButtonTest() throws Exception {
        blogteachers.schoolButtonClick();
        blogteachers.teacherClick();
       if (!driver.getCurrentUrl().contains("https://dnipro.ithillel.ua/coaches")) {
            throw new Exception("Url not equals");
        }
    }

            @Test
            public void test1 () throws InterruptedException {
               blogteachers.schoolButtonClick();
               blogteachers.teacherClick();
                int i = 0;
                while (true) {
                    if (blogteachers.getSizeListteachers() > i) {
                        i = blogteachers.getSizeListteachers();
                        Scrolling.scroll(driver);
                        Thread.sleep(1000);
                    } else {
                        break;
                    }
                }

                blogteachers.printListTeachers();

            }


        }





