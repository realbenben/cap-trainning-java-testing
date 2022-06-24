package com.pluralsight.bdd.loyalty_cards;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SuperSmoothiesStepDefinitions {
	@Given("the following drinks categories:")
	public void the_following_drinks_categories(List<Map<String,String>>drinkCategories) {
		   
	}
	@Given("^(.*)  is a morning freshness member$")
	public void michael_is_a_morning_freshness_member(String name) {

	}
	
	
	@When("^(.*)  purchases (\\d+)(\\w+)drinks?$")
	public void michael_purchases_Banana_drinks(String Name,
												Integer amount,
												String drink) {
	  
	}

	@Then("He should earn some {int} points")
	public void he_should_earn_some_points(Integer expectedPoints) {
	  
	}
}
