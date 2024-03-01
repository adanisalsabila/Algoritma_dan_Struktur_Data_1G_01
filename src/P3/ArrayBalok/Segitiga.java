package P3.ArrayBalok;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)); // Menggunakan rumus pythagoras untuk mencari sisi miring
        double keliling = alas + tinggi + sisiMiring; // Keliling segitiga = alas + tinggi + sisi miring
        return keliling;
    }
}
