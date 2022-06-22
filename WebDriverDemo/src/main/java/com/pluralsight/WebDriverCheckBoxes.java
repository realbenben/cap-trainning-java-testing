package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\BROCODE\\JAVA-WorkSpace\\WebDriverDemo\\src\\main\\webApp\\CheckBoxTest.html");

        WebElement checkbox = driver.findElement(By.id("lettuceCheckBox"));
        checkbox.click();
        //repeter le click ici a effectuer l'ation plusieurs fois au dessus on click en dessous declic clic !
        checkbox.click();
        checkbox.click();
    }
}
