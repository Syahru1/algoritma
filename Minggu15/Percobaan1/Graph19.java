package Minggu15.Percobaan1;

import java.util.Stack;

public class Graph19 {
    int vertex;
    DoubleLinkedList19 list[];

    public Graph19(int v) {
        vertex = v;
        list = new DoubleLinkedList19[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList19();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        if (list[asal] != null) {
            list[asal].remove(tujuan);
        } else {
            throw new Exception("Vertex asal tidak ada dalam graf.");
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean isPath(int asal, int tujuan) {
        boolean[] visited = new boolean[vertex];
        Stack<Integer> stack = new Stack<>();
        stack.push(asal);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (node == tujuan) {
                return true;
            }

            if (!visited[node]) {
                visited[node] = true;

                for (int i = 0; i < list[node].size(); i++) {
                    try {
                        int neighbor = list[node].get(i);
                        if (!visited[neighbor]) {
                            stack.push(neighbor);
                        }
                    } catch (Exception e) {
                        System.out.println("Error accessing node: " + e.getMessage());
                    }
                }
            }
        }

        return false;
    }
}