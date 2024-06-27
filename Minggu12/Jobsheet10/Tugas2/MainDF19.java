package Minggu12.Jobsheet10.Tugas2;

import java.util.Scanner;

public class MainDF19 {

    public static void main(String[] args) throws Exception {
        DaftarFilmDLL19 daftar = new DaftarFilmDLL19();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("==============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data film posisi awal");
                    System.out.print("ID Film : ");
                    String id = scanner.nextLine();
                    System.out.print("Judul Film : ");
                    String judul = scanner.nextLine();
                    System.out.print("Rating Film : ");
                    double rating = scanner.nextDouble();
                    Film19 filmBaru = new Film19(id, judul, rating);
                    daftar.addFirst(filmBaru);
                    break;
                case 2:
                    System.out.println("Masukkan data film posisi akhir");
                    System.out.print("ID Film : ");
                    id = scanner.nextLine();
                    System.out.print("Judul Film : ");
                    judul = scanner.nextLine();
                    System.out.print("Rating Film : ");
                    rating = scanner.nextDouble();
                    filmBaru = new Film19(id, judul, rating);
                    daftar.addLast(filmBaru);
                    break;
                case 3:
                    System.out.println("Masukkan data film urutan ke-");
                    int index = scanner.nextInt();
                    scanner.nextLine();  // Konsumsi newline
                    System.out.print("ID Film : ");
                    id = scanner.nextLine();
                    System.out.print("Judul Film : ");
                    judul = scanner.nextLine();
                    System.out.print("Rating Film : ");
                    rating = scanner.nextDouble();
                    filmBaru = new Film19(id, judul, rating);
                    daftar.add(filmBaru, index);
                    break;
                case 4:
                    daftar.removeFirst();
                    break;
                case 5:
                    daftar.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan indeks yang akan dihapus: ");
                    index = scanner.nextInt();
                    daftar.remove(index);
                    break;
                case 7:
                    daftar.daftarFilm();
                    break;
                case 8:
                    System.out.print("Masukkan ID film: ");
                    id = scanner.nextLine();
                    try {
                        Film19 film = daftar.getId(id);
                        System.out.println(film);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 9:
                    daftar.daftarFilmRatingDESC();
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
