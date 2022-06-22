package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //ici on localise une adresse de site mais en local
        driver.get("C:\\BROCODE\\JAVA-WorkSpace\\WebDriverDemo\\src\\main\\webApp\\RadioButtontest.html");
        // la list ici nous sert a selectionner une valeur sur le bouton radio
        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();

        for (WebElement radioButton : radioButtons){
            if (radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }else {
                System.out.println("ERROR 404 !");
            }
        }
    }
}
