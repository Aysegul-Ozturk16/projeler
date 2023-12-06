Feature: Ebebek signup
  Scenario: Go to ebebek and sign up
    Given go to ebebek website
    And click my account button
    And click create account button
    And sendkey phone number
    And click signup button
    And sendkey firstname
    And sendkey lastname
    And sendkey email
    And sendkey password
    And click permissions1
    And click permissions2
    And click permissions3
    And click permissions4
    When click create accunt
    Then finish test

