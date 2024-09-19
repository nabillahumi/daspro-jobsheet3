import java.util.Scanner;

public class Nabillah {
    
    public static void main(String[] args) {
        int panjang = 44, lebar = 32;
        int sisi = 28;
        double luasPersegipanjang;
        double luasPersegi;
        double luasTamanbunga;

        Scanner sc = new Scanner(System.in);
        panjang = sc.nextInt();
        lebar = sc.nextInt();
        sisi = sc.nextInt();

        luasPersegipanjang = panjang * lebar;
        luasPersegi = sisi * sisi;
        luasTamanbunga = luasPersegipanjang - luasPersegi;

        System.out.println("luasPersegiPanjang = " + luasPersegipanjang);
        System.out.println("luasPersegi = " + luasPersegi);
        System.out.println("luasTamanBunga = " +luasTamanbunga);





    }
}
