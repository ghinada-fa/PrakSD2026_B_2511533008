package pekan1_2511533008;

public class MobilDriver_2511533008 {
	static Mobil_2511533008[] daftarMobil = new Mobil_2511533008[100];
	static int jumlahMobil = 0;
	
	//tambah mobil
	public static void tambahMobil(String nama, int tahun, int  cc, int harga, String merk) {
	if (jumlahMobil >= daftarMobil.length) {
		System.out.println("Array penuh, tidak bisa menambah mobil.");
        return;
	}
	daftarMobil[jumlahMobil] = new Mobil_2511533008(nama, tahun, cc, harga, merk);
    jumlahMobil++;
    System.out.println("Mobil " + nama + " berhasil ditambahkan.");
	}
	
	//hapus mobil
	public static void hapusMobil(String nama) {
        for (int i = 0; i < jumlahMobil; i++) {
            if (daftarMobil[i].getNama().equalsIgnoreCase(nama)) {
                for (int j = i; j < jumlahMobil - 1; j++) {
                    daftarMobil[j] = daftarMobil[j + 1];
                }
                daftarMobil[jumlahMobil - 1] = null;
                jumlahMobil--;
                System.out.println("Mobil " + nama + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Mobil " + nama + " tidak ditemukan.");
    }
	
	//menampilkan semua mobil
	public static void tampilkanDaftarMobil() {
        System.out.println("\n=== Daftar Mobil ===");
        for (int i = 0; i < jumlahMobil; i++) {
            daftarMobil[i].tampilkanInfoMobil();
            System.out.println("--------------------");
        }
    }
	
	  public static void main(String[] args) {
	        //menambahkan mobil dalam array
	        tambahMobil("Avanza",  2020, 1300, 150000000, "Toyota");
	        tambahMobil("Brio",    2021, 1200, 180000000, "Honda");
	        tambahMobil("Xpander", 2022, 1500, 250000000, "Mitsubishi");
	  
	  //menampilkan semua mobil 
	  tampilkanDaftarMobil() ;
	  
	  //hapus mobil
	  hapusMobil ("Avanza");
	  
	  // menampilkan daftar setelah di hapus
	  tampilkanDaftarMobil();
	  
	  //contoh mutator
	  daftarMobil[0].setHarga(195000000);
      System.out.println("\nHarga Brio setelah update: Rp " + daftarMobil[0].getHarga());
	   
	  }
}
