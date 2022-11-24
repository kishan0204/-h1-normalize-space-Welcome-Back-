package utility;

import browserFactory.BeseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BeseTest {

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    public void sendTextToElement(By by, String text) {
        WebElement emailField = driver.findElement(by);
        emailField.sendKeys(text);
    }

    public String verifyText(By by) {
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();

    }
}


