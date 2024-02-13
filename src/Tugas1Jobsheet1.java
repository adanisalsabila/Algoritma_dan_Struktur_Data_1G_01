import java.util.Scanner;

public class Tugas1Jobsheet1 {
    public static void main(String[] args) {
        // kode plat mobil
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        // pasangan nama kota
        String[][] KOTA = {
                { "Banten" }, { "Jakarta" }, { "Bandung" }, { "Cirebon" }, { "Bogor" },
                { "Pekalongan" }, { "Semarang" }, { "Surabaya" }, { "Malang" }, { "Tegal" }
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil : ");
        char kodePlat = sc.next().charAt(0);

        String namaKota = cariNamaKota(KODE, KOTA, kodePlat);

        if (namaKota != null) {
            System.out.println("Nama kota: " + namaKota);
        } else {
            System.out.println("Kode plat mobil tidak valid.");
        }

        sc.close();
    }

    public static String cariNamaKota(char[] KODE, String[][] KOTA, char kodePlat) {
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                return KOTA[i][0];
            }
        }
        return null;
    }
}
