package Kuis1_Adani;

public class AlbumMain01 {
    public static void main(String[] args) {
        Album01 al1 = new Album01(null, null, 0, 0);
        al1.judul = "KOKOBOP";
        al1.penyanyi = "EXO";
        al1.stok = 10;
        al1.harga = 300000;

        al1.tampilInformasiAlbum();
        al1.terjual(5);
        al1.gantiHarga(60000);
        al1.tampilInformasiAlbum();

        Album01 al2 = new Album01("CANDY", "NCT DREAM", 30, 400000);
        al2.terjual(2);
        al2.tampilInformasiAlbum();

        Album01 al3 = new Album01("RESONANCE", "NCT U", 7, 270000);
        al3.terjual(2);
        al3.tampilInformasiAlbum();

        Album01 al4 = new Album01("YOUNG COOKIES", "NEW JEANS", 12, 210000);
        al4.terjual(5);
        al4.tampilInformasiAlbum();

        Album01 al5 = new Album01("END HOME", "SEVENTEEN", 10, 290000);
        al5.terjual(4);
        al5.tampilInformasiAlbum();

    }

}
