@tag
Feature: Register new users

  @tag1
  Scenario: Register a new user filling all fields
    Given I am in the home page
    When I fill all fields
    Then register is done successfully