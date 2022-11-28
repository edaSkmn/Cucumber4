package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(css = "button[class='consent-give']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        //element get : burada string isimden webelemente ulasacagim
        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "nameInput": myElement = nameInput;break;
            case "codeInput": myElement = codeInput;break;
            case "shortName" : myElement=shortName;break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        //element get : burada string isimden webelemente ulasacagim
        switch (strElement) {

            case "loginButton": myElement = loginButton;break;
            case "addButton": myElement = addButton;break;
            case "saveButton": myElement = saveButton;break;
            case "acceptCookies": myElement = acceptCookies;break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        //element get : burada string isimden webelemente ulasacagim
        switch (strElement) {

            case "txtTechnoStudy": myElement = txtTechnoStudy;break;
            case "successMessage": myElement = successMessage;break;
            case "alreadyExist" : myElement=alreadyExist;break;
        }
        verifyContainsTextFunction(myElement, text);
    }
}