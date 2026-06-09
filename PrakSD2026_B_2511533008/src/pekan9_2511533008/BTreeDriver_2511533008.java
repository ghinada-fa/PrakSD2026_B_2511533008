package pekan9_2511533008;

public class BTreeDriver_2511533008 {
	public static void main(String[] args) {
		//membuat pohon
		BTree_2511533008 tree_3008 = new BTree_2511533008();
		System.out.print("Jumlah Simpul Awal Pohon: ");
		System.out.println(tree_3008.countNodes_3008());
		//menambahkan simpul data 1
		Node_2511533008 root_3008 = new Node_2511533008(1);
		//menjadikan simpul 1 sebagai root
		tree_3008.setRoot_3008(root_3008);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_3008.countNodes_3008());
		Node_2511533008 node2_3008 = new Node_2511533008(2);
		Node_2511533008 node3_3008 = new Node_2511533008(3);
		Node_2511533008 node4_3008 = new Node_2511533008(4);
		Node_2511533008 node5_3008 = new Node_2511533008(5);
		Node_2511533008 node6_3008 = new Node_2511533008(6);
		Node_2511533008 node7_3008 = new Node_2511533008(7);
		Node_2511533008 node8_3008 = new Node_2511533008(8);
		Node_2511533008 node9_3008 = new Node_2511533008(9);
		root_3008.setLeft_3008(node2_3008);
		node2_3008.setLeft_3008(node4_3008);
		node2_3008.setRight_3008(node5_3008);
		node4_3008.setRight_3008(node8_3008);
		root_3008.setRight_3008(node3_3008);
		node3_3008.setLeft_3008(node6_3008);
		node3_3008.setRight_3008(node7_3008);
		node6_3008.setLeft_3008(node9_3008);
		
		//set root
		tree_3008.setCurrent_3008(tree_3008.getRoot_3008());
		System.out.println("Menampilkan simpul terakhir: ");
		System.out.println(tree_3008.getCurrent_3008().getData_3008());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_3008.countNodes_3008());
		System.out.println("InOrder: ");
		tree_3008.printInorder_3008();
		System.out.println("\nPreOrder: ");
		tree_3008.printPreorder_3008();
		System.out.println("\nPostOrder: ");
		tree_3008.printPostorder_3008();
		System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
		tree_3008.print_3008();
	}

}
