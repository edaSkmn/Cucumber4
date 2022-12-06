#Senaryo :
#  Daha önceki Create a Fee, delete Fee Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fee Functionality (DataTable - Scenario Outline)

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario Outline: Fee Functionality

    And Click on the element in left nav
      | setUpOne   |
      | parameters |
      | feesSetup  |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the element in the Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete the item from Dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name    | code  | intCode   | priority |
      | Feee134 | 01092 | paypal    | 34       |
      | Feee134 | 09273 | applePay  | 12       |
      | Feee134 | 16373 | googlePay | 09       |

