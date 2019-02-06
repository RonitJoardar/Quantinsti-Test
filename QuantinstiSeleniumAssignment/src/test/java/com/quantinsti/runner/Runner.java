package com.quantinsti.runner;

import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This class is responsible for running the test scenarios
 * It also has the retry logic for failed scenarios
 * @author ronit
 *
 */
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport = "target/cucumber-reports/cucumber.json",
        retryCount = 3,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        usageReport = true,
        toPDF = true,
        excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@passed" },
        outputFolder = "target"
		)

@CucumberOptions(
		
		features = "src//main//java//com//quantinsti//features//quantra.feature",
		glue = {"com.quantinsti.stepdefinitions"}
		,plugin = {"pretty","html:test-output","json:target/cucumber-reports/cucumber.json"}, // This will create a HTML report in test-output folder with name index.html
		monochrome = true,	//Readable format console output
		dryRun=false, //to check if all the features have their respective step definition
		strict = true //Will notify in the console if any step definition is missing
		
		
				)
public class Runner {

}
