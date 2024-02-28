import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        
        System.out.print("Masukkan nilai tugas (0-100): ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis (0-100): ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS (0-100): ");
        int nilaiUTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS (0-100): ");
        int nilaiUAS = sc.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");

        if (!(nilaiTugas >= 0 && nilaiTugas <= 100)|| !(nilaiKuis >= 0 && nilaiKuis <= 100)|| 
            !(nilaiUTS >= 0 && nilaiUTS <= 100)|| !(nilaiUAS >= 0 && nilaiUAS <= 100)) {
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
            return;
        }

        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.30 * nilaiUTS + 0.30 * nilaiUAS;
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        String nilaiHuruf;
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        }else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        }else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        }else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        }else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        }else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        }else {
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Huruf : " + nilaiHuruf);

        String keterangan = (nilaiHuruf.equals("E") || nilaiHuruf.equals("D")) ? "MAAF ANDA TIDAK LULUS" : "SELAMAT ANDA LULUS";
        System.out.println("Keterangan: " + keterangan);
    }
}