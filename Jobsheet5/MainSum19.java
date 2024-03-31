package Jobsheet5;
import java.util.Scanner;

public class MainSum19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();
        
        Sum19[] perusahaanArray = new Sum19[jumlahPerusahaan];
        
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1) + ": ");
            System.out.println("Masukkan jumlah bulan: ");
            int elm = sc.nextInt();
            perusahaanArray[i] = new Sum19(elm);
            
            for (int j = 0; j < elm; j++) {
                System.out.println("Masukkan untung bulan ke-" + (j + 1) + " = ");
                perusahaanArray[i].keuntungan[j] = sc.nextDouble();
            }
        }
        
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("==========================================================");
            System.out.println("Perusahaan " + (i + 1) + ":");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + perusahaanArray[i].elemen + " bulan adalah = " + perusahaanArray[i].totalBF(perusahaanArray[i].keuntungan));
            System.out.println("Algoritma Divide and Conquer");
            System.out.println("Total keuntungan perusahaan selama " + perusahaanArray[i].elemen + " bulan adalah = " + perusahaanArray[i].totalDC(perusahaanArray[i].keuntungan, 0, perusahaanArray[i].elemen - 1));
        }
        /*System.out.println("===================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.println("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();

        Sum19 sm = new Sum19(elm);
        System.out.println("==============================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.println("Masukkan untung bulan ke-" + (i+1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("=================================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("=================================================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));*/
    }
}