package P1;
import java.util.Scanner;

public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input NIM
        System.out.print("Masukkan NIM Anda: ");
        String nim = sc.nextLine();

        // mencari 2 digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        System.out.println("n : " + n);

        // jika n < 10, n + 10
        if (n < 10) {
            n += 10;
        }

        // menampilkan deretan bilangan dari angka 1 - n kecuali angka 6 dan 10
        // angka ganjil dicetak dengan asterik “*”
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
            sc.close();
        }
    }
}
