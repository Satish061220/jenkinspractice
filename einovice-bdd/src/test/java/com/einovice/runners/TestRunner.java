package com.einovice.runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/resources/features",
    glue = "com.einovice.stepdefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml",
        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"   // ✅ Add this line
    },
    monochrome = true
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