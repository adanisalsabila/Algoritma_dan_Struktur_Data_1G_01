package P6.LatihanPraktikum;

public class Hotel {
    public String nama, kota;
    public int harga;
    public byte bintang;

    // Constructor
    public Hotel(String nama, int harga, byte bintang) {
        this.nama = nama;
        this.harga = harga;
        this.bintang = bintang;
    }

    // Getters
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public byte getBintang() {
        return bintang;
    }
}