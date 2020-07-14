package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\features\\TaggedHooks.feature",
		glue = "stepDefinations",
		strict = true,
		format = {"pretty", "html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome = true,
		dryRun = false
		)
public class TestRunner {

}
