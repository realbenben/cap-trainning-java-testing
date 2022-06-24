package com.pluralsight.bdd.loyalty_cards;

import java.util.HashMap;
import java.util.Map;

public class drinkCatalog {
    Map<String, String> drinkCategories = new HashMap<>();
    public void addDrink(String drink, String category) {
    drinkCategories.put(drink, category);
    }
}
