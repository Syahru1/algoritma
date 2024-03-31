package Jobsheet5.Latihan;
import java.util.Scanner;

public class MobilMain19 {
    static Scanner scanner = new Scanner(System.in);

    public static Mobil19[] bacaDataMobil() {
        System.out.print("Masukkan jumlah mobil: ");
        int jumlahMobil = scanner.nextInt();
        Mobil19[] mobilList = new Mobil19[jumlahMobil];
        for (int i = 0; i < jumlahMobil; i++) {
            System.out.println("Mobil ke-" + (i+1) + ":");
            scanner.nextLine(); 
            System.out.print("Merk: ");
            String merk = scanner.nextLine();
            System.out.print("Tipe: ");
            String tipe = scanner.nextLine();
            System.out.print("Tahun: ");
            int tahun = scanner.nextInt();
            System.out.print("Top acceleration: ");
            int topAcceleration = scanner.nextInt();
            System.out.print("Top power: ");
            int topPower = scanner.nextInt();
            mobilList[i] = new Mobil19(merk, tipe, tahun, topAcceleration, topPower);
        }
        return mobilList;
    }

    public static int findMaxTopAcceleration(Mobil19[] mobil, int low, int high) {
        if (low == high) {
            return mobil[low].top_acceleration;
        }
        else if (high - low == 1) {
            return Math.max(mobil[low].top_acceleration, mobil[high].top_acceleration);
        } else {
            int mid = (low + high) / 2;
            int leftMax = findMaxTopAcceleration(mobil, low, mid);
            int rightMax = findMaxTopAcceleration(mobil, mid + 1, high);
            return Math.max(leftMax, rightMax);
        }
    }

    public static int findMinTopAcceleration(Mobil19[] mobil, int low, int high) {
        if (low == high) {
            return mobil[low].top_acceleration;
        }
        else if (high - low == 1) {
            return Math.min(mobil[low].top_acceleration, mobil[high].top_acceleration);
        } else {
            int mid = (low + high) / 2;
            int leftMin = findMinTopAcceleration(mobil, low, mid);
            int rightMin = findMinTopAcceleration(mobil, mid + 1, high);
            return Math.min(leftMin, rightMin);
        }
    }

    public static double calculateAverageTopPower(Mobil19[] mobil) {
        int totalPower = 0;
        for (Mobil19 car : mobil) {
            totalPower += car.top_power;
        }
        return (double) totalPower / mobil.length;
    }

    public static void main(String[] args) {
        Mobil19[] mobilList = bacaDataMobil();

        int maxTopAcceleration = findMaxTopAcceleration(mobilList, 0, mobilList.length - 1);
        System.out.println("Top acceleration tertinggi: " + maxTopAcceleration);

        int minTopAcceleration = findMinTopAcceleration(mobilList, 0, mobilList.length - 1);
        System.out.println("Top acceleration terendah: " + minTopAcceleration);

        double averageTopPower = calculateAverageTopPower(mobilList);
        System.out.println("Rata-rata top power: " + averageTopPower);
    }
}