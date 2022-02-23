package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C05_ExceliMapeYukleme {

    @Test
    public void test01(){
        // dosya yolu ve saya ismi verilen bir excel sheet i map olarak kaydeden
        // reusable bir method olusturalim

        String path="src/test/java/resorces/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        Map<String,String> ulkelerMap= ReusableMethodsExcel.mapOlustur(path,sayfaAdi);

        System.out.println(ReusableMethodsExcel.mapOlustur(path,sayfaAdi));

        // olusturdugumuz mapi kullanarak Turkey'in bilgilerini yazdirirn
        System.out.println(ulkelerMap.get("Turkey"));

        // Listede Netherlands oldugunu test edin
        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));

    }
}
