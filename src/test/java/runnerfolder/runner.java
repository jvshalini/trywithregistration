package runnerfolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature/feature1.feature", glue="stepdef",plugin="json:target\\Jsonreport.json")
public class runner {

}
