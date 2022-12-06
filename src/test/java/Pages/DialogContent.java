package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "(//td[@role='cell'])[2]")
    private WebElement searchResultCell;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    private WebElement toggleBar;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        //element get : burada string isimden webelemente ulasacagim
        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "nameInput": myElement = nameInput;break;
            case "codeInput": myElement = codeInput;break;
            case "shortName" : myElement=shortName;break;
            case "searchInput" : myElement=searchInput;break;
            case "integrationCode" : myElement=integrationCode;break;
            case "priorityCode" : myElement=priorityCode;break;

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
            case "searchButton": myElement = searchButton;break;
            case "deleteButton": myElement = deleteButton;break;
            case "deleteDialogBtn": myElement = deleteDialogBtn;break;
            case "toggleBar": myElement = toggleBar;break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        //element get : burada string isimden webelemente ulasacagim
        switch (strElement) {

            case "txtTechnoStudy": myElement = txtTechnoStudy;break;
            case "successMessage": myElement = successMessage;break;
            case "alreadyExist" : myElement=alreadyExist;break;
            case "searchResultCell" : myElement=searchResultCell;break;
        }
        verifyContainsTextFunction(myElement, text);
    }
    public void findAndDelete(String searchText) {
        //kelimeyi ara
        findAndSend("searchInput",searchText); // aranacak kelimeyi kutucuga gonder
        findAndClick("searchButton");  // arama butonuna bas

       // wait.until(ExpectedConditions.stalenessOf(deleteButton)); //stale zamanini yakalayamadi
        //wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//tbody[@role='rowgroup']//tr"),5));
        //findAndContainsText("searchResultCell",searchText); // arama sonuclarinin ilkinde aranan kelime gorunene kadar bekle

        waitUntilLoading(); //progress barin cocuklari 0 olana kadar bekle
        findAndClick("deleteButton");  // silme butonuna bas, cop kutusu
        findAndClick("deleteDialogBtn"); // dialogtaki silme butonuna bas

    }
}