package Jobsheet1;
import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        String NIM = sc.nextLine();
        int n = Integer.parseInt(NIM.substring(NIM.length() - 2));

        if (n < 10) {
            n += 10;
        }

        System.out.print("Output: ");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}