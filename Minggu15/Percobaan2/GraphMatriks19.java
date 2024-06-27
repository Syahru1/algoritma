package Minggu15.Percobaan2;

public class GraphMatriks19 {
    int vertex;
    int[][] matriks;

    public GraphMatriks19(int v){
        vertex = v;
        matriks = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = -1;
            }
        }
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan]=jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan]= -1;
    }

    public void printGraph(){
        for(int i = 0; i < vertex; i++) {
            System.out.print("Gedung " +(char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " +(char) ('A'+j)+" ("+ matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }
    
    public void degree(int asal) {
        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // Menghitung inDegree
            if (matriks[i][asal] != -1) {
                totalIn++;
            }
            // Menghitung outDegree
            if (matriks[asal][i] != -1) {
                totalOut++;
            }
        }
        System.out.println("\nGedung " + (char) ('A' + asal));
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree total dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
        System.out.println();
    }
    

}
