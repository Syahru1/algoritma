package Minggu15.Percobaan1;
import java.util.Scanner;

public class GrapMain19 {
    public static void main(String[] args) throws Exception {
        Graph19 gedung = new Graph19(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();

        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan gedung asal: ");
        int asal = scanner.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = scanner.nextInt();

        // Mengecek apakah terdapat jalur antara dua gedung
        if (gedung.checkPath(asal, tujuan)) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        }

        // Menutup scanner
        scanner.close();
    
    }
}