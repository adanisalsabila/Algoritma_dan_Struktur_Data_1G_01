package P15;

import java.util.Scanner;

public class GraphMain01 {
public static void main(String[] args) throws Exception {
    Graph01 gedung = new Graph01(6);
    gedung.addEdge(0, 1, 50);
    gedung.addEdge(0, 2, 100);
    gedung.addEdge(1, 3, 70);
    gedung.addEdge(2, 3, 40);
    gedung.addEdge(3, 4, 60);
    gedung.addEdge(4, 5, 80);

    gedung.printGraph();

    gedung.removeEdge(1, 3);
    gedung.printGraph();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan gedung asal : ");
    int asal = scanner.nextInt();
    System.out.print("Masukkan gedung tujuan : ");
    int tujuan = scanner.nextInt();

    if (gedung.isConnected(asal, tujuan)) {
        System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " bertetangga.");
    } else {
        System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak bertetangga.");
    }

    scanner.close();
}
}
