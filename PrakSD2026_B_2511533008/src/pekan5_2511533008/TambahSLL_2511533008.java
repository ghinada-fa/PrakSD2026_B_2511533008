package pekan5_2511533008;

public class TambahSLL_2511533008 {
	public static NodeSLL_2511533008 insertAtFront_3008(NodeSLL_2511533008 head_3008, int value_3008) {
		NodeSLL_2511533008 new_node_3008 = new NodeSLL_2511533008(value_3008);
		new_node_3008.next_3008 = head_3008;
		return new_node_3008;
	}
	// fungsi menambahkan node di akhir sll
	public static NodeSLL_2511533008 insertAtEnd_3008(NodeSLL_2511533008 head_3008, int value_3008) {
		//buat sebuah node dengan sebuah nilai 
		NodeSLL_2511533008 newNode_3008 = new NodeSLL_2511533008(value_3008);
		//jika list kosong maka node jadi head
		if (head_3008 == null) {
			return newNode_3008;
		}
		// simpan head ke varariabel sementara
		NodeSLL_2511533008 last_3008 = head_3008;
		// telusuri ke node akhir
		while (last_3008.next_3008 != null) {
			last_3008 = last_3008.next_3008;
		}
		// ubah pointer 
		last_3008.next_3008 = newNode_3008;
		return head_3008;
	}
	static NodeSLL_2511533008 GetNode_3008(int data_3008) {
		return new NodeSLL_2511533008(data_3008);
	}
	static NodeSLL_2511533008 insertPos_3008(NodeSLL_2511533008 headNode_3008, int position_3008, int value_3008) {
		NodeSLL_2511533008 head_3008 = headNode_3008;
		if (position_3008 < 1) 
			System.out.print("Invalid position");
		if (position_3008 == 1) {
			NodeSLL_2511533008 new_node_3008 = new NodeSLL_2511533008(value_3008);
			new_node_3008.next_3008 = head_3008;
			return new_node_3008;
		} else {
			while (position_3008-- != 0) {
				if (position_3008 == 1) {
					NodeSLL_2511533008 newNode_3008 = GetNode_3008(value_3008);
					newNode_3008.next_3008 = headNode_3008.next_3008;
					headNode_3008.next_3008 = newNode_3008;
					break;
				}
				headNode_3008 = headNode_3008.next_3008;
			}
			if (position_3008 != 1)
				System.out.print("Posisi di luar jangkauan");
			return head_3008;
			}
		}
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
		// buat linked list  2->3->5->6
		NodeSLL_2511533008 head_3008 = new NodeSLL_2511533008(2);
		head_3008.next_3008 = new NodeSLL_2511533008(3);
		head_3008.next_3008.next_3008 = new NodeSLL_2511533008(5);
		head_3008.next_3008.next_3008.next_3008 = new NodeSLL_2511533008(6);
		//cetak list asli
		System.out.print("Senarai berantai awal: ");
		printList_3008(head_3008);
		//tambahkan node baru di depan
		System.out.print("tambah 1 simpul di depan: ");
		int data_3008 = 1;
		head_3008 = insertAtFront_3008(head_3008, data_3008);
		//cetak update list
		printList_3008(head_3008);
		//tambahkan node baru dibelakang
		System.out.print("tambah 1 simpul di belakang: ");
		int data2_3008 = 7;
		head_3008 = insertAtEnd_3008(head_3008, data2_3008);
		//cetak update list
		printList_3008(head_3008);
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3_3008 = 4;
		int pos_3008 = 4;
		head_3008 = insertPos_3008(head_3008,pos_3008,data3_3008);
		//cetak update list
		printList_3008(head_3008);

	}

}
