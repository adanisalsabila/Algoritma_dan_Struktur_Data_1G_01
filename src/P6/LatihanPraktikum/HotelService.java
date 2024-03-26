package P6.LatihanPraktikum;

public class HotelService {
    void bubbleSort(Hotel[] hotels) {
        int n = hotels.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (hotels[j].getHarga() > hotels[j + 1].getHarga()) {
                    // Swap hotels
                    Hotel temp = hotels[j];
                    hotels[j] = hotels[j + 1];
                    hotels[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort(Hotel[] hotels) {
        int n = hotels.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (hotels[j].getBintang() > hotels[maxIdx].getBintang()) {
                    maxIdx = j;
                }
            }
            // swap hotels
            Hotel temp = hotels[maxIdx];
            hotels[maxIdx] = hotels[i];
            hotels[i] = temp;
        }
    }

    void tambah(Hotel H, Hotel[] hotels) {
        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i] == null) {
                hotels[i] = H;
                System.out.println("Hotel berhasil ditambahkan.");
                return; 
            }
        }
        System.out.println("Kamar penuh, tidak bisa menambahkan hotel baru.");
    }
    
    void tampilAll(Hotel[] hotels) {
        System.out.println("Daftar Hotel:");
        for (Hotel hotel : hotels) {
            if (hotel != null) {
                System.out.println("Nama: " + hotel.getNama() + ", Harga: Rp." + hotel.getHarga() + ", Bintang: " + hotel.getBintang());
            }
        }
    }
}
