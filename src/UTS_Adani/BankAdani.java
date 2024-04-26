package UTS_Adani;

public class BankAdani {
    String norekAdani;
    String namaAdani;
    String nikAdani;
    int umurAdani;
    double saldoAdani;

    public BankAdani(String norekAdani, String namaAdani, String nikAdani, int umurAdani, double saldoAdani) {
        this.norekAdani = norekAdani;
        this.namaAdani = namaAdani;
        this.nikAdani = nikAdani;
        this.umurAdani = umurAdani;
        this.saldoAdani = saldoAdani;
    }

    public String getNikAdani() {
        return this.nikAdani;
    }    

    public void tampilDataNasabahAdani() {
        System.out.println("================================");
        System.out.println("Nomor Rekening : " + norekAdani);
        System.out.println("Nama Nasabah : " + namaAdani);
        System.out.println("NIK : " + nikAdani);
        System.out.println("Umur : " + umurAdani);
        System.out.println("Saldo : " + saldoAdani);
   
    }

}
