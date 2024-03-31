package Jobsheet6;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DaftarMahasiswaBerprestasi19 list = new DaftarMahasiswaBerprestasi19();
        Mahasiswa19 m1 = new Mahasiswa19("Nusa", 2017, 25, 3);
        Mahasiswa19 m2 = new Mahasiswa19("Rara", 2012, 19, 4);
        Mahasiswa19 m3 = new Mahasiswa19("Dompu", 2018, 19, 3.5);
        Mahasiswa19 m4 = new Mahasiswa19("Abdul", 2017, 23, 2);
        Mahasiswa19 m5 = new Mahasiswa19("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertSort();
        list.tampil();
    }
}
