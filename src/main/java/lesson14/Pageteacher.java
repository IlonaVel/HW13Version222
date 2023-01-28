package lesson14;

import Config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Scrolling;

import java.util.List;

public class Pageteacher extends BaseClass {
    @FindBy(xpath = "//li[@class='block-coaches_item']")
    private List<WebElement> ListTechers;

    private void scrollToEnd(int kol) {
        Scrolling.scroll(driver);
        int i = 0;
        while (true) {
            if (ListTechers.size() > i && i <= kol) {
                i = ListTechers.size();
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
        for (WebElement l:ListTechers){
            String name = l.findElement(By.className("coach-card_name")).getText();
            String spec = l.findElement(By.className("coach-card_spec")).getText();
            System.out.println(name+ "     "+spec);
            //System.out.printf("%-25s : %s", name, spec);
        }
    }
}
