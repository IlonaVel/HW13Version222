package someTest;

import Config.BaseClass;
import hillel.pageobject.tests.util.IndexPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TestMainScreen extends BaseClass {
    static IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);

    @BeforeClass
    public static void setUpBeforeMainScreen() {
        driver.get("https://dnipro.ithillel.ua/");
    }

    @Test
    public void blogButtonTest() throws Exception {
        indexPage.blogButtonClick();
        if (!driver.getCurrentUrl().contains("https://blog.ithillel.ua/")) {
            throw new Exception("Url not equals");
        }
    }

    @Test
    public void blogButtonTest2() throws Exception {
        System.out.println(indexPage.getContacts().getShadowRoot());
        indexPage.blogButtonClick();
        if (!indexPage.getBlogButtonText().equals("блог")) {
            throw new Exception("buttontext is not equals");
        }
    }

    @Test
    public void contactsTest() throws Exception {
        indexPage.contactsButtonClick();
        if (!driver.getCurrentUrl().contains("https://dnipro.ithillel.ua/contact")) {
            throw new Exception("Url not equals");

        }
    }
}
