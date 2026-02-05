package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google {

    private final By googleSearchInput = By.name("q");


    private final WebDriver driver;

    public Google(WebDriver driver){
        this.driver = driver;
    }
     public void searchText(String text){
        WebElement searchBox = driver.findElement(googleSearchInput);
        searchBox.sendKeys(text);
        searchBox.sendKeys(Keys.ENTER);
     }

}
