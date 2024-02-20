package P2;

public class Buku01 {
    public Buku01(){
    }

public Buku01 (String jud, String pg, int hal, int stok, int har){
    judul = jud;
    pengarang = pg;
    halaman=hal;
    this.stok=stok;
    harga=har;
}

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa Stok : " + stok);
        System.out.println("Harga : Rp " + harga);

    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            if (stok < 0) {
                stok = 0;
            }
        } else {
            System.out.println("Stok sudah habis.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}
