package Kuis2_Adani_01;

import java.util.Scanner;

public class Kuis2_01_Main {
    public static void main(String[] args) {
        Kuis2_01 listPesanan01 = new Kuis2_01();
        Scanner scanner01 = new Scanner(System.in);
        int pilihan;

        System.out.println("\n================= QUIZ 2 ASD PRAKTIKUM TI =================");
        System.out.println("dibuat oleh : Adani Salsabila");
        System.out.println("NIM : 2341720123");
        System.out.println("No. Absen : 01");
        System.out.println("===========================================================");

        Pembeli01 pembeli1 = new Pembeli01("Adani", "089187243665");
        Pesanan01 pesanan1 = new Pesanan01(1, "Rendang", 150000);

        Pembeli01 pembeli2 = new Pembeli01("Salsabila", "083567998271");
        Pesanan01 pesanan2 = new Pesanan01(2, "Cuanki", 8000);

        Pembeli01 pembeli3 = new Pembeli01("Siahan", "087548290117");
        Pesanan01 pesanan3 = new Pesanan01(3, "Soto Daging", 60000);

        Pembeli01 pembeli4 = new Pembeli01("Hanifah", "09234178299");
        Pesanan01 pesanan4 = new Pesanan01(4, "Seblak Jeletot", 90000);

        Pembeli01 pembeli5 = new Pembeli01("Oltha", "098423678199");
        Pesanan01 pesanan5 = new Pesanan01(5, "Mi Ayam", 12000);

        Pembeli01 pembeli6 = new Pembeli01("Marsya", "067453678911");
        Pesanan01 pesanan6 = new Pesanan01(6, "Pancong Lumer", 6700);

        listPesanan01.tambahPesanan01(pesanan1, pembeli1);
        listPesanan01.tambahPesanan01(pesanan2, pembeli2);
        listPesanan01.tambahPesanan01(pesanan3, pembeli3);
        listPesanan01.tambahPesanan01(pesanan4, pembeli4);
        listPesanan01.tambahPesanan01(pesanan5, pembeli5);
        listPesanan01.tambahPesanan01(pesanan6, pembeli6);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Peruntutan Pesanan Berdasarkan Nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.println("=======================================");
            System.out.print("Pilih opsi: ");
            pilihan = scanner01.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("====================================");
                    System.out.print("Masukkan Nama Pembeli : ");
                    String namaPembeli01 = scanner01.next();
                    System.out.print("Masukkan Nomor HP Pembeli : ");
                    String noHP01 = scanner01.next();
                    System.out.print("Masukkan Kode Pesanan : ");
                    int kodePesanan01 = scanner01.nextInt();
                    System.out.print("Masukkan Nama Pesanan : ");
                    String namaPesanan01 = scanner01.next();
                    System.out.print("Masukkan Harga Pesanan : ");
                    int harga01 = scanner01.nextInt();
                    Pembeli01 newPembeli = new Pembeli01(namaPembeli01, noHP01);
                    Pesanan01 newPesanan = new Pesanan01(kodePesanan01, namaPesanan01, harga01);
                    listPesanan01.tambahPesanan01(newPesanan, newPembeli);;
                    break;
                case 2:
                    System.out.println("====================================");
                    System.out.println("Daftar Antrian Resto Royal Delish : ");
                    System.out.println("====================================");
                    listPesanan01.semuaPesanan01();
                    break;
                case 3:
                    System.out.print("Masukkan Kode Pesanan yang ingin dihapus: ");
                    int kodeHapus01 = scanner01.nextInt();
                    if (listPesanan01.hapusPesanan01(kodeHapus01)) {
                        System.out.println("Pesanan sudah berhasil dihapus.");
                    } else {
                        System.out.println("Pesanan tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("==============================================================");
                    System.out.println("Laporan Pesanan Berdasarkan Nama (Descending - Absen Ganjil) :");
                    System.out.println("==============================================================");
                    listPesanan01.urutPesanan01();
                    break;
                case 5:
                    int totalPendapatan01 = listPesanan01.hitungTotalPendapatan01();
                    System.out.println("Total Pendapatan: " + totalPendapatan01);
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Input Salah!");
            }
        } while (pilihan != 6);

        scanner01.close();
    }
}