package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POHomeWork11 {
        By CourseTitle = By.className("course-cat-bar_descr");
        By CourseRate = By.className("CourseRate");
        By CourseDescription = By.className("profession-bar_descr");

        public POHomeWork11(WebDriver driver) {
                this.driver = driver;
        }

        static WebDriver driver;


                public String getCourseRate()  {
                        return driver.findElement(CourseTitle).getText();

                }

        public String getCourseTitle () {

                return driver.findElement(CourseRate).getText();
        }

        public String getCourseDescription () {

                        return driver.findElement(CourseDescription).getText();
        }

}




