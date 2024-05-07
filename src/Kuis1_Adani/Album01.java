package Kuis1_Adani;

import java.util.Scanner; 

public class Album01 {
        public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
            }
        
            public Album01(String jud, String py, int stok, int har) {
                judul = jud;
                penyanyi = py;
                this.stok = stok;
                harga = har;
            }
        
            String judul, penyanyi;
            int stok, harga;
        
            void tampilInformasiAlbum() {
                System.out.println("-------------------------------");
                System.out.println("Judul : " + judul);
                System.out.println("Penyanyi : " + penyanyi);
                System.out.println("Sisa Stok : " + stok);
                System.out.println("Harga : Rp " + harga);
                System.out.println("-------------------------------");
            }
        
            void terjual(int jml) {
                if (stok > 0) {
                    stok -= jml;
                    if (stok < 0) {
                        stok = 0;
                    }
                } else {
                    System.out.println("Stok sudah habis.");
                }
            }
        
            void restock(int jml) {
                stok += jml;
            }
        
            void gantiHarga(int hrg) {
                harga = hrg;
            }
        
            int hitungHargaTotal(int jumlahTerjual) {
                return harga * jumlahTerjual;
            }

            void kurangPopuler(int stok) {
                
            }
        }