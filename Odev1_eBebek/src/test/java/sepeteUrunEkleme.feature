Feature:  E-bebek sitesinden sepete urun ekleme
    Scenario: E-bebek sitesine git ve sepete ürün ekle
      Given E-bebek ana sayfasina gidilir
      And Arama cubuguna “biberon” yazilir ve aratilir
      And cikan ilk urune tiklanir
      And İlgili urun sepete eklenir
      When Sepete eklendigi kontrol edilir
      Then test bitirilir

