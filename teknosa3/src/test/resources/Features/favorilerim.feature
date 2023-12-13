@Teknosa
Feature: Teknosa sitesinde istenilen urunun sepete eklendigi test edilir
  Scenario: Favorilere eklenen ürünü sepete ekleme
    Given sisteme giris yapilir
    And Urun secilir ve favorilere eklenir
    When Urun sepete eklenir
    Then Urunun sepete eklendigi dogrulanir