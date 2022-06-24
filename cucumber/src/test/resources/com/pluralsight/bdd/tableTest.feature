Background:
Feature : test avec des tables afin d éviter les répétitions
Scenario : Bob orders many things

  Given Bob is a morning freshness member
  When he orders a smoothie
  And he orders a cappuccino
  And he orders 2 croissants
  Then his order should go to the queue

Feature :autre syntaxe + simple mais pas ouf

Scenario : Michael orders many things

Given Micahel is a morning freshness member
When he orders a smoothie and a cappuccino and 2 croissants
Then his order should go to the queue

Feature :syntaxe avec table

Scenario : Bob orders many things

  Given Bob is a morning freshness member
 And he places the following order:
    |Product    | Quantity |
    |smoothie   |1         |
    |cappuccino |1         |
    |croissant  |2         |
  When he views the calorie overview
  Then he should see the calorie counts:
  |smoothie   | 180 kcal |
  |cappuccino | 43 kcal  |
  |croissant  | 450 kcal |
  |total      | 673 kcal |


Feature : ici la mm chose mais sans table la syntaxe est lourde et repetitive

  Scenario: regular smoothies
    Given Michael  is a morning freshness member
    When Michael purchases 1 banana smoothie
    Then he should earn 15 points

  Scenario: Fancy smoothies
    Given Michael  is a morning freshness member
    When Michael purchases 1 three-berry-blend smoothie
    Then he should earn 20 points

  Scenario: Fancy smoothies
    Given Michael  is a morning freshness member
    When Michael purchases 1 earl grey tea
    Then he should earn 10 points

  Scenario: Fancy smoothies
    Given Michael  is a morning freshness member
    When Michael purchases 1 Cappuccino
    Then he should earn 12 points


    Feature: ici l'utilisation de scenario outlines afin de rendre dynamike les données a tester
    Scenario Outline: Earning loyalty card points
     Given Michael  is a morning freshness member
      When Michael purchases 1  <Sample Drink>
      Then he should earn <Points Earned>
      Examples:
        | Drink Category     |   Sample Drink      | Points Earned |
        | Regular Smoothies  | Banana Smoothie     | 15 |
        | Regular Smoothies  | waterMelon Smoothie |15  |
        | Fancy Smoothies  | red berries Smoothie  |20  |
