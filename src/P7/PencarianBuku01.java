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
        int posisi = -1; 
        for (int j = 0; j < idx; j++) { 
            if (listBk[j].kodeBuku == cari) {
                posisi = j; 
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
    
            if (listBk[mid].kodeBuku == cari) {
                return mid;
            } else if (listBk[mid].kodeBuku < cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1; 
    }
    

    public Buku01 FindBuku(int cari) {
        for (int j = 0; j < idx; j++) {
            if (listBk[j].kodeBuku == cari) {
                return listBk[j]; 
            }
        }
        return null; 
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
