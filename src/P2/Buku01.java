package P2;

public class Buku01 {
    public Buku01() {
    }

    public Buku01(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
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

    int hitungHargaTotal(int jumlahTerjual) {
        return harga * jumlahTerjual;
    }

    double hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            return 0.12 * hargaTotal;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return 0.05 * hargaTotal;
        } else {
            return 0;
        }
    }

    double hitungHargaBayar(int hargaTotal, double diskon) {
        return hargaTotal - diskon;
    }
}