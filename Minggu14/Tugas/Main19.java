package Minggu14.Tugas;

public class Main19 {
   
    public static void main(String[] args) {
        BinaryTree19 tree = new BinaryTree19();

        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        System.out.println("Nilai paling kecil    \t: " + tree.findMinValue());
        System.out.println("Nilai paling besar    \t: " + tree.findMaxValue());

        System.out.print("Data leaf node        \t: ");
        tree.displayLeafNodes();
        System.out.println();

        System.out.println("Jumlah leaf dalam tree \t: " + tree.countLeafNodes());

        System.out.print("PreOrder traversal     \t: ");
        tree.traversePreOrder();
        System.out.println();

        System.out.print("PostOrder traversal    \t: ");
        tree.traversePostOrder();
        System.out.println();

    }
}