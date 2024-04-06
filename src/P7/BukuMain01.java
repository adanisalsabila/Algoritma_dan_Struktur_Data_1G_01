package P7;

import java.util.Scanner;

public class BukuMain01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PencarianBuku01 data = new PencarianBuku01();
        int jumBuku = 5;

        System.out.println("----------------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("---------------");
            System.out.println("Kode Buku\t: ");
            int kodeBuku = s.nextInt();
            s.nextLine();
            System.out.println("Judul Buku\t: ");
            String judulBuku = s.nextLine();
            System.out.println("Tahun Terbit\t: ");
            int tahunTerbit = s.nextInt();
            s.nextLine();
            System.out.println("Pengarang\t: ");
            String pengarang = s.nextLine();
            System.out.println("Stock\t: ");
            int stock = s.nextInt();

            Buku01 m = new Buku01(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("---------------------------");
        System.out.println("Data keseluruhan buku : ");
        data.tampil();

        System.out.println("______________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang dicari : ");
        System.out.println("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);

        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        Buku01 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();
    }
}
