package Jobsheet3.ArrayBalok;
import java.util.Scanner;
public class ArrayBalok19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Balok19[] blArray = new Balok19[3];
        blArray[0] = new Balok19(100, 30, 12);
        blArray[1] = new Balok19(120, 40, 15);
        blArray[2] = new Balok19(210, 50, 25);

        for(int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }

        Balok19[] bll = new Balok19[2];
        for (int i = 0; i < bll.length; i++) {
            bll[i] = new Balok19();
            System.out.println("Balok Ke-" + i);
            System.out.print("Masukkan Panjang : ");
            bll[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            bll[i].lebar = sc.nextInt();
            System.out.print("Masukkan Tinggi : ");
            bll[i].tinggi = sc.nextInt();
            System.out.println("========================");
        }

        for(int i = 0; i < bll.length; i++) {
            System.out.println("Volume Balok ke-" + i + ": " + bll[i].hitungVolume());
        }

    }
}
