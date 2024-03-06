package Jobsheet1;
import java.util.Scanner;

public class plat {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
            {"B", "A", "N", "T", "E", "N"},
            {"J", "A", "K", "A", "R", "T", "A"},
            {"B", "A", "N", "D", "U", "N", "G",},
            {"C", "I", "R", "E", "B", "O", "N"},
            {"B", "O", "G", "O", "R"},
            {"P", "E", "K", "A", "L", "O", "N", "G", "A", "N"},
            {"S", "E", "M", "M", "A", "R", "A", "N", "G"},
            {"S", "U", "R", "A", "B", "A", "Y", "A"},
            {"M", "A", "L", "A", "N", "G"},
            {"T", "E","G","A","L"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode nomot plat: ");
        char inputKode = sc.next().charAt(0);

        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if(KODE[i] == inputKode) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Kota: " + inputKode + " : ");
            for (int j = 0; j < KOTA[index].length; j++) {
                System.out.print(KOTA[index][j]);
            }
        }else {
            System.out.println("Kode plat " + inputKode + " tidak ditemukan.");
        }
    }
}