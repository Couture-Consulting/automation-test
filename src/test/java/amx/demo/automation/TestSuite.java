package amx.demo.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {
		"src/test/resources/features/InitialFeature.feature"
		},
		glue = {
				"amx.demo.automation"
		}
	)

public class TestSuite {

}
