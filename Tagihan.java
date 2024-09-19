import java.util.Scanner;

public class Tagihan {

    public static void main(String[] args) {
        int jumlahPenggunanListrik, tarif = 1500, totalTagihan;
        boolean statusTagihan;

        //1. INPUT

        Scanner sc = new Scanner(System.in);
        jumlahPenggunanListrik = sc.nextInt();

        //2. Hitung total tagihan 
        totalTagihan = jumlahPenggunanListrik * tarif;
        statusTagihan = jumlahPenggunanListrik > 500;

        //3. Output
        System.out.println("Total tagihan = " + totalTagihan);
        System.out.println("Jumlah penggunaan > 500 " + statusTagihan);
        sc.close();

    }
}
