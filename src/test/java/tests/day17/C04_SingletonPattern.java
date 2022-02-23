package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_SingletonPattern {

    @Test
    public void test01(){

        //singleton pattern bir classdan birden fazla obje uretilmesine izin vermeyen bir pattern olarak
        //kabul gormustur

        //biz Driver classini driver uretmek zre kullaniyoruz
        //ancak Driver classinda driver isminde bir instance variable da var
        //ve biz obje ureterek instance driver'a ulasabiliriz

//        Driver driver1=new Driver();
//        Driver driver2=new Driver();
//        Driver driver3=new Driver();

        // Singleton pattern kabul gormus bir pattern dir
        //amac bir classtan obje uretilmemesini saglamaktir
        //bunun icin singleton patternd de koruyacagimiz classda parametresiz bir constructor
        // olusturur ve bu constructor i "private" yapariz

    }
}
