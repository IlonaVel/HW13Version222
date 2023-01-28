package lesson14;

import Config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TeachersTest extends BaseClass {
    static Pageteacher teacher;
    @BeforeClass
    public static void stest() {
        driver.get("https://ithillel.ua/coaches");
        teacher = PageFactory.initElements(driver, Pageteacher.class);
    }
        @Test
        public void test1(){
            teacher.printList();
        }

    }


