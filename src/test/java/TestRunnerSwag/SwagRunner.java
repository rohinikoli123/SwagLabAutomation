package TestRunnerSwag;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features="src/test/java/feature",glue={"StepDefination","helper"},tags="@Regression",
	    plugin={"html:target/reports/test.html"})
	

public class SwagRunner {

}