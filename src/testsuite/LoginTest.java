package testsuite;

import org.checkerframework.checker.units.qual.A;
import org.junit.*;
import org.openqa.selenium.By;
import utility.Utility;

public class LoginTest extends Utility {

    String baseurl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);

    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        sendTextToElement(By.xpath("//input[@id='user-name']"), "standard_user");
        sendTextToElement(By.xpath("//input[@id='password']"), "secret_sauce");
        clickOnElement(By.xpath("//input[@id='login-button']"));
        clickOnElement(By.xpath("//span[normalize-space()='Products']"));
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        sendTextToElement(By.xpath("//input[@id='user-name']"), "standard_user");
        sendTextToElement(By.xpath("//input[@id='password']"), "secret_sauce");
        clickOnElement(By.xpath("//input[@id='login-button']"));
        String actualMsg = verifyText(By.xpath("//div[normalize-space()='Sauce Labs Backpack']"));
        Assert.assertEquals("Sauce Labs Backpack", actualMsg);

        String actualMsg1 = verifyText(By.xpath("//div[normalize-space()='Sauce Labs Bike Light']"));
        Assert.assertEquals("Sauce Labs Bike Light", actualMsg1);

        String actualMsg2 = verifyText(By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']"));
        Assert.assertEquals("Sauce Labs Bolt T-Shirt", actualMsg2);

        String actualMsg3 = verifyText(By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']"));
        Assert.assertEquals("Sauce Labs Fleece Jacket", actualMsg3);

        String actualMsg4 = verifyText(By.xpath("(//div[@class='inventory_item_name'])[5]"));
        Assert.assertEquals("Sauce Labs Onesie", actualMsg4);

        String actualMsg5 = verifyText(By.xpath("(//div[@class='inventory_item_name'])[6]"));
        Assert.assertEquals("Test.allTheThings() T-Shirt (Red)", actualMsg5);

    }
@After
    public void testDown(){
        closeBrowser();
}
    }



