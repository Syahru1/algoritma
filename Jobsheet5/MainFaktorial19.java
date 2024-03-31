package Jobsheet5;
import java.util.Scanner;
public class MainFaktorial19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial19[] fk = new Faktorial19[iJml];
        for(int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial19();
            System.out.println("Masukkan nilai data ke-" + (i+1) + ": ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("HASIL -- BRUTE FORCE");
        for(int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL -- DIVINE AND CONQUER");
        for(int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
