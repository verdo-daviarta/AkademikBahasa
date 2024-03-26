package com.sqa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/002Bahasa.feature"},
        glue = "com.sqa",
        tags = "@positif",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
