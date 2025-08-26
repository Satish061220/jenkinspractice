package com.einovice.runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features = "classpath:features",
		  glue     = "com.einovice.stepdefinitions",
		  plugin   = {"pretty","html:target/cucumber-report.html"}//this is plugin related to cucumber
		)

public class TestRunner { }
