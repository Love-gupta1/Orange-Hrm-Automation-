package lovePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add {
    WebDriver driver;
    By admin= By.xpath("(//button[contains(@class, 'oxd-button--medium')])[3]");
    public Add(WebDriver driver){
        this.driver=driver;
    }
    public void add(){
        driver.findElement(admin).click();
    }
}
