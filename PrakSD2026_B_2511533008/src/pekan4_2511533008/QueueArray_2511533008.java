package pekan4_2511533008;

public class QueueArray_2511533008 {
	int front_3008, rear_3008, size_3008;
	int capacity_3008;
	int array_3008[];
	
	public QueueArray_2511533008(int capacity_3008) {
		this.capacity_3008 = capacity_3008;
		front_3008 = this.size_3008 = 0;
		rear_3008 = capacity_3008 - 1;
		array_3008 = new int[this.capacity_3008];
	}
	
	boolean isFull_3008(QueueArray_2511533008 queue_3008) {
		return (queue_3008.size_3008 == queue_3008.capacity_3008);
	}
	
	boolean isEmpty_3008(QueueArray_2511533008 queue_3008) {
		return (queue_3008.size_3008 == 0);
	}
	
	void enqueue_3008(int item_3008) {
		if (isFull_3008(this))
			return;
		this.rear_3008 = (this.rear_3008 + 1) % this.capacity_3008;
		this.array_3008[this.rear_3008] = item_3008;
		this.size_3008 = this.size_3008 + 1;
		System.out.println(item_3008 + " enqueue to queue");
	}

	int dequeue_3008() {
		if (isEmpty_3008(this))
			return Integer.MIN_VALUE;
		int item_3008 = this.array_3008[this.front_3008];
		this.front_3008 = (this.front_3008 + 1) % this.capacity_3008;
		this.size_3008 = this.size_3008 - 1;
		return item_3008;
	}
	int front_3008() {
		if (isEmpty_3008(this))
			return Integer.MIN_VALUE;
		
		return this.array_3008[this.front_3008];
	}
	int rear_3008() {
		if (isEmpty_3008(this))
			return Integer.MIN_VALUE;
		
		return this.array_3008[this.rear_3008];
	}
	
	//mencetak elemen antrian
	void display_3008() {
		int i_3008;
		if (front_3008 == rear_3008) {
			System.out.printf("\nAntrian Kosong");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i_3008 = front_3008; i_3008 < rear_3008; i_3008++) {
			System.out.printf("  %d <--", array_3008[i_3008]);
		}
		return;
	}

}
