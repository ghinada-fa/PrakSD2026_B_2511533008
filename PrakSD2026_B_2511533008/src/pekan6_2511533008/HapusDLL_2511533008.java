package pekan6_2511533008;

public class HapusDLL_2511533008 {
	//fungsi menghapus node di awal
	public static NodeDLL_2511533008 delHead_3008(NodeDLL_2511533008 head_3008) {
		if (head_3008 == null) {
			return null;
		}
		head_3008 = head_3008.next_3008;
		if (head_3008 != null) {
			head_3008.prev_3008 = null;
		}return head_3008;
	}
	//fungsi menghapus diakhir
	public static NodeDLL_2511533008 delLast_3008(NodeDLL_2511533008 head_3008) {
		if (head_3008 == null) {
			return null;
		} if (head_3008.next_3008 == null) {
			return null;
		} NodeDLL_2511533008 curr_3008 = head_3008;
		while (curr_3008.next_3008 != null) {
			curr_3008 = curr_3008.next_3008;
		}
		//update pointer previous node
		if (curr_3008.prev_3008 != null) {
			curr_3008.prev_3008.next_3008 = null;
		}return head_3008;
	}
	//fungsi menghapus node di posisi tertentu
	public static NodeDLL_2511533008 delPos_3008(NodeDLL_2511533008 head_3008, int pos_3008) {
		//jika dll kosong
		if (head_3008 == null) {
			return head_3008;
		} NodeDLL_2511533008 curr_3008 = head_3008;
		//telusuri sampai ke node yang akan dihapus
		for (int i_3008 = 1; curr_3008 != null && i_3008 < pos_3008; ++i_3008) {
			curr_3008 = curr_3008.next_3008;
		} //jika posisi tidak ditemukan
		if (curr_3008 == null) {
			return head_3008;
		}//update pointer
		if (curr_3008.prev_3008 != null) {
			curr_3008.prev_3008.next_3008 = curr_3008.next_3008;
		} if (curr_3008.next_3008 != null) {
			curr_3008.next_3008.prev_3008 = curr_3008.prev_3008;
		} //jika yang di hapus head 
		if (head_3008 == curr_3008) {
			head_3008 = curr_3008.next_3008;
		} return head_3008;
	}
	//fungsi mencetak DLL
	public static void printList_3008(NodeDLL_2511533008 head_3008) {
		NodeDLL_2511533008 curr_3008 = head_3008;
		while (curr_3008 != null) {
			System.out.print(curr_3008.data_3008 + " <-> ");
			curr_3008 = curr_3008.next_3008;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//buat sebuah dll
		NodeDLL_2511533008 head_3008 = new NodeDLL_2511533008(1);
		head_3008.next_3008 = new NodeDLL_2511533008(2);
		head_3008.next_3008.prev_3008 = head_3008;
		head_3008.next_3008.next_3008 = new NodeDLL_2511533008(3);
		head_3008.next_3008.next_3008.prev_3008 = head_3008.next_3008;
		head_3008.next_3008.next_3008.next_3008 = new NodeDLL_2511533008(4);
		head_3008.next_3008.next_3008.next_3008.prev_3008 = head_3008.next_3008.next_3008;
		head_3008.next_3008.next_3008.next_3008.next_3008 = new NodeDLL_2511533008(5);
		head_3008.next_3008.next_3008.next_3008.next_3008.prev_3008 = head_3008.next_3008.next_3008.next_3008;
		
		System.out.print("DLL Awal: ");
		printList_3008(head_3008);
		
		System.out.print("Setelah head dihapus: ");
		head_3008 = delHead_3008(head_3008);
		printList_3008(head_3008);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_3008 = delLast_3008(head_3008);
		printList_3008(head_3008);
		
		System.out.print("Setelah node ke 2 dihapus: ");
		head_3008 = delPos_3008(head_3008, 2);
		printList_3008(head_3008);

	}

}
