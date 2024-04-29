package P9.Praktikum1;

public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan : " + data[front]);
        } else {
            System.out.println("Queue masih kosong.");
        }
    }

    public void print() {
        if (!IsEmpty()) {
            int i = front;
            do {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            } while (i != (rear + 1) % max);
            System.out.println();
            System.out.println("Jumlah elemen = " + size);
        } else {
            System.out.println("Queue masih kosong.");
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan.");
        } else {
            System.out.println("Queue sudah kosong.");
        }
    }

    public void Enqueue(int dt) {
        if (!IsFull()) {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        } else {
            System.out.println("Queue sudah penuh. Program dihentikan.");
            System.exit(0);
        }
    }
    
    public int Dequeue() {
        int dt = 0;
        if (!IsEmpty()) {
            dt = data[front];
            size--;
            if (size == 0) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        } else {
            System.out.println("Queue masih kosong. Program dihentikan.");
            System.exit(0);
        }
        return dt;
    }
}
    
