package Pages;

import Utilities.GWD;
import io.cucumber.java.et.Ja;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    public void sendKeysFunction(WebElement element, String value) {

        waitUntilVisible(element); //gorunene kadar bekle(wait)
        scrollToElement(element);//elemente kadar scroll yap (javascriptexecuter)
        element.clear();//temizle (clear)
        element.sendKeys(value);// degeri gonder(sendKeys)
    }

    public void clickFunction(WebElement element) {

        waitUntilClickable(element); //tiklanana kadar bekle(wait)
        scrollToElement(element); //elemente kadar scroll yap (javascriptexecuter)
        element.click();         // click
    }

    public void waitUntilVisible(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView()", element);

    }

    public void waitUntilClickable(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsTextFunction(WebElement element, String value) {

//        waitUntilVisible(element); // gözükene kadar bekle
        wait.until(ExpectedConditions.textToBePresentInElement(element, value)); // succes icin calisiyor
        Assert.assertTrue("The text you searched could'nt be find", element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform(); //dialog kutusu kapatildi
    }

    public void waitUntilLoading() {

        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        //* ile progress barin cocuklari dedik

    }
}