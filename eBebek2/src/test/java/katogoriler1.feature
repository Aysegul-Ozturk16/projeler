Feature: Categories section on ebebek website
  Scenario: Go to catagories and insert product
    Given go to websitee
    And click -Kategoriler- section
    And click -Giyim ve Tekstil- section
    And click -Bebek Coraplari- section
    And click -Bebek Soket Corap- section
    And add first product to the cart
    And click -Sepete Ekle- button
    And click -Alisverise Devam Et- section
    And add second product to the cart
    And click -Sepete Ekle- button for second product
    And click -Sepeti Gor- button
    When click -Alisverisi tamamla- button
    Then finish test
