package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.http.impl.DefaultContentLengthStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

import javax.swing.*;
public class CubeCartLoginTest {
    public static void main(String[] args) throws InterruptedException {
        
        String username="testautomation1";
        String password="automation123!";
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeDriver=new ChromeOptions();
        //ChromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement paswordFiled=driver.findElement(By.id("password"));
        paswordFiled.sendKeys(password);
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(Long.parseLong(("3000")));     //qatak
        //WebElement logoutLink=driver.findElement(By.cssSelector("i.fa-fa-sign-out"));
        WebElement dashBoard=driver.findElement(By.xpath("//*[@id=\"dashboard\"]/h3"));

       // WebElement LogoutLink = null;
       // if (LogoutLink.isDisplayed()){
        // System.out.println("Login test passed");
            if (dashBoard.getText().equalsIgnoreCase("dashboard"));{
            System.out.println("login test passed!!");
        }
        //else {
            System.out.println("Login test failed");
        }
       // driver.close();
       //driver.quit;     //close all driver instances

    }

