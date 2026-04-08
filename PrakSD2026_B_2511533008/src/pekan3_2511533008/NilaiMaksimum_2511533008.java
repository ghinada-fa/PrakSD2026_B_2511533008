package pekan3_2511533008;
import java.util.Stack;

public class NilaiMaksimum_2511533008 {
	public static int max_2511533008(Stack<Integer> s) {
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue_2511533008 = s.pop();
		backup.push(maxValue_2511533008);
		while(!s.isEmpty()) {
			int next_2511533008 = s.pop();
			backup.push(next_2511533008);
			maxValue_2511533008 = Math.max(maxValue_2511533008, next_2511533008);
		}
		while(!backup.isEmpty()) {
			s.push(backup.pop());
		}
		return maxValue_2511533008;
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(70);
		s.push(12);
		s.push(20);
		System.out.println("isi stack " + s);
		System.out.println("Stack Teratas " + s.peek());
		System.out.println("Nilai Maksimum " + max_2511533008(s));

	}

}
