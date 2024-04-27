package P8.BarangGudang;

import java.util.Scanner;

public class Utama01 {
    public static void main(String[] args) {
        Gudang01 gudang = new Gudang01(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang berdasarkan kode");
            System.out.println("7. Cari barang berdasarkan nama");
            System.out.println("8. Keluar");
            System.out.println("Pilih Operasi :");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan kode barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukkan nama barang : ");
                    String nama = scanner.nextLine();
                    System.out.println("Masukkan nama kategori : ");
                    String kategori = scanner.nextLine();
                    Barang01 barangBaru = new Barang01(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2 :
                    gudang.ambilBarang();
                    break;
                case 3 :
                    gudang.tampilkanBarang();
                    break;
                case 4 :
                    gudang.lihatBarangTeratas(); 
                    break;
                case 5 :
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Masukkan kode barang yang akan dicari : ");
                    int kodeBarang = scanner.nextInt();
                    gudang.cariBarangDenganKode(kodeBarang);
                    break;
                case 7 :
                    scanner.nextLine();
                    System.out.println("Masukkan kode barang yang akan dicari : ");
                    String namaBarang = scanner.nextLine();
                    gudang.cariBarangDenganNama(namaBarang);
                    break;
                case 8 :
                System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }   
}
