package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"@patientlist"},format={"html:reports"},glue={"patientlist"},features={"classpath:Patientlistvalidation"})
@RunWith(Cucumber.class)

public class Patientlistrun {


}
