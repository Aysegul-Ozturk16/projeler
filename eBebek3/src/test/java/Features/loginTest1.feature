@Dene-me

Feature: Ebebek ile sisteme kayıt olma
  Scenario Outline:Websitesine git ve kayıt ol
    Given ebebek websitesine gidilir
    And hesap olustura tiklanir
    And kayit ol butonun tiklanir
    And telefon numarasi "<telNo>" girilir
    And uye ol butonuna tiklanir
    And ad "<ad>" girilir
    And soyad "<soyad>" girilir
    And eposta "<eposta>" girilir
    And sifre "<sifre>" girilir
    And kullanici sozlesmesi onaylanır
    And gizlilik politikasi onaylanır
    And onay3 onaylanir
    And onay4 onaylanir
    When hesap olustur bıtonuna tiklanir
    Then test bitirilir
    Examples:
      | telNo | ad | soyad | eposta | sifre |
      | 5365485819 | Ayşegül | Öztürk | ozturkaysegul.1998@gmail.com | 12345 |
      | 510488744 | Bahar | Kıral | baharozturk@gmail.com  |123456 |





