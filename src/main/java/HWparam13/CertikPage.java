package HWparam13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertikPage {
    @FindBy(className = "input -text certificate-check_input")
    WebElement certificate;
    @FindBy(className = "btn btn-submit -submit certificate-check_submit")
    WebElement buttoncert;
    @FindBy(xpath = "//p[@class=\"certificate-check_message\"]")
    WebElement message;
    @FindBy(className = "certificate-screen_title hero-title")
    WebElement truecert;




    public void certikForm(String certificate) {
        this.certificate.sendKeys(certificate);
            buttoncert.click();
    }

    public String messageFalSe() {
        return message.getText();
    }

    public String messageTruE() {
        return truecert.getText();
    }
}
