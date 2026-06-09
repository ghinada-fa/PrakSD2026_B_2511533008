package pekan9_2511533008;

public class BTree_2511533008 {
	private Node_2511533008 root_3008;
	private Node_2511533008 currentNode_3008;
	public BTree_2511533008() {
		root_3008 = null;
	}
	public boolean search_3008(int data_3008) {
		return search_3008(root_3008, data_3008);
	}
	private boolean search_3008(Node_2511533008 node_3008, int data_3008) {
		if (node_3008.getData_3008() == data_3008)
			return true;
		if (node_3008.getLeft_3008() != null)
			if (search_3008(node_3008.getLeft_3008(), data_3008))
				return true;
		if (node_3008.getRight_3008() != null)
			if (search_3008(node_3008.getRight_3008(), data_3008))
				return true;
		return false;
	}
	public void printInorder_3008() {
		root_3008.printInorder_3008(root_3008);
	}
	public void printPreorder_3008() {
		root_3008.printPreorder_3008(root_3008);
	}
	public void printPostorder_3008() {
		root_3008.printPostorder_3008(root_3008);
	}
	public Node_2511533008 getRoot_3008() {
		return root_3008;
	}
	public boolean isEmpty_3008() {
		return root_3008 == null;
	}
	public int countNodes_3008() {
		return countNodes_3008(root_3008);
	}
	public int countNodes_3008(Node_2511533008 node_3008) {
		int count_3008 = 1;
		if (node_3008 == null) {
			return 0;
		} else {
			count_3008 += countNodes_3008(node_3008.getLeft_3008());
			count_3008 += countNodes_3008(node_3008.getRight_3008());
			return count_3008;
		}
	}
	public void print_3008() {
		root_3008.print_3008();
	}
	public Node_2511533008 getCurrent_3008() {
		return currentNode_3008;
	}
	public void setCurrent_3008(Node_2511533008 node_3008) {
		this.currentNode_3008 = node_3008;
	}
	public void setRoot_3008(Node_2511533008 root_3008) {
		this.root_3008 = root_3008;
	}

}
