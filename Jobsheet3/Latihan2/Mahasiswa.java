package Jobsheet3.Latihan2;
import java.util.Scanner;
public class Mahasiswa {
    public String nama, nim;
    public double ipk;
    public char jenis_kelamin;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] mhs = new Mahasiswa[3];
        for(int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama Mahasiswa : ");
            mhs[i].nama = sc.next();
            System.out.print("Masukkan nim Mahasiswa : ");
            mhs[i].nim = sc.next();
            System.out.print("Masukkan Jenis Kelamin Mahasiswa : ");
            mhs[i].jenis_kelamin = sc.next().charAt(0);
            System.out.print("Masukkan ipk Mahasiswa : ");
            mhs[i].ipk = sc.nextDouble();
            System.out.println("");
        }

        for(int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + mhs[i].nama);
            System.out.println("NIM : " + mhs[i].nim);
            System.out.println("Jenis Kelamin : " + mhs[i].jenis_kelamin);
            System.out.println("Nilai IPK : " + mhs[i].ipk);
        }
    }
}
