package Kuis2_Adani_01;

public class Kuis2_01 {
    public Node01 head;
    public Node01 tail;

    public Kuis2_01() {
        this.head = null;
        this.tail = null;
    }

    public void tambahPesanan01(Pesanan01 pesanan, Pembeli01 pembeli) {
        Node01 newNode = new Node01(pesanan, pembeli);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void semuaPesanan01() {
        Node01 current = head;
        while (current != null) {
            System.out.println(current.pesanan);
            System.out.println(current.pembeli);
            current = current.next;
        }
    }

    public int hitungTotalPendapatan01() {
        int totalPendapatan01 = 0;
        Node01 current = head;
        while (current != null) {
            totalPendapatan01 += current.pesanan.harga01;
            current = current.next;
        }
        return totalPendapatan01;
    }

    public boolean hapusPesanan01(int kodePesanan01) {
        Node01 current = head;
        while (current != null) {
            if (current.pesanan.kodePesanan01 == kodePesanan01) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void urutPesanan01() {
        if (head == null) {
            System.out.println("Tidak ada pesanan.");
            return;
        }

        Node01 current = head;
        Node01 index = null;
        Pesanan01 tempPesanan;
        Pembeli01 tempPembeli;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.pembeli.namaPembeli01.compareToIgnoreCase(index.pembeli.namaPembeli01) < 0) {

                    tempPesanan = current.pesanan;
                    current.pesanan = index.pesanan;
                    index.pesanan = tempPesanan;

                    tempPembeli = current.pembeli;
                    current.pembeli = index.pembeli;
                    index.pembeli = tempPembeli;
                }
                index = index.next;
            }
            current = current.next;
        }

        semuaPesanan01();
    }

}