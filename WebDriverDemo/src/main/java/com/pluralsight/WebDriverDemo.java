package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WebDriverDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        //  WebDriver driver = new FirefoxDriver();
        // driver.get("http://www.pluralsight.com");
        WebElement searchfield = driver.findElement(By.name("q"));
        searchfield.click();
        searchfield.sendKeys("pluralsight");
        searchfield.sendKeys(Keys.ENTER);

        //explicit wait: coder un retard afin d'etre sur que la page soit bien chargé afinb d'eviter erreur alors que non!
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("images")));


        WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
        imagesLink.click();

        WebElement imagesElement = driver.findElements(By.cssSelector("img[class ='rg_i Q4LuWd']")).get(0);
        imagesElement.click();

        driver.getPageSource().contains("some text you want to search for");


    }
}
