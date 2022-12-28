package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[3]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement gradeLevel2;

    @FindBy(xpath = "(//mat-option[@role='option']/span[.=' 2.Grade '])")
    private WebElement gradeLevel3;

    @FindBy(xpath = "(//mat-option[@role='option']/span[.=' 3.Grade '])")
    private WebElement gradeLevel4;

    @FindBy(xpath = "(//mat-option[@role='option']/span[.=' 4.Grade '])")
    private WebElement gradeLevel5;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastName;

    @FindBy(xpath = "//input[@formcontrolname='employeeId']")
    private WebElement employeeId;

    @FindBy(xpath = "(//mat-select[@role='combobox']/div/div/span)[6]")
    private WebElement documentType;

    @FindBy(xpath = "//mat-option[@role='option']/span[.=' Passport ']")
    private WebElement passport;

    @FindBy(xpath = "//input[@formcontrolname='documentNumber']")
    private WebElement documentNumber;

    @FindBy(xpath = "(//div[@role='tab']/div)[2]")
    private WebElement contractAddress;

    @FindBy(xpath = "//input[@formcontrolname='country']")
    private WebElement country;

    @FindBy(xpath = "(//div[@role='tab']/div)[3]")
    private WebElement additionalInfo;

    @FindBy(xpath = "(//ms-text-field//input)[4]")
    private WebElement alyupfwe;


    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {

            case "academicPeriod": myElement = academicPeriod;break;
            case "academicPeriod1": myElement = academicPeriod1;break;
            case "gradeLevel": myElement = gradeLevel;break;
            case "gradeLevel2": myElement = gradeLevel2;break;
            case "gradeLevel3": myElement = gradeLevel3;break;
            case "gradeLevel4": myElement = gradeLevel4;break;
            case "gradeLevel5": myElement = gradeLevel5;break;
            case "contractAddress": myElement = contractAddress;break;
            case "additionalInfo": myElement = additionalInfo;break;
//            case "country": myElement = country;break;
            case "documentType": myElement = documentType;break;
            case "passport": myElement = passport;break;
        }
        clickFunction(myElement);
    }
    public void findAndSend(String strElement, String value) {

        switch (strElement) {

            case "firstName": myElement = firstName;break;
            case "lastName": myElement = lastName;break;
            case "employeeId": myElement = employeeId;break;
            case "documentNumber": myElement = documentNumber;break;
            case "alyupfwe": myElement = alyupfwe;break;

        }
        sendKeysFunction(myElement,value);
    }
    public void findAndSendAction(String strElement,String text){

        switch (strElement) {
            case "country": myElement = country;break;
        }

        actionEnter(myElement,text);
    }
}