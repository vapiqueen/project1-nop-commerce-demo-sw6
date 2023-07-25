package com.nopcommerce.demo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/**
 * Created by Jay Vaghani
 */
@RunWith(Cucumber.class)
@CucumberOptions(
       // features = "src/test/java/resources/featurefile/",
        features = "src/test/java/resources/featurefile/computer.feature",
        glue = "com/nopcommerce/demo",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class ComputerRunner {

}
