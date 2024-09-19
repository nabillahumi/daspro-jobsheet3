import java.util.Scanner;

public class Matematika {
    public static void main(String[] args) {
        int hasilUntung = 21000;
        double persenUntung = 0.15;

        Scanner sc = new Scanner(System.in);

        hasilUntung = sc.nextInt();
        persenUntung = sc.nextDouble();

        double hargaBeli = hasilUntung * persenUntung;
        double hargaJual = hargaBeli + hasilUntung;

        System.out.println("harga beli = " + hargaBeli);
        System.out.println("harga jual = " + hargaJual);
    }
}