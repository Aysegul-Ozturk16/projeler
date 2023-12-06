@Test
Feature: Ebebek websitesi üzerinden hesap bilgilerimi düzenle
  Scenario Outline: Websitesine git ve hesap bilgilerini düzenle
    Given websitesine gidilir
    And reklam kapatilir
    And hesabimButonuna tikla
    And girisYapa tiklanir
    And telefon numarasi girilir "<telNo>"
    And girisYap butonuna tiklanir
    And sifre girilir "<sifre>"
    And giris_yap butonuna tiklanir
    And hesabim_butonuna tiklanir
    And siparislerime tiklanir
    And kisisel bilgilerime tiklanir
    And bilgilerimi duzenleye gir
    And ad girilir "<ad>"
    And soyad girilir "<soyad>"
    And cinsiyet secilir
    And dogum tarihi secilir "<dogumTarihi>"
    When kaydet butonuna tiklanir
    Then testi bitir
    Examples:
      | telNo | sifre | ad | soyad  | dogumTarihi |
      |365485819|16.3.98Bb|Ayşegül|Öztürk|16031998|
      |510488744|25.2.99Bk|Bahar  |Kıral |25021999|








