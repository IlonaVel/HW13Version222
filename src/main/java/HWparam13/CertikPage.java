package HWparam13;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertikPage {
//    @FindBy(className = "input -text certificate-check_input")
//    WebElement certificate;
//    //xpath = "//*[@name=\"certificate\"]"
//    @FindBy(className = "btn btn-submit -submit certificate-check_submit")
//    WebElement buttoncert;
//    @FindBy(xpath = "//p[@class=\"certificate-check_message\"]")
//    WebElement message;
//    @FindBy(className = "certificate-screen_title hero-title")
//    WebElement truecert;
//    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]")
//    WebElement msg;
//
//
//
//
//    public void certikForm(String certificate) {
//        this.certificate.sendKeys(certificate);
//            buttoncert.click();
//    }
//
//    public String messageFalSe() {
//        return message.getText();
//    }
//
//    public String messageTruE() {
//        return truecert.getText();
//    }

    @FindBy(xpath = "//*[@name=\"certificate\"]")
    static
    WebElement field;
    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]")
    static
    WebElement msg;

    public CertikPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public static boolean checkCER(String number) {
        try {
            field.sendKeys(number);
            field.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
        } catch (ElementNotInteractableException ignore) {

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return !msg.getAttribute("class").contains("invalid");
    }



}
