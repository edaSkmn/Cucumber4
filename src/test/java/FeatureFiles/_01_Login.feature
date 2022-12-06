#Senaryo:
#1- siteyi aciniz
# 2- username ve passwordu gonderin ve Login butonuna tiklatin.
# 3- Login oldugunuzu dogrulayin.


Feature: Login Functionality

  @SmokeTest @Regression
  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully