package HWparam13;

import data.UserEnaum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObject.ConsultPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)

public class ParametrCertik extends BaseCertik {
    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Certikenam.values());
    }

    public ParametrCertik(Certikenam certs) {
        //if (bundle1 == null || !bundle1.getString("type1").equals(certs.getType1())) {
            driver.get("https://certificate.ithillel.ua/");
            //driver.findElement(By.id("btn-consultation-hero")).click();
            bundle1 = ResourceBundle.getBundle(certs.getType1());
            certikPage = PageFactory.initElements(driver, CertikPage.class);
        }


    @Test
    public void datacert() {
        certikPage.certikForm(bundle1.getString("certificate"));
       // Assert.assertEquals(bundle1.getString("bol"), String.valueOf(certikPage.messageFalSe()));
       // Assert.assertEquals(bundle1.getString("bol"), String.valueOf(certikPage.messageTruE()));
    }
}
