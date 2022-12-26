package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //define driver --chromedriver
        System.setProperty("webdriver.chrom.driver","c:\\webdriver\\chromedriver");
        WebDriver chromeDriver=new ChromeDriver();
        //open amazon home page
        chromeDriver.get("https://www.amazon.co.jp/");
        //chromeDriver.navigate().to("https://www.amazon.co.jp/");

        //set browser size
        chromeDriver.manage().window().maximize();
        WebElement searchBox=chromeDriver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Airpod"+Keys.ENTER);
        chromeDriver.close();


    }
}
