package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PracticeForm {
    By firstName= By.id("firstName");
    By lastName = By.id("lastName");
    By emailAdress = By.id("userEmail");
    By genderWrapper = By.id("genterWrapper");
    By userNumber = By.id("userNumber");

    public PracticeForm(WebDriver driver){
        this.driver = driver;
    }

    WebDriver driver;

    public void setFirstName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }
    public void completeForm(String name, String lastName, String email, String gender, String tel){
        driver.findElement(firstName).sendKeys(name);
        driver.findElement(this.lastName).sendKeys(lastName);
        driver.findElement(emailAdress).sendKeys(email);
        changeGender(gender);
        driver.findElement(userNumber).sendKeys(tel);

    }

    private void changeGender(String gender) {
        List<WebElement> genderListElements=driver.findElement(genderWrapper).findElements(By.tagName("label"));
        for (WebElement l:genderListElements){
            if(l.getText().equals(gender)){
                l.click();
            }
        }
    }
}
