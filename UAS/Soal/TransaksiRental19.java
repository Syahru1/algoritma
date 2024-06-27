package UAS.Soal;

public class TransaksiRental19 {
    static int autoIncrement = 1;
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental19 br;
  
    public TransaksiRental19(String namaPeminjam, int lamaPinjam, BarangRental19 br) {
      this.kodeTransaksi = autoIncrement++;
      this.namaPeminjam = namaPeminjam;
      this.lamaPinjam = lamaPinjam;
      this.br = br;
      this.totalBiaya = calculateTotalCost(lamaPinjam, br.biayaSewaPerJam);
    }
  
    private double calculateTotalCost(int hours, int rate) {
      double cost = hours * rate;
      if (hours > 78) {
        cost -= cost * 0.20; // 20% discount for rentals over 78 hours
      }
      return cost - 25000; // Discount of 25000 as per requirement D
    }
  
    public boolean shouldSwap(TransaksiRental19 other) {
      char firstLetterA = this.namaPeminjam.toUpperCase().charAt(0);
      char firstLetterB = other.namaPeminjam.toUpperCase().charAt(0);
  
      if (firstLetterA >= 'A' && firstLetterA <= 'M' && firstLetterB >= 'A' && firstLetterB <= 'M') {
        return this.br.noTNKB.compareTo(other.br.noTNKB) < 0; // Descending TNKB
      } else if (firstLetterA >= 'N' && firstLetterA <= 'Z' && firstLetterB >= 'N' && firstLetterB <= 'Z') {
        return this.namaPeminjam.compareTo(other.namaPeminjam) < 0; // Descending name
      }
      return false;
    }
  
    public void displayInfo() {
      System.out.println("Kode Transaksi: " + kodeTransaksi);
      System.out.println("Nama Peminjam: " + namaPeminjam);
      System.out.println("Lama Pinjam: " + lamaPinjam + " jam");
      System.out.println("Total Biaya: Rp " + totalBiaya);
      br.displayInfo();
    }
  }
