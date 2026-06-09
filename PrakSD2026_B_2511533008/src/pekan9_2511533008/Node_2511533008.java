package pekan9_2511533008;

public class Node_2511533008 {
	int data_3008;
	Node_2511533008 left_3008;
	Node_2511533008 right_3008;
	public Node_2511533008(int data_3008) {
		this.data_3008 = data_3008;
		left_3008 = null;
		right_3008 = null;
	}
	public void setLeft_3008(Node_2511533008 node_3008) {
		if (left_3008 == null)
			left_3008 = node_3008;
	}
	public void setRight_3008(Node_2511533008 node_3008) {
		if (right_3008 == null)
			right_3008 = node_3008;
	}
	public Node_2511533008 getLeft_3008() {
		return left_3008;
	}
	public Node_2511533008 getRight_3008() {
		return right_3008;
	}
	public int getData_3008() {
		return data_3008;
	}
	public void setData_3008(int data_3008) {
		this.data_3008 = data_3008;
	}
	void printPreorder_3008(Node_2511533008 node_3008) {
		if (node_3008 == null)
			return;
		System.out.print(node_3008.data_3008 + " ");
		printPreorder_3008(node_3008.left_3008);
		printPreorder_3008(node_3008.right_3008);
	}
	void printPostorder_3008(Node_2511533008 node_3008) {
		if (node_3008 == null)
			return;
		printPostorder_3008(node_3008.left_3008);
		printPostorder_3008(node_3008.right_3008);
		System.out.print(node_3008.data_3008 + " ");
	}
	void printInorder_3008(Node_2511533008 node_3008) {
		if (node_3008 == null)
			return;
		printInorder_3008(node_3008.left_3008);
		System.out.print(node_3008.data_3008 + " ");
		printInorder_3008(node_3008.right_3008);
	}
	public String print_3008() {
		return this.print_3008("",true,"");
	}
	public String print_3008(String prefix_3008, boolean isTail_3008, String sb_3008) {
		if (right_3008 != null) {
			right_3008.print_3008(prefix_3008 + (isTail_3008 ? "|   " : "   "), false, sb_3008);			
		}
		System.out.println(prefix_3008 + (isTail_3008 ? "\\--" : "/--") + data_3008);
		if (left_3008 != null) {
			left_3008.print_3008(prefix_3008 + (isTail_3008 ? "   " : "|   "), true, sb_3008);
		}
		return sb_3008; 
	}
}
