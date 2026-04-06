package pekan2_2511533008;

public class DaftarKataDriver_2511533008 {
	public static void main (String[] args) {
		DaftarKata_2511533008 al = new DaftarKata_2511533008();
		
		//menambah elemen (akhir)
		al.tambah_2511533008("Kami");
		al.tambah_2511533008("Informatika");
		
		//Menyisipkan elemen pada index 1
		al.tambahPada_2511533008 (1, "Mahaasiswa");
		
		//cetak isi awal
		System.out.println("Awal:         " + al);
		
		//mengubah elemen (index 1)
		al.ubahElemen_2511533008(1, "Departemen");
		System.out.println("Setelah Ubah: " + al);
		
		//menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen_2511533008(0);
		System.out.println("Terhapus : " + terhapus);
		System.out.println("Setelah Hapus : " + al);
		
		//iterasi pada arraylist (cetak setiap elemen)
		System.out.print("iterasi: ");
		al.iterasiCetak_2511533008();
		System.out.println();
	}

}
