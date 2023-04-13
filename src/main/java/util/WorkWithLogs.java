package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.Date;

public class WorkWithLogs  {
    public static void printLogs(WebDriver webDriver){
    LogEntries logEntries = webDriver.manage().logs().get(LogType.BROWSER);
    for (LogEntry entry: logEntries){
        System.out.println(new Date(
                entry.getTimestamp()) + ""+entry.getLevel()+ " "+ entry.getMessage()
        );
    }
}
public static LogEntries getLogEntries (WebDriver webDriver){
    //LogEntries logEntries = webDriver.manage().logs().get(LogType.BROWSER);
   return webDriver.manage().logs().get(LogType.BROWSER);
}
}
