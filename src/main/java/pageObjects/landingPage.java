package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class landingPage  {

    public WebDriver driver;//this doesn't have life means it doesn't have chrome driver

   // By Forgetpw = By.linkText("Forgotten account?");// capturing all the objects of the landing page
   //By navi = By.xpath("//*[@id=\"u_0_a\"]");
    By name = By.xpath("//a[@class='_2s25 _606w']");
     By page = By.xpath("//a[@class='_2s25']");
  //   By  userp= By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a");
  //  By search = By.xpath("//input[@id='js_15g']");
   // By serbutt = By.xpath("//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy']");
   By search = By.xpath("//input[@name='q']");
   By serbutton = By.cssSelector("[class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97']");
   // By searchName = By.linkText("Darshana Ariyathilaka (China)");

    By searchName = By.xpath("//*[@id=\"js_2f\"]/div");




    public landingPage(WebDriver driver) {//this driver is coming from the base class which has life(means it has chrome driver)
        this.driver = driver;//adding base class driver to this driver this.driver refer to this driver
    }

    public WebElement getSearch() {
        return driver.findElement(search);

    }

    public Actions getsearchName() {
        Actions actsa= new Actions(driver);

        return actsa.moveToElement(driver.findElement(searchName));

    }

    public Actions getserbutton() {
        Actions act= new Actions(driver);
       return act.moveToElement(driver.findElement(serbutton));

    }

    public Actions getpage() {
        Actions actname= new Actions(driver);
        return actname.moveToElement(driver.findElement(page));

    }





}
