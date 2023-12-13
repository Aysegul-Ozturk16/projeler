@Test
Feature: Ets tur websitesi login islemleri
  Scenario Outline: Ets tur sitesine gider ve giris yapamaz
    Given Ets tur sitesine gider
    And Giris yap butonuna tiklanir
    And Eposta girilir "<eposta>"
    And Password girilir "<password>"
    When Login butonuna tiklanir
    Then Giris yapilamadigina dair hata verir
    Examples:
      | eposta | password |
    |ozturkaysegul.1@gmail.com|12345|
    |ozturkbahar@gmail.com   |123490|

@ets
    Scenario Outline: Ets tur sitesine uye olmaya calisir
      Given Ets sitesine gidilir
      And Uye ol butonuna tiklanir
      And İsim girilir "<isim>"
      And Soyisim girilir "<soyisim>"
      And Email girlir "<email>"
      And Tel no girilir "<telNo>"
      And Sifre girilir "<sifre>"
      And Sifre tekrar girilir "<sifreTekrar>"
      And Onay1 tiklanir
      And Onay2 tiklanir
      And Uye ol butonuna tiklanir
      When Aktivasyon kodu kapatilir
      Then Sayfa kapatilir
      Examples:
        | isim | soyisim | email | telNo | sifre | sifreTekrar |
      |Ayşegül|Öztürk  |ozturkaysegul@gmail.com|5365485819|12345Ab|12345Ab|
      |Bahar  |Kıral   |kıralbahar@gmail.com   |5365485819|123447Bk|123447Bk|



