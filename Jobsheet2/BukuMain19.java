public class BukuMain19 {
    public static void main(String[] args) {
        Buku19 bk1 = new Buku19();

        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.stok = bk1.stok-5;
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        System.out.println("Harga yang terjual: " + bk1.hitungHargaTotal(5));
        System.out.println("Diskon : " + bk1.hitungDiskon(5));


        Buku19 bk2 = new Buku19("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku19 bukuSyahrul = new Buku19("Pemrograman Java", "Denanda Pratiwi", 300, 20, 100000);
        bukuSyahrul.tampilInformasi();
    }
}