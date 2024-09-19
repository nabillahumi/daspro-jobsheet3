import java.util.Scanner;


public class GajiKaryawan {

    public static void main(String[] args) {
        int jamKerja, upahPerjam;
        double persenBonus = 0.1, persenPajak = 0.05;

        //1. iinput
        Scanner sc = new Scanner(System.in);
        jamKerja = sc.nextInt();
        upahPerjam = sc.nextInt();

        //2. perhitungan
        double totalGaji = jamKerja * upahPerjam;
        double bonus = persenBonus * totalGaji;
        double pajak = persenPajak * (totalGaji + bonus);
        double gajiBersih = (totalGaji + bonus) - pajak;

        System.out.println("Total gaji = "+ totalGaji);
        System.out.println("Bonus = " + bonus);
        System.out.println("Pajak = " + pajak);
        System.out.println("Gaji bersih = " + gajiBersih);
    }
}