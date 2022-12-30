Feature: Testing JDBC States

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: States testing with JDBC
    And Click on the element in left nav
      | setUpOne   |
      | parameters |
      | states     |
    Then Send the query the database "select * from states" and control match