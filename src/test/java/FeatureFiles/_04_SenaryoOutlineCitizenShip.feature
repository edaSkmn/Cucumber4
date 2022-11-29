#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız.
#Daha sonra Bilgileri siliniz
#Yukarıdaki işlemleri Parameter yöntemi ile yapınız.

Feature: Citizenship with scenario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to CitizenShip page

  Scenario Outline: CitizenShip Create
    When User a CitizenShip name as "<Name>" short name as "<ShortName>"
    Then Success message should be displayed

    When User a CitizenShip name as "<Name>" short name as "<ShortName>"
    Then Already exist message should be displayed

#    When User delete.... TODO
#    Then Success message should be displayed
#
    Examples:
      | Name     | ShortName |
      | vatIs113 | isVat114  |
      | vatIs215 | isVat126  |
      | vatIs317 | isVat138  |
      | vatIs419 | isVat140  |