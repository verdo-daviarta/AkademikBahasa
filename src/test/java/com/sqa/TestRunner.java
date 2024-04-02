package com.sqa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/002Bahasa.feature"},
        glue = "com.sqa",
        tags = "@positif-Hapus, @positif-EksporPdf",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
//*[@id="tab-content-1"]/div/div/form/div[1]/div[2]/span/span[1]/span
//*[@id="tab-content-1"]/div/div/form/div[1]/div[2]/span/span[1]
//*[@id="tab-content-1"]/div/div/form/div[1]/div[2]/select