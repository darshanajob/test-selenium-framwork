package WebsiteTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Mouse;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.landingPage;
import pageObjects.loginPage;
import utils.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class HomePage extends Base {
    public static final Logger LOGGER = LogManager.getLogger(Base.class.getName());
   /* @BeforeTest
    public void invDriver() throws IOException{
        driver = iniDriver();//loading methods from another class using inheritance ex can see from the class
    }*/

    @Test(dataProvider = "getData")
    public void basePageNavi(String username, String password) throws IOException {

        driver=iniDriver();//loading methods from another class using inheritance ex can see from the class
        LOGGER.info("hj");


        driver.get(prop.getProperty("url"));
        //java doesn't support to multiple inheritance
        // another way of accessing another class objects is creating objects to that class
          //landingPage lp = new landingPage(driver);
          //lp.getForgetpw().click(); //this is like driver . findElemaent because we use this method inside getForgetpw method
        loginPage logpage = new loginPage(driver);

        logpage.getEmail().sendKeys(username);
        logpage.getPasword().sendKeys(password);

        if(logpage.getEmail().isDisplayed()){
            if (logpage.getPasword().isDisplayed()){
                logpage.getLogin().click();

                landingPage homep = new landingPage(driver);

            //    homep.getSearch().sendKeys("darshana ariyathilaka",Keys.ENTER);

              //  homep.getsearchName().sendKeys(Keys.ENTER);
           //     homep.getsearchName().sendKeys(Keys.ENTER);

                    //methana balala miss akak diyan

              //  homep.getserbutton().click().build().perform();

             //   homep.getName().click().build().perform();

              //  homep.getName().click();

                homep.getpage().click();

            }else {

                LOGGER.error("something happen");
            }
        }else{
            LOGGER.error("something happen");
        }






    }



    @DataProvider
    public Object[][] getData(){
        // Raw - 1st[] stands for how many test runs this test should run
        // Coloum - 2nd [] these are for values,  ex- this one should runs 2 because it has two objects like username and password

        Object[][] data = new Object[2][2];

        data[0][0] = "daredareya@yahoo.com";
        data[0][1] = "dare520520!@#D";

        data[1][0] = "daredareya@yahoo.com";
        data[1][1] = "dare520520!@#D";

        return data;

    }

    @AfterTest
    public void teardown(){
        driver.close();
    }

}
