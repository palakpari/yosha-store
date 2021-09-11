package com.yoshallc.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        dryRun = true,
        features = "src/test/resources/feature",
        glue = {"com.yoshallc.steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
        )
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
