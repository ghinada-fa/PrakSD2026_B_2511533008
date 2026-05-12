package pekan6_2511533008;

public class InsertDLL_2511533008 {
	//menambahkan node di awal dll
	static NodeDLL_2511533008 insertBegin_3008(NodeDLL_2511533008 head_3008, int data_3008) {
		//buat node baru
		NodeDLL_2511533008 new_node_3008 = new NodeDLL_2511533008(data_3008);
		//jadikan pointer nextnya head
		new_node_3008.next_3008 = head_3008;
		//jadikan pointer prev head ke new_node_3008
		if (head_3008 != null) {
			head_3008.prev_3008 = new_node_3008;
		}
		return new_node_3008;
	}
	//fungsi menambahkan node di akhir
	public static NodeDLL_2511533008 insertEnd_3008(NodeDLL_2511533008 head_3008, int newData_3008) {
		//buat node baru
		NodeDLL_2511533008 newNode_3008 = new NodeDLL_2511533008(newData_3008);
		//jika dll null jadikan head
		if (head_3008 == null) {
			head_3008 = newNode_3008;
		}
		else {
			NodeDLL_2511533008 curr_3008 = head_3008;
			while (curr_3008.next_3008 != null) {
				curr_3008 = curr_3008.next_3008;
			}
			curr_3008.next_3008 = newNode_3008;
			newNode_3008.prev_3008 = curr_3008;
		}
		return head_3008;
	}
	//fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511533008 insertAtPosition_3008(NodeDLL_2511533008 head_3008, int pos_3008, int new_data_3008) {
		//buat node baru
		NodeDLL_2511533008 new_node_3008 = new NodeDLL_2511533008(new_data_3008);
		if (pos_3008 == 1) {
			new_node_3008.next_3008 = head_3008;
			if (head_3008 != null) {
				head_3008.prev_3008 = new_node_3008;
			} head_3008 = new_node_3008;
			return head_3008;
		}
		NodeDLL_2511533008 curr_3008 = head_3008;
		for (int i_3008 = 1; i_3008 < pos_3008 - 1 && curr_3008 != null; ++i_3008) {
			curr_3008 = curr_3008.next_3008;
		}
		if (curr_3008 == null) {
			System.out.println("Posisi tidak ada");
			return head_3008;
		}
		new_node_3008.prev_3008 = curr_3008;
		new_node_3008.next_3008 = curr_3008.next_3008;
		curr_3008.next_3008 = new_node_3008;
		if (new_node_3008.next_3008 != null) {
			new_node_3008.next_3008.prev_3008 = new_node_3008;
		} return head_3008;
	}
	public static void printList_3008(NodeDLL_2511533008 head_3008) {
		NodeDLL_2511533008 curr_3008 = head_3008;
		while (curr_3008 != null) {
			System.out.print(curr_3008.data_3008 + " <-> ");
			curr_3008 = curr_3008.next_3008;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//membuat dll 2 <-> 3 <-> 5 
		NodeDLL_2511533008 head_3008 = new NodeDLL_2511533008(2);
		head_3008.next_3008 = new NodeDLL_2511533008(3);
		head_3008.next_3008.prev_3008 = head_3008;
		head_3008.next_3008.next_3008 = new NodeDLL_2511533008(5);
		head_3008.next_3008.next_3008.prev_3008 = head_3008.next_3008;
		//cetak dll awal
		System.out.print("DLL awal: ");
		printList_3008(head_3008);
		//tambah 1 diawal
		head_3008 = insertBegin_3008(head_3008, 1);
		System.out.print("simpul 1 ditambah di awal: ");
		printList_3008(head_3008);
		//tambah 6 diakhir 
		System.out.print("simpul 6 ditambah di akhir: ");
		int data_3008 = 6;
		head_3008 = insertEnd_3008(head_3008, data_3008);
		printList_3008(head_3008);
		//menambah node 4 di posisi 4
		System.out.print("tambah node 4 di posisi 4: ");
		int data2_3008 = 4;
		int pos_3008 = 4;
		head_3008 = insertAtPosition_3008(head_3008, pos_3008, data2_3008);
		printList_3008(head_3008);

	}

}
