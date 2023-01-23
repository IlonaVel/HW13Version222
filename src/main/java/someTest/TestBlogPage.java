package someTest;

import Config.BaseClass;
import hillel.pageobject.tests.util.BlogPage;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import util.Scrolling;

public class TestBlogPage extends BaseClass {
    static BlogPage blogPage = PageFactory.initElements(driver, BlogPage.class);
    String mainUrl = "https://blog.ithillel.ua/";

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
            if(blogPage.getSizeListNews()>i){
                i=blogPage.getSizeListNews();
                Scrolling.scroll(driver);
                Thread.sleep(1000);
            }else {
                break;
            }
        }

        blogPage.printListNews();

    }
}
