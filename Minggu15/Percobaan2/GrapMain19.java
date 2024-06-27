package Minggu15.Percobaan2;

public class GrapMain19 {
    public static void main(String[] args) throws Exception {

        Graph19 grp = new Graph19(4);
        GraphMatriks19 gdg19 = new GraphMatriks19(4);
        gdg19.makeEdge(0, 1, 50);
        gdg19.makeEdge(1, 0, 60);
        gdg19.makeEdge(1, 2, 70);
        gdg19.makeEdge(2, 1, 80);
        gdg19.makeEdge(2, 3, 40);
        gdg19.makeEdge(3, 0, 90);
        gdg19.printGraph();

        
        // gdg19.degree(0);
        // gdg19.degree(1);
        // gdg19.degree(2);
        // gdg19.degree(3);

        System.out.println();
        System.out.println("Hasil setelah penghapusan edge");
        gdg19.removeEdge(2, 1);
        gdg19.printGraph();

    
    }
}