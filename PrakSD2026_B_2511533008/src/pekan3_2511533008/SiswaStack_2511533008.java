package pekan3_2511533008;
import java.util.ArrayList;

class Siswa_2511533008 {
	String nama;
	int nim;
	
	public Siswa_2511533008(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}
	//override
	public String toString() {
		return "Nim: " + nim + ", Nama: " + nama;
	}
}
public class SiswaStack_2511533008 {
	private ArrayList<Siswa_2511533008> stack;
		
	public SiswaStack_2511533008() {
		stack = new ArrayList<>();
	}
	
	public void push (Siswa_2511533008 mhs) {
		stack.add(mhs);
	}
	
	public Siswa_2511533008 pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}
	
	public Siswa_2511533008 peek() {
		if (!isEmpty()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_2511533008() {
		for (int i = stack.size()-1; i >= 0; i--) {
			System.out.println(stack.get(i));
		}
	}
	
	public static void main (String[] args) {
		SiswaStack_2511533008 studentStack_2511533008 = new SiswaStack_2511533008();
		
		Siswa_2511533008 mhs1 = new Siswa_2511533008("Ali", 1);
		Siswa_2511533008 mhs2 = new Siswa_2511533008("Boby", 2);
		Siswa_2511533008 mhs3 = new Siswa_2511533008("Charles", 3);
		
		studentStack_2511533008.push(mhs1);
		studentStack_2511533008.push(mhs2);
		studentStack_2511533008.push(mhs3);
		
		System.out.println("Siswa di dalam stack: ");
		studentStack_2511533008.tampilkanSiswa_2511533008();
		
		System.out.println("Siswa teratas " + studentStack_2511533008.peek());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack_2511533008.pop());
		System.out.println("daftar siswa satelah di pop :");
		studentStack_2511533008.tampilkanSiswa_2511533008();
	}
}


