package com.pluralsight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\BROCODE\\JAVA-WorkSpace\\WebDriverDemo\\src\\main\\webApp\\Tabletest.html");

        WebElement outerTable = driver.findElement(By.tagName("table"));
        WebElement innerTable = outerTable.findElement(By.tagName("table"));
        WebElement row = innerTable.findElement(By.tagName("td"));
        System.out.println(row.getText());

    // ici on va utiliser xpath c facil on ouvre l'inspect on selectionne la balise clique droit/ copy/copy xpath

        WebElement row2 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
        System.out.println(row2.getText());
    }
}
