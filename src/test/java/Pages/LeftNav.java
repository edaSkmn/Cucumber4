package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setUpOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath="(//span[text()='Citizenships'])[1]")
    private WebElement citizenShip;

    @FindBy(xpath="(//span[text()='Nationalities'])[1]")
    private WebElement nationalities;

    @FindBy(xpath="(//span[text()='Fees'])[1]")
    private WebElement feesSetup;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath="(//span[text()='Setup'])[2]")
    private WebElement setUpTwo;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;



    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {

            case "setUpOne": myElement = setUpOne;break;
            case "parameters": myElement = parameters;break;
            case "countries": myElement = countries;break;
            case "citizenShip" : myElement=citizenShip;break;
            case "nationalities" : myElement=nationalities;break;
            case "feesSetup" : myElement=feesSetup;break;
            case "entranceExamsOne" : myElement=entranceExamsOne;break;
            case "setUpTwo" : myElement=setUpTwo;break;
            case "entranceExamsTwo" : myElement=entranceExamsTwo;break;
        }

        clickFunction(myElement);
    }
}