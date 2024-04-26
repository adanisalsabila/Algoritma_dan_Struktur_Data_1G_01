package P8;

public class StackKonversi01 {
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi01() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh.");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }

    public Barang01 ambilBarang() {
        if (!isEmpty()) {
            int kode = pop();
            String biner = konversiDesimalKeBiner(kode);
            System.out.println("Barang dengan kode " + kode + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + biner);
            return new Barang01(kode, "Nama Barang", "Kategori Barang");
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        
        StringBuilder biner = new StringBuilder();
        while (kode > 0) {
            int sisa = kode % 2;
            biner.insert(0, sisa); 
            kode = kode / 2;
        }
        return biner.toString();
    }
}
