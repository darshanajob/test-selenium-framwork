package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {


    public WebDriver driver;//this doesn't have life means it doesn't have chrome driver

    By Email = By.cssSelector("input[id='email']");// capturing all the objects of the landing page
    By Password = By.cssSelector("[type='password']");
    By login = By.cssSelector("[value='Log In']");

    public loginPage(WebDriver driver) {//this driver is coming from the base class which has life(means it has chrome driver)
        this.driver = driver;//adding base class driver to this driver this.driver refer to this driver
    }

    public WebElement getEmail() {
        return driver.findElement(Email);

    }

    public WebElement getPasword() {
        return driver.findElement(Password);

    }
    public WebElement getLogin() {
        return driver.findElement(login);

    }
}
