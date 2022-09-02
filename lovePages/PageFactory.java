package lovePages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;
    private Admin admin;
    private Menu menu;
    private Add add;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public Menu getMenu() {
        if (menu == null) {
            menu = new Menu(driver);
        }
        return menu;
    }

    public Admin getAdmin() {
        if (admin == null) {
            admin = new Admin(driver);
        }
        return admin;
    }
    public Add getAdd() {
        if (add == null) {
            add = new Add(driver);
        }
        return add;
    }
}