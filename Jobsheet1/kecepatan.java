package Jobsheet1;
import java.util.Scanner;

public class kecepatan {
    static Scanner input = new Scanner(System.in);

    static double hitungKecepatan(double jarak, double waktu) {
        double kecepatan = jarak/waktu;
        return kecepatan;
    }
    static double hitungJarak(double kecepatan, double waktu) {
        double jarak = kecepatan*waktu;
        return jarak;
    }
    static double hitungWaktu(double jarak, double kecepatan) {
        double waktu = jarak/kecepatan;
        return waktu;
    }
    static void menu() {
        double kecepatan, jarak, waktu;
        System.out.println("Daftar Menu");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.println("Masukkan Pilihan: ");
        int pilihan = input.nextInt();
        if(pilihan==1) {
            System.out.println("Menghitung Kecepatan");
            System.out.print("Masukkan Jarak : ");
            jarak = input.nextDouble();
            System.out.println("Masukkan waktu : ");
            waktu = input.nextDouble();
            kecepatan = hitungKecepatan(jarak, waktu);
            System.out.println("============================");
            System.out.println("Kecepatan = " + kecepatan + " Km/h");
            System.out.println("============================");
        }else if(pilihan==2) {
            System.out.println("Menghitung Jarak");
            System.out.print("Masukkan Kecepatan : ");
            kecepatan = input.nextDouble();
            System.out.println("Masukkan waktu : ");
            waktu = input.nextDouble();
            jarak = hitungJarak(kecepatan, waktu);
            System.out.println("============================");
            System.out.println("Jarak = " + jarak + " Km");
            System.out.println("============================");
        }else {
            System.out.println("Menghitung Waktu");
            System.out.print("Masukkan Jarak : ");
            jarak = input.nextDouble();
            System.out.println("Masukkan Kecepatan : ");
            kecepatan = input.nextDouble();
            waktu = hitungWaktu(jarak, kecepatan);
            System.out.println("============================");
            System.out.println("Waktu = " + waktu + " h");
            System.out.println("============================");
        }
    }
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("Program Menghitung, Kecepatan, Jarak & Waktu");
        System.out.println("============================================");
        boolean isTrue = true;
        String answer = "";
        while(isTrue) {
            menu();
            System.out.print("Apakah ingin Mengulang Kembali ? (y/t) : ");
            answer = input.nextLine();
            if(answer.equals("t") || answer.equals("T")) {
            }
        }
        System.out.println("-----------");
        System.out.println("TerimaKasih");
        System.out.println("-----------");
    }
}