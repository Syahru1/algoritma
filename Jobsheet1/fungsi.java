package Jobsheet1;
public class fungsi {
    private static final int JumlahBunga = 4;
    private static final String[] NamaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    private static final int[] hargaBunga = {75000, 50000, 60000, 10000};
    private static final int[][] Persediaan = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    public static void main(String[] args) {
        System.out.println("1. Pendapatan Setiap Cabang Jika Semua Bunga Terjual: ");
        for (int i = 0; i < Persediaan.length; i++) {
            int Pendapatan = 0;
            for (int j = 0; j < JumlahBunga; j++) {
                Pendapatan += Persediaan[i][j] * hargaBunga[j];
            }
            System.out.println("Cabang RoyalGarden " + (i+1) + ": " + Pendapatan);
        }
        int[] stocksRoyalGarden4 = getStocksPerFlower(3);
        System.out.println("\n2. Jumlah Stock Setiap Jenis Bunga pada Cabang RoyalGarden 4: ");
        for(int i = 0; i < JumlahBunga; i++) {
            System.out.println(NamaBunga[i] + ": " + stocksRoyalGarden4[i]);
        }

        decreaseStok("Aglonema", 3, 1);
        decreaseStok("Keladi", 3, 2);
        decreaseStok("Alocasia", 3, 0);
        decreaseStok("Mawar", 3, 5);

        System.out.println("\nJumlah Stock Setelah Pengurangan Bunga Mati pada Cabang RoyalGarden 4: ");
        for (int i = 0; i < JumlahBunga; i++) {
            System.out.println(NamaBunga[i] + ": " + Persediaan[3][i]); 
        }
    }

    public static int[] getStocksPerFlower(int branch) {
        int[] stocks = new int[JumlahBunga];
        for (int i = 0; i < JumlahBunga; i++) {
            stocks[i] = Persediaan[branch][i];
        } 
        return stocks; 
    }

    private static void decreaseStok(String flowerName, int branch, int decreaseAmount) {
        int index = -1;
        for (int i = 0; i < JumlahBunga; i++) {
            if (NamaBunga[i].equals(flowerName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Persediaan[branch][index] -= decreaseAmount;
        }
    }
}