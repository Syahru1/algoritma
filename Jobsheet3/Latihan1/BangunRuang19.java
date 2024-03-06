package Jobsheet3.Latihan1;

import java.util.Scanner;

public class BangunRuang19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kerucut19[] krc = new Kerucut19[5];
        Bola19[] bl = new Bola19[5];
        LimasSegiEmpat19[] lms = new LimasSegiEmpat19[5];

        for (int i = 0; i < krc.length; i++) {
            krc[i] = new Kerucut19();
            bl[i] = new Bola19();
            lms[i] = new LimasSegiEmpat19();
        }

        boolean isTrue = true;
        int counter = 0, choice;
        String decision = "";

        while (isTrue) {
            System.out.println("===============================");
            System.out.println("Program Menghitung Bangun Ruang");
            System.out.println("===============================");
            System.out.println("1. Bola");
            System.out.println("2. Kerucut");
            System.out.println("3. Limas Segi Empat");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan: ");
            choice = sc.nextInt();

            if(choice == 1) {
                System.out.println("Progres Menghitung Volume dan Luas Permukaan Bola");
                counter = 0;
                
                do {
                    System.out.print("Masukkan Jari-jari: ");
                    bl[counter].jari_jari = sc.nextInt();
                    System.out.println("===============================");
                    System.out.printf("Volume Bola: %10.2f\n", bl[counter].hitungVolume());
                    System.out.printf("Luas Permukaan Bola: %10.2f\n", bl[counter].hitungLuasPermukaan());
                    System.out.print("Apakah ingin Mengulang kembali? (y/n) : ");
                    decision = sc.next();
                    
                    if(decision.equals("y") || decision.equals("n")) {
                        break;
                    }else {
                        counter++;
                    }
                }while(true);

            }else if(choice == 2) {
                System.out.println("Progres Menghitung Volume dan Luas Permukaan Kerucut");
                counter = 0;
                
                do {
                    System.out.print("Masukkan Jari-jari: ");
                    krc[counter].jariJari = sc.nextInt();
                    System.out.println("Masukkan Sisi Miring: ");
                    krc[counter].sisiMiring = sc.nextInt();
                    System.out.println("===============================");
                    System.out.printf("Volume Kerucut: %10.2f\n", krc[counter].hitungVolume());
                    System.out.printf("Luas Permukaan Kerucut: %10.2f\n", krc[counter].hitungLuasPermukaan());
                    System.out.print("Apakah ingin Mengulang kembali? (y/n) : ");
                    decision = sc.next();
                    
                    if(decision.equals("y") || decision.equals("n")) {
                        break;
                    }else {
                        counter++;
                    }
                }while(true);

            }else if(choice == 3) {
                System.out.println("Progres Menghitung Volume dan Luas Permukaan Limas Segi Empat");
                counter = 0;
                
                do {
                    System.out.print("Masukkan Sisi Limas: ");
                    lms[counter].sisi = sc.nextInt();
                    System.out.println("Masukkan Tinggi Limas: ");
                    lms[counter].tinggi = sc.nextInt();
                    System.out.println("===============================");
                    System.out.printf("Volume Limas Segi Empat: %10.2f\n", lms[counter].hitungVolume());
                    System.out.printf("Luas Permukaan Limas Segi Empat: %10.2f\n", lms[counter].hitungLuasPermukaan());
                    System.out.print("Apakah ingin Mengulang kembali? (y/n) : ");
                    decision = sc.next();
                    
                    if(decision.equals("y") || decision.equals("n")) {
                        break;
                    }else {
                        counter++;
                    }
                }while(true);
                
            }else {
                System.out.println("====================");
                System.out.println("TerimaKasih");
                System.out.println("====================");
                break;
            }
        }
    }
}
