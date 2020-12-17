package WebsiteTest;
//useless
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.landingPage;
import pageObjects.loginPage;
import utils.Base;

import java.io.IOException;

public class validateNavi extends Base {

    //@BeforeTest
    //public void invDriver() throws IOException{
    //    driver = iniDriver();//loading methods from another class using inheritance ex can see from the class
  //  }
    @Test
    public void basePageNavi() throws IOException {
        driver = iniDriver();//loading methods from another class using inheritance ex can see from the class
        driver.get(prop.getProperty("url"));


        landingPage lp = new landingPage(driver);
     //   Assert.assertTrue(lp.getnavi().isDisplayed());// this assert function expect that arguments to be true otherwise i t fails
     //  Assert.assertTrue(lp.getnavi().isDisplayed(),"works");



    }

    @AfterTest
    public void teardown(){
        driver.close();
    }


}
