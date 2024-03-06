package Jobsheet3;

public class Segitiga19 {
    public int alas;
    public int tinggi;

    public Segitiga19(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public int hitungKeliling() {
        int sisiMiring = (int) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + sisiMiring + tinggi;
    }

    public static void main(String[] args) {
        Segitiga19[] sgArray = new Segitiga19[4];
        sgArray[0] = new Segitiga19(10, 4);
        sgArray[1] = new Segitiga19(20, 10);
        sgArray[2] = new Segitiga19(15, 6);
        sgArray[3] = new Segitiga19(25, 10);

        for(int i = 0; i < sgArray.length; i++) {
            System.out.println("=============================");
            System.out.println("Luas Segitiga siku ke-" + i + ": " + sgArray[i].hitungLuas());
            System.out.println("Keliling Segitiga siku ke-" + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}
