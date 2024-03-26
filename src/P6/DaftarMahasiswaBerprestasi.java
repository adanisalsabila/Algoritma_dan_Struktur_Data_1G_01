package P6;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    // method tambah()

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    // method tampil()

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("----------------------");
        }
    }

    // method bubbleSort()

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - i - 1; j++) {
                if (listMhs[j].ipk > listMhs[j + 1].ipk) {
                    // proses swap
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }
}
