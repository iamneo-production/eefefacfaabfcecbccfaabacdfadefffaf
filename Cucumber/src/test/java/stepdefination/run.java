package stepdefination;

import org.junit.runner.RunWith;
import Cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@Cucumber.Options (format = {"pretty", "html:target/cucumber"})
public class run {}