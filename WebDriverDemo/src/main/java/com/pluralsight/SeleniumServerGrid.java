package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
//ici on test de lancer la page google mais en local via selenium server grid
public class SeleniumServerGrid {
    public static void main(String[] args) throws MalformedURLException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.27:4444/wd/hub"), chromeOptions);

        driver.get("http://www.google.com");
        //  WebDriver driver = new FirefoxDriver();
        // driver.get("http://www.pluralsight.com");
        WebElement searchfield = driver.findElement(By.name("q"));
        searchfield.click();
        searchfield.sendKeys("pluralsight");
        searchfield.sendKeys(Keys.ENTER);

    }
}
