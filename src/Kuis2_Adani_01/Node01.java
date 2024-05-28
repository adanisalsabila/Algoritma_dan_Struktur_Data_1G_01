package Kuis2_Adani_01;

public class Node01 {
    Pesanan01 pesanan;
    Pembeli01 pembeli;
    Node01 next;
    Node01 prev;

    public Node01(Pesanan01 pesanan, Pembeli01 pembeli) {
        this.next = null;
        this.prev = null;
        this.pesanan = pesanan;
        this.pembeli = pembeli;
        
    }
}
