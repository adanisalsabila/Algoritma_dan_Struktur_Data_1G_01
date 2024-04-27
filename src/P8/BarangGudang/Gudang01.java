package P8.BarangGudang;

public class Gudang01 {
    Barang01[] tumpukan;
    int size;
    int top;

    public Gudang01(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang01 [size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang01 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang01 ambilBarang() {
        if (!cekKosong()) {
            Barang01 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang01 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang01 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang01 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang01 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah : " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
        public Barang01 cariBarang(Object cari) {
            if (cari instanceof String) {
                String namaBarang = (String) cari;
                return cariBarangDenganNama(namaBarang);
            } else if (cari instanceof Integer) {
                int kodeBarang = (int) cari;
                return cariBarangDenganKode(kodeBarang);
            } else {
                System.out.println("Tidak valid");
                return null;
            }
        }
    
        public Barang01 cariBarangDenganNama(String namaBarang) {
            if (!cekKosong()) {
                for (int i = top; i >= 0; i--) {
                    if (tumpukan[i].nama.equals(namaBarang)) {
                        System.out.println("Barang " + namaBarang + " ditemukan di Gudang.");
                        return tumpukan[i];
                    }
                }
                System.out.println("Barang " + namaBarang + " tidak ditemukan di Gudang.");
                return null;
            } else {
                System.out.println("Tumpukan barang kosong.");
                return null;
            }
        }
    
        public Barang01 cariBarangDenganKode(int kodeBarang) {
            if (!cekKosong()) {
                for (int i = top; i >= 0; i--) {
                    if (tumpukan[i].kode == kodeBarang) {
                        System.out.println("Barang dengan kode " + kodeBarang + " ditemukan di Gudang.");
                        return tumpukan[i];
                    }
                }
                System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan di Gudang.");
                return null;
            } else {
                System.out.println("Tumpukan barang kosong.");
                return null;
            }
        }
    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang.");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner (int kode) {
        StackKonversi01 stack = new StackKonversi01();
            while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode/2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
