package P5;

public class Faktorial {
    public int nilai;

    int faktorialBF(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorialBF(n - 1); 
        }
    }

    int faktorialDC(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }

    public static void main(String[] args) {
        Faktorial faktorial = new Faktorial();
        int n = 5;
        System.out.println("Hasil faktorial menggunakan brute force untuk " + n + " adalah: " + faktorial.faktorialBF(n));
        System.out.println("Hasil faktorial menggunakan divide dan conquer untuk " + n + " adalah: " + faktorial.faktorialDC(n));
    }
}
