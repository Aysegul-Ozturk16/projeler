@Teknosa
  Feature: Karşılaştırılan ürünlerden daha yüksek kapasteli olanı sepete ekleme
    Scenario: Buzdolaplarını karsilastirip sepete ekleme
      Given Tum urunlerden beyaz esya olarak tum buzdolapklarine gidilir
      And iki urun karsilastirmaya eklenir
      And Urunler kontrol edilir
      When Buzdolabi net kapasitesi altiyuzden buyuk olan sepete eklenir
      Then Urunun dogrulugu kontol edilir
