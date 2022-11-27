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

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        //element get : burada string isimden webelemente ulasacagim
        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
        }

        sendKeysFunction(myElement, value);

    }

    public void findAndClick(String strElement) {

        //element get : burada string isimden webelemente ulasacagim
        switch (strElement) {

            case "loginButton":
                myElement = loginButton;
                break;

        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {

        //element get : burada string isimden webelemente ulasacagim
        switch (strElement) {

            case "txtTechnoStudy":
                myElement = txtTechnoStudy;
                break;

        }

        verifyContainsTextFunction(myElement, text);
    }
}