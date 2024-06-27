package Minggu15.Percobaan2;

import java.util.Stack;

public class Graph19 {
    int vertex;
    DoubleLinkedLists19 list[];

    public Graph19(int v){
        vertex = v;
        list = new DoubleLinkedLists19[v];
        for(int i = 0; i<v; i++){
            list[i] = new DoubleLinkedLists19();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
        //jika undirected
        //list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for(int i = 0; i<vertex; i++){
            //inDegree
            for(int j = 0; j<list[i].size(); j++){
                if (list[i].get(j)==asal) {
                    ++totalIn;
                }
            }
            //outdegrree
            /*for(k = 0; k <list[asal].size();k++){
                list[asal].get(k);
            }
            totalOut = k;*/
        }
        totalOut = list[asal].size();
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree total dari Gedung " + (char) ('A' + asal) + " : " + (totalIn+totalOut));
        System.out.println();

        // JIKA UNDIRECTED
        // System.out.println("Degree out dari gedung " + (char) ('A' + asal) + " : " + list[asal].size());
    }

    // public void removeEdge(int asal, int tujuan) throws Exception{
    //     for(int i = 0; i<vertex; i++){
    //         if (i==tujuan) {
    //             list[asal].remove(tujuan);
    //         }
    //     }
    // }

    public void removeEdge(int asal, int tujuan) throws Exception {
        if (asal < 0 || asal >= vertex || tujuan < 0 || tujuan >= vertex) {
            throw new Exception("Nilai indeks diluar batas.");
        }
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].remove(i);
                break;
            }
        }
    }
    
    

    public void removeAllEdges(){
        for(int i = 0; i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++){
            if (list[i].size()>0) {
                System.out.print("Gedung " + (char) ('A' + i ) + " terhubung dengan : ");
                for(int j = 0; j <list[i].size(); j++){
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean checkPath(int asal, int tujuan) throws Exception {
        boolean[] visited = new boolean[vertex];
        return checkPathUtil(asal, tujuan, visited);
    }

    private boolean checkPathUtil(int asal, int tujuan, boolean[] visited) throws Exception {
        // Tandai node saat ini sebagai sudah dikunjungi
        visited[asal] = true;

        // Jika node saat ini sama dengan tujuan, maka terdapat jalur
        if (asal == tujuan) {
            return true;
        }

        // Cari jalur dari node saat ini ke node tujuan
        for (int i = 0; i < list[asal].size(); i++) {
            int nextNode = list[asal].get(i);
            if (!visited[nextNode]) {
                if (checkPathUtil(nextNode, tujuan, visited)) {
                    return true;
                }
            }
        }

        // Jika tidak ditemukan jalur, kembalikan false
        return false;
    }

}