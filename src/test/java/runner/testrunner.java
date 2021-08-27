package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\Abc\\eclipse-workspace\\codechallenge\\src\\main\\java\\feature\\pwcdigital.feature",
		glue= {"stepdefination"},
	//	format= {"pretty","html:test-output"}
		monochrome = true,//Display the console in Readable format
		publish = true,//cucumber report
		dryRun=false,
		//tags = ("@SmokeTest or @RegressionTest or @E2ETest"),
	//	tags = ("not @SmokeTest or not @RegressionTest "),
		strict=true,//checks missing step defs
		plugin = {"pretty","html:test-output/cucumber-html-report.html", "json:test-output/cucumber-json-report.json" }
	
		)

class testrunner {

}
