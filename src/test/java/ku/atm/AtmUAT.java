package ku.atm;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/deposit.feature",
        plugin = {"pretty", "html:target/cucumber"})
public class AtmUAT {

}
