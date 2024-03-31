package Jobsheet5;
import java.util.Scanner;

public class MainPangkat19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat19[] png = new Pangkat19[elemen];
        for(int i = 0; i < elemen; i++) {
            //png[i] = new Pangkat19();
            System.out.println("Masukkan nilai yang hendak dipanggil: ");
            int nilai = sc.nextInt();
            //png[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            // png[i].pangkat = sc.nextInt();
            png[i] = new Pangkat19(nilai, pangkat);
        }

        System.out.println("\nPilih Metode Penghitungan:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("\nHASIL PANGKAT -- BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("\nHASIL PANGKAT -- DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid. Program akan keluar.");
                break;
        }

        /*System.out.println("HASIL PANGKAT -- BRUTE FORCE");
        for(int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("HASIL PANGKAT -- DIVIDE AND CONQUER");
        for(int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }*/
    }
}