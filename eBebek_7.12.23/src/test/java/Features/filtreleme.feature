@Test2
Feature: Ebebek sitesi üzerinden selectBy ile filtreleme işlemleri
  Scenario: Siteye gider ve filtreleme yaparak ürünü sepete ekler
    Given Ebebeke gidilir
    And Hediye basligi secilir
    And Bebek giyime tiklanir
    And Markalardan bebetto secilir
    And İkinci urun sepete eklenir
    And Urun adedi iki arttirilir
    And Urun adedi bir azaltilir
    And Urun sepete eklenir
    And Sepeti gor butonu tiklanir
    When Sepette dogru urunler varsa basari mesaji iletilir
    Then Test son bulur

