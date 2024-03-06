package Jobsheet3.Latihan2;
import java.util.Scanner;

public class MahasiswaModif {
    public String nama, nim;
    public double ipk;
    public char jenis_kelamin;

    public void inputData(Scanner sc) {
        System.out.print("Masukkan nama Mahasiswa : ");
        nama = sc.next();
        System.out.print("Masukkan nim Mahasiswa : ");
        nim = sc.next();
        System.out.print("Masukkan Jenis Kelamin Mahasiswa : ");
        jenis_kelamin = sc.next().charAt(0);
        System.out.print("Masukkan ipk Mahasiswa : ");
        ipk = sc.nextDouble();
        System.out.println("");
    }

    public void displayData(int index) {
        System.out.println("Data Mahasiswa ke-" + (index + 1));
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jenis Kelamin : " + jenis_kelamin);
        System.out.println("Nilai IPK : " + ipk);
    }

    public static double calculateAverageIPK(MahasiswaModif[] mhs) {
        double totalIPK = 0;
        for (MahasiswaModif mahasiswa : mhs) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mhs.length;
    }

    public static MahasiswaModif findHighestIPK(MahasiswaModif[] mhs) {
        MahasiswaModif highestIPKStudent = mhs[0];
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].ipk > highestIPKStudent.ipk) {
                highestIPKStudent = mhs[i];
            }
        }
        return highestIPKStudent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaModif[] mhs = new MahasiswaModif[3];

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            mhs[i] = new MahasiswaModif();
            mhs[i].inputData(sc);
        }

        for (int i = 0; i < mhs.length; i++) {
            mhs[i].displayData(i);
        }

        double averageIPK = calculateAverageIPK(mhs);
        System.out.println("Rata-rata IPK : " + averageIPK);

        MahasiswaModif highestIPKStudent = findHighestIPK(mhs);
        System.out.println("Mahasiswa dengan IPK tertinggi:");
        highestIPKStudent.displayData(-1);
    }
}
