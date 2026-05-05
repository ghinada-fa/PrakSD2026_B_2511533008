package pekan5_2511533008;

public class HapusSLL_2511533008 {
	//fungsi untuk menghapus head
	public static NodeSLL_2511533008 deleteHead_3008(NodeSLL_2511533008 head_3008) {
		//jika SLL kosong
		if (head_3008 == null)
			return null;
		//pindahkan head ke node berikutnya
		head_3008 = head_3008.next_3008;
		//return head baru
		return head_3008;
	}
	//fungsi menghapus node terakhir SLL
	public static NodeSLL_2511533008 removeLastNode_3008(NodeSLL_2511533008 head_3008) {
		//jika list kosong, return null
		if (head_3008 == null) {
			return null;
		}
		//jika list satu node, hapus node dan return null
		if (head_3008.next_3008 == null) {
			return null;
		}
		//temukan node terakhir ke dua
		NodeSLL_2511533008 secondLast_3008 = head_3008;
		while (secondLast_3008.next_3008.next_3008 != null) {
			secondLast_3008 = secondLast_3008.next_3008;
		}
		//hapus node terakhir
		secondLast_3008.next_3008 = null;
		return head_3008;
	}
	//fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511533008 deleteNode_3008(NodeSLL_2511533008 head_3008, int position_3008) {
		NodeSLL_2511533008 temp_3008 = head_3008;
		NodeSLL_2511533008 prev_3008 = null;
		//jika linked list null
		if (temp_3008 == null) 
			return head_3008;
		//kasus 1: head dihapus
		if (position_3008 == 1) {
			head_3008 = temp_3008.next_3008;
			return head_3008;
		}
		//kasus 2: menghapus node ditengah
		//telusuri ke node yang dihapus
		for (int i_3008 = 1; temp_3008 != null && i_3008 < position_3008; i_3008++) {
			prev_3008 = temp_3008;
			temp_3008 = temp_3008.next_3008;
		}
		//jika ditemukan, hapus node
		if (temp_3008 != null) {
			prev_3008.next_3008 = temp_3008.next_3008;
		} else {
			System.out.println("Data tidak ada");
		}
		return head_3008;
	}
	//fungsi mencetak SLL
	public static void printList_3008(NodeSLL_2511533008 head_3008) {
		NodeSLL_2511533008 curr_3008 = head_3008;
		while (curr_3008.next_3008 != null) {
			System.out.print(curr_3008.data_3008 + "-->");
			curr_3008 = curr_3008.next_3008;
		}
		if (curr_3008.next_3008 == null) {
			System.out.print(curr_3008.data_3008);
			System.out.println();
		}
}

	public static void main(String[] args) {
		//buat SLL 1->2->3->4->5->6->null
		NodeSLL_2511533008 head_3008 = new NodeSLL_2511533008(1);
		head_3008.next_3008 = new NodeSLL_2511533008(2);
		head_3008.next_3008.next_3008 = new NodeSLL_2511533008(3);
		head_3008.next_3008.next_3008.next_3008 = new NodeSLL_2511533008(4);
		head_3008.next_3008.next_3008.next_3008.next_3008 = new NodeSLL_2511533008(5);
		head_3008.next_3008.next_3008.next_3008.next_3008.next_3008 = new NodeSLL_2511533008(6);
		//cetak list awal
		System.out.println("List awal : ");
		printList_3008(head_3008);
		//hapus head
		head_3008 = deleteHead_3008(head_3008);
		System.out.println("List setelah head dihapus: ");
		printList_3008(head_3008);
		//hapus node terakhir
		head_3008 = removeLastNode_3008(head_3008);
		System.out.println("List setelah simpul terakhir dihapus: ");
		printList_3008(head_3008);
		//deleting node at position 2
		int position_3008 = 2;
		head_3008 = deleteNode_3008(head_3008, position_3008);
		//print list after deletion
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_3008(head_3008);

	}

}
