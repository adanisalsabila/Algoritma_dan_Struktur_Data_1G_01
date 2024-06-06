package P15;

public class Graph01 {
    int vertex;
    DoubleLinkedList01[] list;

    public Graph01(int v) {
        vertex = v;
        list = new DoubleLinkedList01[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList01();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
        }

        for (k = 0; k < list[asal].size(); k++) {
            list[asal].get(k);
        }

        totalOut = list[asal].size();

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
            }
        }
        list[asal].remove(tujuan);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan.");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
