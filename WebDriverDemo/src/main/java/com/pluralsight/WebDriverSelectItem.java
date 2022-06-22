package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItem {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\BROCODE\\JAVA-WorkSpace\\WebDriverDemo\\src\\main\\webApp\\SelectitemTest.html");

        WebElement selectElement = driver.findElement(By.id("select1"));
        //ici on utilise le package select qui permet de récup une valeur ou un text ou encore des truc, c PRATIQ !
        Select select = new Select(selectElement);
        // select.selectByVisibleText("No F***** Way !");
        // select.selectByIndex(0);
        select.selectByValue("maybe");



    }
}
