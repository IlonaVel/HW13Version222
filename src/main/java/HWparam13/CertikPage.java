package HWparam13;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertikPage {
        @FindBy(xpath = "//input[@name='certificate']")
        WebElement certificate;
        @FindBy(xpath = "//button[contains(@class,\"certificate-check_submit\")]")
        WebElement buttoncert;


        public void certikForm(String certificate) {
            this.certificate.sendKeys(certificate);
            buttoncert.click();
        }
    }

