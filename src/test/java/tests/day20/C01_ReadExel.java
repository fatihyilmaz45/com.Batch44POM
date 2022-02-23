package tests.day20;

import org.apache.poi.ss.usermodel.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExel {

    @Test
    public void test01() throws IOException {

        String path="src/test/java/resorces/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        // Biz FIS ile okudugumuz excel dosyasini projemiz icerisinde kullanabilmek icin
        // Apache POI dependency yardimi ile bir Workbook olussturduk
        // bu Wokbook bizim projemizin icerisinde ulkeler exelinn bir kopyasini kullanmamizi sagliyor
        // excelin yapisi geregi bir hucreye (cell) ulasabilmek icin workbookdan baslayarak
        // siarasiyla sheet, row ve cell objeleri olusturmamiz gerekir

        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet= workbook.getSheet("Sayfa1");
        Row row= sheet.getRow(4);
        Cell cell= row.getCell(2);

        System.out.println(cell);

        // indexi 4 olan satirdaki , indexi 2 olan hucrenin Andorra oldugunu test ediniz

        String expectedData="Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);//cell.toString de oluyor

        // 5. index teki satirin 3. indexteki hucre bilgisini yazdirin

        row= sheet.getRow(5);
        cell= row.getCell(3);
        System.out.println(cell);


















    }
}
