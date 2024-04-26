package UTS_Adani;

public class PencarianBankAdani {
    BankAdani listNasabahAdani[] = new BankAdani[6];
    int idx;

    public void tambah(BankAdani m) {
        if (idx < listNasabahAdani.length) {
            listNasabahAdani[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampilAdani() {
        for (BankAdani m : listNasabahAdani) {
            if (m != null) {
                m.tampilDataNasabahAdani();
            }
        }
    }

    public void urutSaldoTerbesarAdani() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = i + 1; j < idx; j++) {
                if (listNasabahAdani[i].saldoAdani < listNasabahAdani[j].saldoAdani) {
                    BankAdani temp = listNasabahAdani[i];
                    listNasabahAdani[i] = listNasabahAdani[j];
                    listNasabahAdani[j] = temp;
                }
            }
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            int compareResult = listNasabahAdani[mid].nikAdani.compareTo(cari);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void tampilPosisiNasabahAdani(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilDataNasabahAdani(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nomor Rekening\t : " + listNasabahAdani[pos].norekAdani);
            System.out.println("Nama Nasabah\t : " + listNasabahAdani[pos].namaAdani);
            System.out.println("NIK\t : " + listNasabahAdani[pos].nikAdani);
            System.out.println("Umur\t : " + listNasabahAdani[pos].umurAdani);
            System.out.println("Saldo\t : " + listNasabahAdani[pos].saldoAdani);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}