package parametrizedtest;

import Config.BaseClass;
import Config.WIKIPARAMETRAZIDbase;
import data.WIKILanguage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pageObject.WIKIPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)

public class WIKItest extends WIKIPARAMETRAZIDbase {
   // static WIKILanguage lang;
   // ResourceBundle bundle;
    //WIKIPage wikiPage;

    @Parameterized.Parameters
    public static Collection options (){
        return Arrays.asList(WIKILanguage.values());
    }

    public WIKItest(WIKILanguage language) {
        System.out.println("start");
        bundle = ResourceBundle.getBundle(language.getLang());
        if (!driver.getCurrentUrl().contains("https://" + bundle.getString("lang") + ".wikipedia.org/")) {
            driver.get("https://" + bundle.getString("lang") + ".wikipedia.org/");
            wikiPage = PageFactory.initElements(driver, WIKIPage.class);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void test1(){
        Assert.assertEquals(bundle.getString("menutab1"),wikiPage.getmenuTabl1text());
    }

    @Test
    public void test2(){
        Assert.assertEquals(bundle.getString("menutab2"),wikiPage.getmenuTabl2text());
    }

    @Test
    public void test3(){
        Assert.assertEquals(bundle.getString("menutab3"),wikiPage.getmenuTabl3text());
    }




}
