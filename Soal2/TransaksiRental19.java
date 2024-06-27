package UAS.Soal2;

public class TransaksiRental19 {
    private int kodeTransaksi;
    private String namaPeminjam;
    private int lamaPinjam;
    private double totalBiaya;
    private BarangRental19 br;
    private TransaksiRental19 prev;
    private TransaksiRental19 next;

    public TransaksiRental19(int kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBiaya, BarangRental19 br) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.br = br;
    }

    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(int kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public void setLamaPinjam(int lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }

    public BarangRental19 getBr() {
        return br;
    }

    public void setBr(BarangRental19 br) {
        this.br = br;
    }

    public TransaksiRental19 getPrev() {
        return prev;
    }

    public void setPrev(TransaksiRental19 prev) {
        this.prev = prev;
    }

    public TransaksiRental19 getNext() {
        return next;
    }

    public void setNext(TransaksiRental19 next) {
        this.next = next;
    }
}