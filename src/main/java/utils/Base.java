package utils;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;//can access this from anywhere from this class or reassign values from anywhere (ex 1)
    public Properties prop;
    public static final Logger LOGGER = LogManager.getLogger(Base.class.getName());
    public WebDriver iniDriver() throws IOException {


        prop=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\dare\\IdeaProjects\\FrameworkFinal\\src\\main\\java\\utils\\comoum_data.properties");//this method is use to locate the properties file path
        prop.load(fis);// this is how to merge two objects
        String browsername = prop.getProperty("browser");

        if(browsername.equals("chrome")){ 
            System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
             driver = new ChromeDriver();//

        }else if(browsername.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
            driver = new FirefoxDriver();//
        }else{
            System.out.println("eat");
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
    public void getscreenshot(String result) throws IOException{ 
       File scr=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       //FileUtils.copyFile(scr, new File("C://Screen//screenshot.png"));
       FileUtils.copyFile(scr, new File("C://Screen//"+result+"screenshot.png"));
    }

}
