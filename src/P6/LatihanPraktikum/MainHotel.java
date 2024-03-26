// MainHotel.java
package P6.LatihanPraktikum;

public class MainHotel {
    public static void main(String[] args) {

        Hotel[] hotels = new Hotel[5];
        hotels[0] = new Hotel("Hotel Pramudya", 300000, (byte) 4);
        hotels[1] = new Hotel("Hotel Flamboyan", 800000, (byte) 3);
        hotels[2] = new Hotel("Hotel Krisatena", 320000, (byte) 5);
        hotels[3] = new Hotel("Hotel Zuko", 450000, (byte) 2);
        hotels[4] = new Hotel("Hotel Sugoi", 900000, (byte) 4);

        // bubble Sort
        HotelService hotelService = new HotelService();
        hotelService.bubbleSort(hotels);
        System.out.println("--------------------------------------");
        System.out.println("Data Hotel Urut Berdasarkan Harga (Terendah ke Tertinggi):");
        printHotels(hotels);
        System.out.println("--------------------------------------");

        // selection Sort
        hotelService.selectionSort(hotels);
        System.out.println("--------------------------------------");
        System.out.println("\nData Hotel Urut Berdasarkan Rating Bintang (Tertinggi ke Terendah):");
        printHotels(hotels);
        System.out.println("--------------------------------------");
    }

    static void printHotels(Hotel[] hotels) {
        for (Hotel hotel : hotels) {
            System.out.println(hotel.getNama() + " - Harga: Rp." + hotel.getHarga() + " - Rating: " + hotel.getBintang() + " Bintang ");
        }
    }
}