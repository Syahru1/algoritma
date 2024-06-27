package UAS.Soal;

public class BarangRental19 {
    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewaPerJam;
  
    public BarangRental19(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewaPerJam) {
      this.noTNKB = noTNKB;
      this.namaKendaraan = namaKendaraan;
      this.jenisKendaraan = jenisKendaraan;
      this.tahun = tahun;
      this.biayaSewaPerJam = biayaSewaPerJam;
    }
  
    public void displayInfo() {
      System.out.println("No TNKB: " + noTNKB);
      System.out.println("Nama Kendaraan: " + namaKendaraan);
      System.out.println("Jenis Kendaraan: " + jenisKendaraan);
      System.out.println("Tahun: " + tahun);
      System.out.println("Biaya Sewa per Jam: " + biayaSewaPerJam);
    }
  }
