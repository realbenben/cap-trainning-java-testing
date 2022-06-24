package com.pluralsight.bdd.loyalty_cards;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/loyalty_cards",
					glue ="com.pluralsight.bdd/loyalty_cards"
		)
public class SuperSmoothieProgramTestSuite {

}
