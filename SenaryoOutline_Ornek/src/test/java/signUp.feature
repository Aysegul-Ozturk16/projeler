Feature: Automation Exercise signUp test
  Scenario Outline: Go to website and sigUp
    Given go website
    And click login button
    And type name "<name>"
    And type email "<email>"
    When click signUp button
    Then finished test


    Examples:
      | name | email |

    |ayşegül|ozturk@gmail.com|
    |ayşe   |aysegul@gmail.com|
    |bahar  |bahar@gmail.com  |



