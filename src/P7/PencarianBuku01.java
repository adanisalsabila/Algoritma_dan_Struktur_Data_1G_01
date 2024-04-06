package P7;

public class PencarianBuku01 {
    Buku01 listBk[] = new Buku01[5];
    int idx;

    public void tambah(Buku01 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (Buku01 m : listBk) {
            if (m != null) {
                m.tampilDataBuku();
            }
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1; // Initialize posisi to -1, indicating not found
        for (int j = 0; j < idx; j++) { // Loop through valid elements only (up to idx)
            if (listBk[j].kodeBuku == cari) {
                posisi = j; // Update posisi if book is found
                break;
            }
        }
        return posisi;
    }

    public Buku01 FindBuku(int cari) {
        for (int j = 0; j < idx; j++) {
            if (listBk[j].kodeBuku == cari) {
                return listBk[j]; // Mengembalikan buku jika ditemukan
            }
        }
        return null; // Mengembalikan null jika buku tidak ditemukan
    }


    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul Buku\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}