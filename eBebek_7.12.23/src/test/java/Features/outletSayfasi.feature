@Test
Feature: Ebebek sitesinde Outlet sayfasi üzerinden selectBy kullanimi
  Scenario: Ebebeke gider ve outlet sayfasinda seçimine göre ürün sepete ekler
    Given Siteye gidilir
    And Outlete tiklanir
    And Akilli siralama yapilir
    And En dusuk fiyata gore secilir
    And besinci urun sepete eklenir
    And Sepete ekle butonuna tiklanir
    And Sepeti gor butonuna tiklanir
    And Urun adedi bir tane arttirilir
    When Alisverisi tamamla butonuna tiklanir
    Then Test bitirilir