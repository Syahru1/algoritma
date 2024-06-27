package Minggu15.Percobaan2;

public class GraphMain19 {
    public static void main(String[] args) throws Exception {

        // Graph02 gdg = new Graph02(4);
        GraphMatriks19 gdg01 = new GraphMatriks19(4);
        gdg01.makeEdge(0, 1, 50);
        gdg01.makeEdge(1, 0, 60);
        gdg01.makeEdge(1, 2, 70);
        gdg01.makeEdge(2, 1, 80);
        gdg01.makeEdge(2, 3, 40);
        gdg01.makeEdge(3, 0, 90);
        gdg01.printGraph();

        
        gdg01.degree(0);
        gdg01.degree(1);
        gdg01.degree(2);
        gdg01.degree(3);

        System.out.println();
        System.out.println("Hasil setelah penghapusan edge");
        gdg01.removeEdge(2, 1);
        gdg01.printGraph();

    
    }
}