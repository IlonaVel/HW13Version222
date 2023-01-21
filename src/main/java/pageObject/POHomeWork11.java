package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POHomeWork11 {
        By CourseTitle = By.xpath("//span[@class=\"course-descriptor_header-text\"]");
        By CourseRate = By.xpath("//span[@class=\"course-descriptor_level c-basic\"]");
        By CourseDescription = By.xpath("//div[@class=\"introduction-sidebar-widget_content\"]");

        public POHomeWork11(WebDriver driver) {
                this.driver = driver;
        }

        static WebDriver driver;


        public void clickTitle () {
                driver.findElement(CourseTitle).click();
        }

                public String getCourseRate()  {
                        return driver.findElement(CourseRate).getText();

                }

        public String getCourseTitle () {

                return driver.findElement(CourseTitle).getText();
        }

        public String getCourseDescription () {

                        return driver.findElement(CourseDescription).getText();
        }

}




