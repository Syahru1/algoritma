package Quiz1;

import java.util.Scanner;

public class PegawaiMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pegawai : ");
        int jumlahPegawai = sc.nextInt();
        Pegawai19[] pegawaiArray = new Pegawai19[jumlahPegawai];

        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Masukkan data pegawai ke- " + (i + 1) + " : ");
            System.out.print("Nama : ");
            String nama = sc.next();
            System.out.print("Masa kerja (Tahun) : ");
            int masaKerjaThn = sc.nextInt();
            System.out.print("Jam lembur : ");
            double jamLembur = sc.nextDouble();
            System.out.print("Gaji pokok : ");
            int gajiPokok = sc.nextInt();

            pegawaiArray[i] = new Pegawai19(nama, masaKerjaThn, jamLembur, gajiPokok);
        }

        double totalGajilebihDari5tahun = 0;
        int jumlahPegawaiLebihDari5Tahun = 0;
        for (Pegawai19 pegawai : pegawaiArray) {
            if (pegawai.masaKerjaThn > 5) {
                totalGajilebihDari5tahun += pegawai.hitungGajiTotal();
                jumlahPegawaiLebihDari5Tahun++;
            }
        }

        double rataRataGajilebihdari5Tahun = (jumlahPegawaiLebihDari5Tahun > 0) ? totalGajilebihDari5tahun / jumlahPegawaiLebihDari5Tahun : 0;
        System.out.println("Rata-rata Gaji Total (Masa Kerja > 5 Tahun): " + rataRataGajilebihdari5Tahun);

        double gajiLemburTerbesar = Double.MIN_VALUE;
        Pegawai19 pegawaiDenganGajiLemburTerbesar = null;
        for (Pegawai19 pegawai : pegawaiArray) {
            if (pegawai.masaKerjaThn > 5) {
                double gajiLemburSaatIni = pegawai.hitungGajiLembur();
                if (gajiLemburSaatIni > gajiLemburTerbesar) {
                    gajiLemburTerbesar = gajiLemburSaatIni;
                    pegawaiDenganGajiLemburTerbesar = pegawai;
                }
            }
        }

        double gajiLemburTerkecil = Double.MAX_VALUE;
        Pegawai19 pegawaiDenganGajiLemburTerkecil = null;

        for (Pegawai19 pegawai : pegawaiArray) {
            if (pegawai.masaKerjaThn < 5) {
                double gajiLemburSaatIni = pegawai.hitungGajiLembur();
                if (gajiLemburSaatIni < gajiLemburTerkecil) {
                    gajiLemburTerkecil = gajiLemburSaatIni;
                    pegawaiDenganGajiLemburTerkecil = pegawai;
                }
            }
        }
        
        if (pegawaiDenganGajiLemburTerbesar != null) {
            System.out.println("Pegawai dengan Gaji Lembur Terbesar (Masa Kerja > 5 Tahun): ");
            System.out.println("Nama: " + pegawaiDenganGajiLemburTerbesar.nama);
            System.out.println("Masa Kerja: " + pegawaiDenganGajiLemburTerbesar.masaKerjaThn + " Tahun");
            System.out.println("Jam Lembur: " + pegawaiDenganGajiLemburTerbesar.jamLembur);
            System.out.println("Gaji Pokok: " + pegawaiDenganGajiLemburTerbesar.gajiPokok);
            System.out.println("Gaji Lembur: " + pegawaiDenganGajiLemburTerbesar.hitungGajiLembur());
            System.out.println("Tunjangan: " + pegawaiDenganGajiLemburTerbesar.hitungTunjangan());
            System.out.println("Gaji Total: " + pegawaiDenganGajiLemburTerbesar.hitungGajiTotal());
        } else {
            System.out.println("Tidak ada pegawai dengan masa kerja > 5 tahun.");
        }

        if (pegawaiDenganGajiLemburTerkecil != null) {
            System.out.println("Pegawai dengan Gaji Lembur Terkecil (Masa Kerja < 5 Tahun): ");
            System.out.println("Nama: " + pegawaiDenganGajiLemburTerkecil.nama);
            System.out.println("Masa Kerja: " + pegawaiDenganGajiLemburTerkecil.masaKerjaThn + " Tahun");
            System.out.println("Jam Lembur: " + pegawaiDenganGajiLemburTerkecil.jamLembur);
            System.out.println("Gaji Pokok: " + pegawaiDenganGajiLemburTerkecil.gajiPokok);
            System.out.println("Gaji Lembur: " + pegawaiDenganGajiLemburTerkecil.hitungGajiLembur());
            System.out.println("Tunjangan: " + pegawaiDenganGajiLemburTerkecil.hitungTunjangan());
            System.out.println("Gaji Total: " + pegawaiDenganGajiLemburTerkecil.hitungGajiTotal());
        } else {
            System.out.println("Tidak ada pegawai dengan masa kerja < 5 tahun.");
        }

        sc.close();
    }
}