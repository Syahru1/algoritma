package Minggu15.Tugas;

import java.util.Scanner;

public class GraphMain19 {
     public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        GraphMatriks19 gdg02 = new GraphMatriks19(4);

        int pilihan = 0;
        do {
            System.out.println("====================");
            System.out.println("Graph");
            System.out.println("====================");
            System.out.println("Menu Program:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    gdg02.makeEdge(asal, tujuan, jarak);
                    System.out.println("Edge berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    gdg02.removeEdge(asal, tujuan);
                    System.out.println("Edge berhasil dihapus.");
                    break;
                case 3:
                    System.out.print("Masukkan vertex: ");
                    int vertex = scanner.nextInt();
                    gdg02.degree(vertex);
                    break;
                case 4:
                    gdg02.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    boolean adaEdge = gdg02.checkEdge(asal, tujuan);
                    if (adaEdge) {
                        System.out.println("Edge antara Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " ada/terhubung");
                    } else {
                        System.out.println("Edge antara Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak ada/tidak terhubung");
                    }
                    break;
                case 6:
                    gdg02.printGraph();
                    System.out.println("\nUpdate Jarak");
                    System.out.print("Masukkan asal : ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan : ");
                    tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = scanner.nextInt();
                    gdg02.updateJarak(asal, tujuan, jarak);
                    System.out.println("\nJarak antara Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " berhasil diperbarui.");
                    gdg02.printGraph();
                    break;
                case 7:
                    int jumlahEdge = gdg02.hitungEdge();
                    System.out.println("Jumlah edge dalam graf: " + jumlahEdge);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            System.out.println();
        } while (pilihan != 0);

        scanner.close();
    }
}
