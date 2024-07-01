
Feature: Kullanici teknosa uygulamasindaki gorevleri yerine getirir

  Scenario: Kullanici kategoriler bolumundeki telefon dogrulamalarini gerceklestirir

  * Uygulama baslatilir
  * Ilk ekran bolumunden atlaya tiklanir
  * footer bolumundeki "Kategoriler" butonuna tiklanir
  * kategoriler bolumunden "Telefon" bolumune tiklanir
  * telefon sayfasindan cihaz secimi "Cep Telefonu" yapilir
  * filtrele bolumune tiklanir
  * Marka bolumunden marka secimi "TCL" yapilir
  * siralama yapilirak "Azalan Fiyat" secilir
  * fiyatlarin azalan duzende oldugu test edilir


   Scenario: Ev ve Yasam bolumunden aydinlatma filtrelemesi yapilarak siralandigi dogrulanir
     * Uygulama baslatilir
     * Ilk ekran bolumunden atlaya tiklanir
     * footer bolumundeki "Kategoriler" butonuna tiklanir
     * kategoriler bolumunden "Ev ve Yaşam" bolumune tiklanir
     * telefon sayfasindan cihaz secimi "Aydınlatma" yapilir
     * filtrele bolumune tiklanir
     * Marka bolumunden marka secimi "Orbus" yapilir
     * siralama yapilirak "Azalan Fiyat" secilir


   Scenario: Sepetimdeki bir cihazin fiyati arttirildiginda fiyat artisi dogrulanir

     * Uygulama baslatilir
     * Ilk ekran bolumunden atlaya tiklanir
     * footer bolumundeki "Kategoriler" butonuna tiklanir
     * kategoriler bolumunden "Telefon" bolumune tiklanir
     * telefon sayfasindan cihaz secimi "Cep Telefonu" yapilir
     * filtrele bolumune tiklanir
     * Marka bolumunden marka secimi "Samsung" yapilir
     * siralama yapilirak "Artan Fiyat" secilir
     * en ucuz cihaz a tiklanir
     * cihaz "Sepete Ekle" sepete eklenir
     * "Sepetime Git" bolumune tiklanir
     * urunun sayisi arttirildiginda fiyatinin arttirildigi dogrulanir
  @teknosa
  Scenario: Kullanici ekranda belirledigi yerin screen shotini dinamik bir sekilde alir

    * Uygulama baslatilir
    * Ilk ekran bolumunden atlaya tiklanir
    * kullanici cekmek istedigi screenShot i text uzerinden "Kategoriler" alir




