package com.einovice.runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/resources/features", // consistent with Maven and Jenkins
    glue = "com.einovice.stepdefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",          // basic HTML report
        "json:target/cucumber.json",                 // needed for advanced reports
        "junit:target/cucumber.xml"                  // optional for Jenkins integration
    },
    monochrome = true                                // cleaner console output
)
public class TestRunner {
}



/*
 * import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
 * import org.junit.runner.RunWith;
 * 
 * 
 * 
 * @RunWith(Cucumber.class)
 * 
 * @CucumberOptions( features = "src/test/resources/features", glue =
 * "com.einovice.stepdefinitions", plugin =
 * {"pretty","html:target/cucumber-report.html"} )
 * 
 * 
 * 
 * 
 * public class TestRunner { }
 * 
 * 
 * 
 * 
 * import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
 * import org.junit.runner.RunWith;
 * 
 * @RunWith(Cucumber.class)
 * 
 * @CucumberOptions( features = "classpath:features", glue =
 * "com.einovice.stepdefinitions", plugin = {"pretty",
 * "html:target/cucumber-report.html"} ) public class TestRunner { }
 */