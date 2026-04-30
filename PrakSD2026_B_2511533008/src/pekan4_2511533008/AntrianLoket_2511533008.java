package pekan4_2511533008;

public class AntrianLoket_2511533008 {
	private int front_3008, rear_3008, max_3008;
    private String[] queue_3008;

    public AntrianLoket_2511533008(int kapasitas_3008) {
        max_3008 = kapasitas_3008;
        queue_3008 = new String[max_3008];
        front_3008 = -1;
        rear_3008 = -1;
    }

    public boolean isEmpty_3008() {
        return (front_3008 == -1 && rear_3008 == -1);
    }

    public boolean isFull_3008() {
        return (rear_3008 == max_3008 - 1);
    }

    public void enqueue_3008(String data_3008) {
        if (isFull_3008()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_3008()) {
                front_3008 = 0;
            }
            rear_3008++;
            queue_3008[rear_3008] = data_3008;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    public void dequeue_3008() {
        if (isEmpty_3008()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue_3008[front_3008] + " telah dilayani");
            if (front_3008 == rear_3008) {
                front_3008 = rear_3008 = -1;
            } else {
                front_3008++;
            }
        }
    }

    public void display_3008() {
        if (isEmpty_3008()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i_3008 = front_3008; i_3008 <= rear_3008; i_3008++) {
                System.out.println((i_3008 - front_3008 + 1) + ". " + queue_3008[i_3008]);
            }
        }
    }

    public void reverse_3008() {
        if (isEmpty_3008()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian setelah dibalik:");
            for (int i_3008 = rear_3008; i_3008 >= front_3008; i_3008--) {
                System.out.println((rear_3008 - i_3008 + 1) + ". " + queue_3008[i_3008]);
            }
        }
    }

}
