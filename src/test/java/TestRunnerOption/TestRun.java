package TestRunnerOption;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/Features",
		glue = "StepDefinations" , tags="@Sanity", monochrome=true,
		plugin = {"pretty","html:target/cucmber_sanity","json:target/cucumber_sanity.json","junit:target/cucumber_sanity.xml","com.cucumber.listener.ExtentCucumberFormatter: target/Report.html"}
		)

public class TestRun {

}
