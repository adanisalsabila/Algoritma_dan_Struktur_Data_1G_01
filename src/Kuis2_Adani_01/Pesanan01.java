package Kuis2_Adani_01;

public class Pesanan01 {
    int kodePesanan01;
    String namaPesanan01;
    int harga01;

    public Pesanan01(int kodePesanan01, String namaPesanan01, int harga01) {
        this.kodePesanan01 = kodePesanan01;
        this.namaPesanan01 = namaPesanan01;
        this.harga01 = harga01;
    }

    public String toString() {
        return "\n-" + kodePesanan01 + "\nNama Pesanan: " + namaPesanan01 + "\nHarga: " + harga01;
    }
}
