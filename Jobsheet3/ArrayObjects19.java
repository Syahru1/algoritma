package Jobsheet3;
import java.util.Scanner;
public class ArrayObjects19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Jumlah Objek Persegi: ");
        int input = sc.nextInt();
        PersegiPanjang19[] ppArray = new PersegiPanjang19[input];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang19();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

        System.out.println("================================");
        ppArray[0] = new PersegiPanjang19();
        ppArray[0].panjang = 10;
        ppArray[0].lebar = 5;
        System.out.println("Persegi Panjang 0");
        System.out.println("Panjang: " + ppArray[0].panjang);
        System.out.println("Lebar: " + ppArray[0].lebar);
        System.out.println("================================");
    }
}
