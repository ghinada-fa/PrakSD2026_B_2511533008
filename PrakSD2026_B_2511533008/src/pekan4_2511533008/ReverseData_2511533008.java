package pekan4_2511533008;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseData_2511533008 {

	public static void main(String[] args) {
		Queue<Integer> q_3008 = new LinkedList<Integer>();
		q_3008.add(1);
		q_3008.add(2);
		q_3008.add(3); // [1, 2, 3]
		System.out.println("sebelum reverse " + q_3008);
		Stack<Integer> s_3008 = new Stack<Integer>();
		while (!q_3008.isEmpty()) { // Q -> S
			s_3008.push(q_3008.remove());
		}
		while (!s_3008.isEmpty()) { // S -> Q
			q_3008.add(s_3008.pop());
		}
		System.out.println("sesudah reverse = " + q_3008); // [3, 2, 1]
		

	}

}
