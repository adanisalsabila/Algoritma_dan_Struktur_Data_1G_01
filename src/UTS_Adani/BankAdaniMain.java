package UTS_Adani;

import java.util.Scanner;

public class BankAdaniMain {
    public static void main(String[] args) {
        PencarianBankAdani dataAdani = new PencarianBankAdani();
        int jumNasabahAdani = 6;

        System.out.println("----------------------");
        System.out.println("Masukkan data nasabah  : ");
        Scanner sc01Adani = new Scanner(System.in);

        // Masukkan data nasabah
        for (int i = 0; i < jumNasabahAdani; i++) {
            System.out.println("---------------");
            System.out.println("Nomor Rekening\t: ");
            String norekAdani = sc01Adani.nextLine();
            System.out.println("Nama Nasabah\t : ");
            String namaAdani = sc01Adani.nextLine();
            System.out.println("NIK \t: ");
            String nikAdani = sc01Adani.nextLine();
            System.out.println("Umur\t: ");
            int umurAdani = sc01Adani.nextInt();
            sc01Adani.nextLine();

            System.out.println("Saldo\t: ");
            double saldoAdani = sc01Adani.nextDouble();
            sc01Adani.nextLine();

            BankAdani m = new BankAdani(norekAdani, namaAdani, nikAdani, umurAdani, saldoAdani);
            dataAdani.tambah(m);
        }

        // Urutkan data berdasarkan saldo terbesar
        dataAdani.urutSaldoTerbesarAdani();

        System.out.println("---------------------------");
        System.out.println("Data keseluruhan nasabah : ");
        dataAdani.tampilAdani();

        System.out.println("______________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIK nasabah yang dicari : ");
        System.out.println("NIK : ");
        String cariAdani = sc01Adani.nextLine();

        System.out.println("=====================================");

        // Pencarian dengan binary search
        int posisi = dataAdani.FindBinarySearch(cariAdani, 0, jumNasabahAdani - 1);
        dataAdani.tampilPosisiNasabahAdani(cariAdani, posisi);
        dataAdani.tampilDataNasabahAdani(cariAdani, posisi);
    }
}
