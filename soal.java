import java.util.Scanner;

public class soal {
    
    public static void main(String[] args) {
        
        int waktuSatu = 80, pekerjaSatu = 14;
        int waktuDua = 28;
        int hasilSatu;
        int hasilDua;

        Scanner sc = new Scanner (System.in);
        waktuSatu = sc.nextInt();
        pekerjaSatu = sc.nextInt();
        waktuDua = sc.nextInt();

        hasilSatu = waktuSatu * pekerjaSatu;
        hasilDua = hasilSatu / waktuDua;

        System.out.println("hasilSatu =" + hasilSatu);
        System.out.println("hasilDua =" + hasilDua);



    }
}
