Feature: Datatable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the element in left nav
      | setUpOne   |
      | parameters |
      | countries  |

    And Click on the element in the Dialog
      | addButton |

    And Click on the element in the Dialog content
      | nameInput | 867sdfk |
      | codeInput | 86dfk   |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete the item from Dialog
      | 867sdfk |

  Scenario: Create a Nationality
    And Click on the element in left nav
      | setUpOne      |
      | parameters    |
      | nationalities |

    And Click on the element in the Dialog
      | addButton |

    And Click on the element in the Dialog content
      | nameInput | 867sdfk |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete the item from Dialog
      | 867sdfk |
