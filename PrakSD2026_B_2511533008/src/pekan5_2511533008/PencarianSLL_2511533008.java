package pekan5_2511533008;

public class PencarianSLL_2511533008 {
	static boolean searchKey_3008(NodeSLL_2511533008 head_3008, int key_3008) {
		NodeSLL_2511533008 curr_3008 = head_3008;
		while(curr_3008 != null) {
			if (curr_3008.data_3008 == key_3008)
				return true;
			curr_3008 = curr_3008.next_3008;
		} return false;
	}
	public static void traversal_3008(NodeSLL_2511533008 head_3008) {
		//mulai dari head
		NodeSLL_2511533008 curr_3008 = head_3008;
		//telusuri sampai pointer null
		while(curr_3008 != null) {
			System.out.print(" " + curr_3008.data_3008);
			curr_3008 = curr_3008.next_3008;
		} System.out.println();
	}

	public static void main(String[] args) {
		NodeSLL_2511533008 head_3008 = new NodeSLL_2511533008(14);
		head_3008.next_3008 = new NodeSLL_2511533008(21);
		head_3008.next_3008.next_3008 = new NodeSLL_2511533008(13);
		head_3008.next_3008.next_3008.next_3008 = new NodeSLL_2511533008(30);
		head_3008.next_3008.next_3008.next_3008.next_3008 = new NodeSLL_2511533008(10);
		System.out.print("Penelusuran SLL: ");
		traversal_3008(head_3008);
		//data yang akan dicari
		int key_3008 = 30;
		System.out.print("cari data " + key_3008 + " = ");
		if (searchKey_3008(head_3008, key_3008))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada");

	}

}
