Feature: ebebek login test
  Scenario: Go to ebebek website and login test
    Given go to website
    And click my account button
    And click signup button
    And sendkey phone number
    When click login button
    Then test finish