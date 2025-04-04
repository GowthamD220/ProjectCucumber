package runnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
				 glue="stepdefinition",
				 monochrome = true,
				 tags = "@ProductSearch or @Checkout")
public class TestRunnerClassTest extends AbstractTestNGCucumberTests {

}
