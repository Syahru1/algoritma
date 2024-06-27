package UAS.Soal2;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalSystem19 rentalSystem19 = new RentalSystem19();

        while(true) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("+++++++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Kendaraan Rental Serba Serbi");
                    System.out.println("+++++++++++++++++++++++++++++++++++");
                    rentalSystem19.tampilkanDaftarBarang();
                    break;
                case 2:
                    rentalSystem19.lakukanPeminjaman(scanner);
                    break;
                case 3:
                    rentalSystem19.tampilkanSeluruhTransaksi();
                    break;
                case 4:
                    rentalSystem19.urutkanTransaksi();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
}
