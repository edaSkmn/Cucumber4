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

    Then Success message should be displayed

    And User delete the item from Dialog
      | 867sdfk |

    Then Success message should be displayed

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

    Then Success message should be displayed

    And User delete the item from Dialog
      | 867sdfk |

    Then Success message should be displayed

    Scenario: Fee Functionality
      And Click on the element in left nav
        | setUpOne      |
        | parameters    |
        | feesSetup |

      And Click on the element in the Dialog
        | addButton |

      And Click on the element in the Dialog content
        | nameInput | fee12fk |
        | codeInput | 12356 |
        | integrationCode | 2345 |
        | priorityCode | 9834 |

      And Click on the element in the Dialog
        | toggleBar |
        | saveButton |

      Then Success message should be displayed

      And User delete the item from Dialog
        | fee12fk |

      Then Success message should be displayed

      #    Senaryo Outline da verilen değerler için tüm senaryo her satır kadar tekrar çalıştırılıyordu.
    #    DataTable da ise, sadece ilgili step için toplu veri gönderme imkanı oluşuyor.