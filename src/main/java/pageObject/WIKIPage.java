package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WIKIPage {
    @FindBy(id = "ca-view")
    WebElement menutab1;
    @FindBy(id = "ca-viewsource")
    WebElement menutab2;
    @FindBy(id = "ca-history")
    WebElement menutab3;

    public String getmenuTabl1text(){
        return menutab1.getText();
    }
    public String getmenuTabl2text(){
        return menutab2.getText();
    }
    public String getmenuTabl3text(){
        return menutab3.getText();
    }

}
