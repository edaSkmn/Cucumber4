#Senaryo :
#  Employee menusu için Create-Exist-Delete bölümleri olan Senaryoyu yazınız
#  Daha sonra aynı senaryoru 5 farklı degerler için çalıştırınız.

Feature: Employee Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully


  Scenario Outline:Employee create and exist and delete

    And Click on the element in left nav
      | humanResources |
      | employees      |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Form Content
      | firstName      | <FirstName>      |
      | lastName       | <LastName>       |
      | employeeId     | <ID>             |
      | documentNumber | <DocumentNumber> |


    And Click on the element in the Form Content
      | documentType |
      | passport     |

    And Click on the element in the Form Content
      | contactAddress |


    And User sending the action keys in Form Content

    And Click on the element in the Form Content
      | additionalInfo |

    And User sending the keys in Form Content
      | alyupfwe1 | 19025 |

    And Click on the element in the Dialog
      | saveButton |


    Then Success message should be displayed


    Examples:
      | FirstName | LastName  | ID    | DocumentNumber |
      | ayse      | karaduman | 45098 | 4567U          |



#  Scenario Outline: Employee Create Exist and Delete Functionality
#
#    And Click on the element in left nav
#      | humanResources |
#      | employees      |
#
#    And Click on the element in the Dialog
#      | addButton |
#
#    And User sending the keys in Form Content
#      | firstName      | <firstName>  |
#      | lastName       | <lastName>   |
#      | employeeId     | <ID>
#      | documentNumber | <DocumentNo> |
#
#    And Click on the element in the Form Content
#      | documentType |
#      | passport     |
#
#    And Click on the element in the Form Content
#      | contractAddress |
#
#    And User sending the action keys in Form Content
#
#    And Click on the element in the Form Content
#      | additionalInfo |
#
#    And User sending the keys in Form Content
#      | alyupfwe | <alyupfwe> |
#
#    And Click on the element in the Dialog
#      | saveButton |
#
#    Then Success message should be displayed
#
#    Examples:
#      | firstName | lastName | ID    | DocumentNo | alyupfwe |
#      | ed        | samuel   | 90234 | w56sx      | abc45    |
