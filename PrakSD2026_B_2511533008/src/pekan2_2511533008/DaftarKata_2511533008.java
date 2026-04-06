package pekan2_2511533008;
import java.util.ArrayList;

public class DaftarKata_2511533008 {
	private final ArrayList<String> data;
	//konstruktor: inisialisasi list kosong
	public DaftarKata_2511533008() {
		this.data = new ArrayList<>();
	}
	/** Menambahkan elemen di akhir list. */
	public void tambah_2511533008 (String elemen) {
		data.add(elemen);
	}
	/** menambahkan elemen pada index tertentu (menyisipkan) */ 
	public void tambahPada_2511533008 (int index, String elemen) {
		data.add(index,elemen);
	}
	/** mengubah elemen pada posisi 'index' menjadi 'nilai baru'.
	 * bertindak sebagai "setter" untuk elemen tertentu.
	 */
	public void ubahElemen_2511533008(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	/** 
	 * menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus.
	 */
	public String hapusElemen_2511533008(int index) {
		return data.remove(index);
	}
	/**
	 * melakukan iterasi dan mencetak setiap elemen dalam format: [index] nilai
	 * (metode ini tidak mengembalikan nilai; hanya demonstrasi itersi).
	 */
	public void iterasiCetak_2511533008() {
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i) + " ");
		}
	}
	/** mengambil elemen berdasarkan index. */
	public String get(int index) {
		return data.get(index);
	}
	
	//representasi string agar mudah dicetak
	//override
	public String toString() {
		return data.toString();
	}
	

}
