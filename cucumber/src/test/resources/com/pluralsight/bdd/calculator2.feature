Feature: calculator

  This a test to check if i can use 3 scenario in the same file
  // example de 3 scenario sur mm fichier
  Background:
    Given I have a calculator

  Scenario: adding two numbers

    When I add 1 and 2
    Then I should get 3



  Scenario: adding two same numbers
    When I add 4 and 4
    Then I should get 8

  Scenario: adding two neg and pos numbers
    When I add -4 and 4
    Then I should get 0