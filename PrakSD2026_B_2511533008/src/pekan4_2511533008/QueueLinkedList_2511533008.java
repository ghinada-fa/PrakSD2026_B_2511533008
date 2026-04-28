package pekan4_2511533008;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511533008 {

	public static void main(String[] args) {
		Queue<Integer> q_3008 = new LinkedList<>();
		// tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i_3008 = 0; i_3008 < 6; i_3008++)
			q_3008.add(i_3008);
		//menampilkan isi antrian
		System.out.println("Elemen Antrian "+ q_3008);
		//untuk hapus kepala antrian
		int hapus_3008 = q_3008.remove();
		System.out.println("Hapus Elemen = " + hapus_3008);
		System.out.println(q_3008);
		//untuk melihat atrian terdepan
		int depan_3008 = q_3008.peek();
		System.out.println("Kepala Antrian = " + depan_3008);
		
		int banyak_3008 = q_3008.size();
		System.out.println("Size Antrian = " + banyak_3008);
		
	} 

}
