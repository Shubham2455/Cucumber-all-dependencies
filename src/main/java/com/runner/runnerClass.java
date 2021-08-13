package com.runner;

import org.junit.runner.RunWith;

// This is the runner file 

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/main/java/com/feature/login.feature",
		glue = "com.stepDefination",
		plugin = {"pretty","html:target/report.output"}

)

public class runnerClass {

}
