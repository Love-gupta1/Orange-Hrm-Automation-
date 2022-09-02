package lovePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Admin {
    static WebDriver driver;
    By Add = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
   // By UserRole = By.xpath("//div[@Class='oxd-select-text oxd-select-text--active']");
   // By EmployeeName=By.xpath("//div[@Class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']");
   // By Status=By.xpath("//div[@Class='oxd-select-text-input']");
    By userName = By.xpath("//input[@name='username']");
    By password = By.name("password");
   // By confirmpassword = By.name("confirmpassword");
    By save = By.xpath("//button");

    public Admin (WebDriver driver) {
        this.driver = driver;
    }


    public void login() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(Add).click();
      //  driver.findElement(UserRole).sendKeys("Admin");
     //   driver.findElement(EmployeeName).sendKeys("Love");
       // driver.findElement(Status).sendKeys("Enabled");
        driver.findElement(userName).sendKeys("Lovel");
        driver.findElement(password).sendKeys("High@4321");
       // driver.findElement(confirmpassword).sendKeys("High@4321");

        driver.findElement(save).click();

    }

}


