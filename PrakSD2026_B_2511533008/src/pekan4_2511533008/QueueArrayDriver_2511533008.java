package pekan4_2511533008;

public class QueueArrayDriver_2511533008 {

	public static void main(String[] args) {
		QueueArray_2511533008 queue_3008 = new QueueArray_2511533008(1000);
		queue_3008.enqueue_3008(10);
		queue_3008.enqueue_3008(20);
		queue_3008.enqueue_3008(30);
		queue_3008.enqueue_3008(40);
		System.out.println("Item di depan: " + queue_3008.front_3008());
		System.out.println("Item paling belakang: " + queue_3008.rear_3008());
		System.out.println("tampilan queue");
		queue_3008.display_3008();
		System.out.println();
		System.out.println(queue_3008.dequeue_3008() + " dihapus dari queue");
		System.out.println("Item di depan: " + queue_3008.front_3008());
		System.out.println("Item di belakang: " + queue_3008.rear_3008());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_3008.display_3008();

	}

}
