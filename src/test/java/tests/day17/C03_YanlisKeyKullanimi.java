package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlisKeyKullanimi {
      /*
    POM: Page Object Model: Kabul gormus bir framework dizayn pattern'dir.

    Temel amaci:
    - Maintenance'i kolaylastirmak,
    - Tekrar eden kodlari tekrar tekrar yazmaktan kurtulmak,
    - Faydali ve kullanilabilir methodlar olusturup bunu framewoek'un tamaminda kullanabilmek,
    - Test datalarini tek merkezden kontrol edebilmek,
    - Sonradan projeye katilanlarin framework'un kolayca anlayabilmesini saglamak
    - Dinamik test method'lari yazabilmek.

    Temel Class'lar:
    1- pages: lacate'ler ve faydali reusable method'lar
    2- Driver:
        - Static methodlarla ulasilacak sekilde organiza ettik,
        - Tek bir browser'a bagimli olmaktan kurtulduk
        - getDriver() ve closeDriver() methodlari sayesinde istedigimiz yerde driver acmak veya kapatmak elimizde
        - Driver class'ini farkli objeler olusturmamak icin Singleton pattern'e uygun olarak duzenledik.
    3- configuration.properties:
        - test datalarimizi tutmak icin kullandigimiz dosyadir.
        - key=value seklinde ikililerden olusur.
        - key'ler unique olmak zorundadir.
        - ConfigReader: configuration.properties dosyasindaki test datalarini alabilmek icin olusturdugumuz class'dir
                        Java'daki Properties class'i sayesinde bizim gonderdigimiz key'e ait value'yu
                        configuration.properties'dan bize getirir.

     */


    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //Eger key olarak girdigimiz String configuration.properties dosyasinda yoksa
        //Ornegin: HMCUrl yerine HMCurl yazdik:
        //configReader.getProperty()  o key'i bulamaz
        //ve nullPointerException firlatir
    }
}
