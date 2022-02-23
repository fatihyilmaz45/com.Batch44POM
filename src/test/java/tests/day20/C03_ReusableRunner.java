package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_ReusableRunner {

    @Test
    public void test01(){

        //ulkeler excelindeki sayfa1'de 11. indexteki satirin 2. indexteki huxresinin Azerbaycan oldugunu test edin

        String path="src/test/java/resorces/ulkeler.xlsx";
        String expectedData="Azerbaycan";
        String actualData= ReusableMethodsExcel.hucreGetir(path,"Sayfa1",11,2).toString();
        Assert.assertEquals(actualData,expectedData);
    }
}
