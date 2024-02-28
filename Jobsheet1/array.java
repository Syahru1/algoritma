package Jobsheet1;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        String[] mataKuliah = { "Critical Thinking and Problem Solving","Bahasa Inggris","Pancasila",
                            "Matematika Dasar","Konsep Teknologi Informasi", "Dasar Pemrograman",
                            "Praktikum Dasar Pemrograman","Keselamatan dan Kesehatan Kerja"};
        double[] nilaiAngka = new double[mataKuliah.length];

        int totalSKS = 0;
        double totalBobot = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("=============================");
        System.out.print("Masukkan jumlah SKS: ");
        int SKS = sc.nextInt();

        for (int i = 0; i < mataKuliah.length && i < SKS; i++) {
            System.out.print("Masukkan nilai (0-100) untuk Mata kuliah " + mataKuliah[i] + " : ");
            double nilai = sc.nextDouble();
            if (nilai >= 0 && nilai <= 100) {
                double bobot = 0;
                if (nilai >= 80) {
                    bobot = 4.0;
                } else if (nilai >= 73) {
                    bobot = 3.50;
                } else if (nilai >= 65) {
                    bobot = 3.00;
                } else if (nilai >= 60) {
                    bobot = 2.50;
                } else if (nilai >= 50) {
                    bobot = 2.00;
                } else if (nilai >= 39) {
                    bobot = 1.00;
                }else if (nilai <= 39) {
                    bobot = 0.00;
                }
               nilaiAngka[i] = nilai;
                totalBobot += bobot;
                totalSKS++;
            } else {
                System.out.println("nilai ");
                return;
            }
        }
        System.out.printf("=======================%n");
        System.out.printf("%n%nHasil Konversi Nilai%n");
        System.out.printf("=======================%n");
        System.out.printf("%-40s%10s%15s%15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < totalSKS; i++) {
            double bobot = 0;
            if (nilaiAngka[i] > 80) {
                bobot = 4.0;
            } else if (nilaiAngka[i] > 73) {
                bobot = 3.50;
            } else if (nilaiAngka[i] > 65) {
                bobot = 3.00;
            } else if (nilaiAngka[i] > 60) {
                bobot = 2.50;
            } else if (nilaiAngka[i] > 50) {
                bobot = 2.00;
            } else if (nilaiAngka[i] > 39) {
                bobot = 1.00;
            }else if(nilaiAngka[i] <= 39) {
                bobot = 0.00;
            }
            System.out.printf("%-40s%10s%15s%15s%n", mataKuliah[i], nilaiAngka[i], NilaiHuruf(nilaiAngka[i]), bobot);
        }
        System.out.printf("IP SEMESTER : %.2f%n", totalBobot / totalSKS);
    }
    private static String NilaiHuruf(double nilaiSetara) {
        if (nilaiSetara > 80) {
            return "A";
        } else if (nilaiSetara > 73) {
            return "B+";
        } else if (nilaiSetara > 65) {
            return "B";
        } else if (nilaiSetara > 60) {
            return "C+";
        } else if (nilaiSetara > 50) {
            return "C";
        } else if (nilaiSetara > 39) {
            return "D";
        } else {
            return "E";
        }
    }
}