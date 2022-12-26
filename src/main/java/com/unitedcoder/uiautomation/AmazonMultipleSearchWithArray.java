package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonMultipleSearchWithArray {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeDriver=new ChromeOptions();
       // ChromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver();

        DateTime browserOpenedTime=new DateTime();

        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        String[] productName={"ipad","java oracle book","hard disk"};

for (String keyWords:productName) {
    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
    searchBox.sendKeys(keyWords + Keys.ENTER);
    driver.navigate().back();

}       DateTime testEndTime=new DateTime();
        Period period=new Period(browserOpenedTime,testEndTime, PeriodType.seconds());
        System.out.println("Total Search time:"+period.getSeconds());
driver.close();
driver.quit();

    }
}
