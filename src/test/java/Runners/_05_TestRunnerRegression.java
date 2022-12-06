package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="@Regression or @SmokeTest",  //hangi senaryolarda bu etiket varsa onlar calistirilacak
        //or yerine and yazilirsa hem smoke hem de regression tag i olanlari calistiriyor
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}

)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
