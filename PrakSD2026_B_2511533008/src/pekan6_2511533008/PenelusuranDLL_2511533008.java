package pekan6_2511533008;

public class PenelusuranDLL_2511533008 {
	//fungsi penelusuran
	static void forwardTraversal_3008(NodeDLL_2511533008 head_3008) {
		//memulai penelusuran dari head
		NodeDLL_2511533008 curr_3008 = head_3008;
		//lanjutkan sampai akhir
		while (curr_3008 != null) {
			//print data
			System.out.print(curr_3008.data_3008 + " <-> ");
			//pindah ke node berikutnya
			curr_3008 = curr_3008.next_3008;
		}
		//print spasi
		System.out.println();
	}
	//fungsi penelusuran mundur
	static void backwardTraversal_3008(NodeDLL_2511533008 tail_3008) {
		//mulai dari akhir
		NodeDLL_2511533008 curr_3008 = tail_3008;
		//lanjut sampai head
		while (curr_3008 != null) {
			//cetak data
			System.out.print(curr_3008.data_3008 + " <-> ");
			//pindah ke node sebelumnya
			curr_3008 = curr_3008.prev_3008;
		}
		//cetak spasi
		System.out.println();
	}

	public static void main(String[] args) {
		//cetak dll
		NodeDLL_2511533008 head_3008 = new NodeDLL_2511533008(1);
		NodeDLL_2511533008 second_3008 = new NodeDLL_2511533008(2);
		NodeDLL_2511533008 third_3008 = new NodeDLL_2511533008(3);
		
		head_3008.next_3008 = second_3008;
		second_3008.prev_3008 = head_3008;
		second_3008.next_3008 = third_3008;
		third_3008.prev_3008 = second_3008;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_3008(head_3008);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_3008(third_3008);

	}

}
