@Dene
Feature: Ebebek sayfasında favoriler kısmının testi
  Scenario: Websitesine gider ve favoriler kısmını test eder
    Given Websitesine gidilir
    And My Account butonuna tiklanir
    And Login butonuna tiklanir
    And Phone number girilir
    And Login_Sign Up butonuna tiklanir
    And Password butonuna tiklanir
    And Submit butonuna tiklanir
    And Categories'a tiklanir
    And Beslenmeye tiklanir
    And Biberon mamalarina tiklanir
    And İlk urun favorilere eklenir
    And New list secilir
    And Save lists tiklanir
    And My Account2'ye tiklanir
    And My Lists secilir
    And New list cop kovasina tasinir
    And Delete butoonuna tiklanir
    And My Account3'e tiklanir
    When Log Out tiklanir
    Then Ekran katilir ve test bitirilir



