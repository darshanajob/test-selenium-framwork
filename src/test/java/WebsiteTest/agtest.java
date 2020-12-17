package WebsiteTest;
//useless
import org.testng.annotations.Test;
import pageObjects.landingPage;
import utils.Base;

import java.io.IOException;

public class agtest extends Base {

    @Test
    public void clicktest() throws IOException {
        driver = iniDriver();//loading methods from another class using inheritance ex can see from the class
        driver.get(prop.getProperty("url"));

        landingPage lp = new landingPage(driver);

      //  lp.getpath().click();
    }

}
