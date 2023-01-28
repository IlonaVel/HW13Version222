package HW12;

import Config.BaseClass;
import lesson14.Pageteacher;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TeachersWTest extends BaseClass {
    static PageTeachersW teachers;
    @BeforeClass
    public static void stest() {
        driver.get("https://dnipro.ithillel.ua/");
        teachers = PageFactory.initElements(driver, PageTeachersW.class);
    }
    @Test
    public void test1(){
        teachers.schoolButtonClick();
        teachers.teacherClick();
        teachers.printList();
    }

}



