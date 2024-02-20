package P2;
public class Buku01 {
    String judul, pengarang;
    int halaman, stok, harga;


    void tampilInformasi() {
    System.out.println("Judul : "+judul);
    System.out.println("Pengarang : "+pengarang);
    System.out.println("Jumlah Halaman : "+halaman);
    System.out.println("Sisa Stok : "+stok);
    System.out.println("Harga : Rp "+harga);

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

    void gantiHarga(int hrg){
        harga=hrg;
    }
}
