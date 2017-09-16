import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by PTL_PC on 9/16/2017.
 */
public class JenkinDemo {

    @Test
    public void testJenkins(){

        WebDriver webDriver;
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.google.lk/");
        System.out.println("Pass");


    }
}
