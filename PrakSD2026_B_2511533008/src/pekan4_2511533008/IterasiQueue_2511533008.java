package pekan4_2511533008;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511533008 {

	public static void main(String[] args) {
		Queue<String> q_3008 = new LinkedList<>();
		
		q_3008.add("Praktikum");
		q_3008.add("Struktur");
		q_3008.add("Data");
		q_3008.add("Dan");
		q_3008.add("Algoritma");
		Iterator<String> iterator_3008 = q_3008.iterator();
		while (iterator_3008.hasNext()) {
			System.out.print(iterator_3008.next() + " ");
		}

	}

}
