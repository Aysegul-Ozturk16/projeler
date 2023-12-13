@Siemens
  Feature: Ürün karşılaştırması yaparak en iyi ürünü sepete ekleyen test
    Scenario: Ürünleri karşılaştırma
      Given Urunler sekmesine tiklanir
      And Tum buzdolaplari acilir
      And Iki urun karsilastirmaya eklenir
      And Urunlerin dogrulugu kontrol edilir
      When Urunler karsilastirilir ve sogutucu kapasitesi buyuk olan sepete eklenir
      Then Dogru urunun sepete eklendigi kontrol edilir



