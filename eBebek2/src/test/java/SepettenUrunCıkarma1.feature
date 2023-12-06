Feature: Remove items from the cart on ebebek website
  Scenario: Go to eBebek website and remove items from the cart
    Given go to website
    And type biberon search bar
    And click sepete ekle for first product
    And click sepeti gor button
    When click on the trash can amblem
    Then the test is finish
