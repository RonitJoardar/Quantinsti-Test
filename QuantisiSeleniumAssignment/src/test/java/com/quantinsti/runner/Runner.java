package com.quantinsti.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src//main//java//com//quantinsti//features//quantra.feature",
		glue = {"com.quantinsti.stepdefinitions"}
		,plugin = {"pretty","html:test-output"},
		monochrome = true,	//Readable format console output
		dryRun=false, //to check if all the features have their respective step definition
		strict = true //Will notify in the console if any step definition is missing
		//tags =  {"@SmokeTest,@EndToEnd"} //To group tests
										// ',' is OR operator -- execute all test cases which are tagged
										// AND - {"@SmokeTest" , " @EndToEnd"} -- execute either of the one
										// ~ - to ignore test cases e.g- ~@SmokeTest
		
				)
public class Runner {

}
