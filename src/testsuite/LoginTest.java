package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;


public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userSholdLoginSuccessfullyWithValidCredentials() {

        // Finding the username field element
        sendTextToElement(By.id("txtUsername"), "Admin");
        // Finding the password field element
        sendTextToElement(By.id("txtPassword"), "admin123");
        // Finding the login button and clicking on it
        clickOnElement(By.xpath("//input[@id='btnLogin']"));
        verifyElements("Welcome text is not displayed", "Welcome Fathi", By.id("welcome"));
    }

    @After
    public void tearDown() {

        closeBrowser();
    }
}
