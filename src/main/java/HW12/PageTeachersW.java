package HW12;

import Config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Scrolling;

import java.util.List;

public class PageTeachersW extends BaseClass {
    @FindBy(xpath = "//li[contains(@class,\"site-nav-menu_item -submenu\")]/button[@class=\"site-nav-link\" and contains(text(), \"Школа\")]")
    WebElement schoolButton;


    @FindBy(xpath = "//a[contains(@class, \"site-nav-dropdown_link\") and contains(text(), \"Викладачі\")]")
    WebElement teacherButton;

    @FindBy(xpath = "//li[@class=\"block-coaches_item\"]")
    private List<WebElement> listteachers;


    public void schoolButtonClick(){
        schoolButton.click();
    }

    public void teacherClick(){
        teacherButton.click();
    }

    private void scrollToEnd(int kol) {
        Scrolling.scroll(driver);
        int i = 0;
        while (true) {
            if (listteachers.size() > i && i <= kol) {
                i = listteachers.size();
                Scrolling.scroll(driver);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }
        }
    }

    public void printList(){
        scrollToEnd(30);
        for (WebElement l:listteachers){
            String name = l.findElement(By.className("coach-card_name")).getText();
            String spec = l.findElement(By.className("coach-card_spec")).getText();
            System.out.println(name+ "     "+spec);
        }
    }


}
