package pekan2_2511533008;
import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511533008 {
	// 1. method untuk menampilkan menu
	public static void tampilkanMenu_2511533008() {
		System.out.println("\nMenu:");
		System.out.println("1. Tambah Mahasiswa");
		System.out.println("2. Tampilkan Semua Mahasiswa");
		System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
		System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
		System.out.println("5. Keluar");
	}
	
	// 2. method untuk tambah mahasiswa
	public static void tambahMahasiswa_2511533008(ArrayList<Mahasiswa_2511533008> list, Scanner sc) {
		System.out.print("Masukkan NIM: ");
		String nim = sc.nextLine();
		System.out.print("Masukkan Nama: ");
		String nama = sc.nextLine();
		System.out.print("Masukkan Prodi: ");
		String prodi = sc.nextLine();
		list.add(new Mahasiswa_2511533008(nim,nama,prodi));
		System.out.println("Mahasiswa berhasil ditambahkan.");
		
	}
	// 3. method untuk tampilkan semua data
	public static void tampilkanSemuaMahasiswa_2511533008(ArrayList<Mahasiswa_2511533008> list) {
		if (list.isEmpty()) {
			System.out.println("Daftar Mahasiswa kosong.");
		} else {
			System.out.println("Data Mahasiswa:");
			for (Mahasiswa_2511533008 mhs : list) {
				System.out.println(mhs);
			}
		}
	}
	
	// 4. method untuk hapus mahasiswa berdasarkan NIM
	public static void hapusMahasiswa_2511533008(ArrayList<Mahasiswa_2511533008> list, Scanner sc) {
		System.out.print("Masukkan NIM yang akan dihapus: ");
		String nimHapus = sc.nextLine();
		boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus));
		
		if (removed) {
			System.out.println("Data dengan NIM " + nimHapus + " berhasil dihapus.");
		} else {
			System.out.println("NIM tidak ditemukan.");
		}
	}
	// 5. method untuk cari mahasiswa berdasarkan NIM
	public static void cariMahasiswa_2511533008(ArrayList<Mahasiswa_2511533008>list, Scanner sc) {
		System.out.print("Masukkan NIM yang dicari: ");
		String nimCari = sc.nextLine();
		boolean ditemukan = false;
		
		for (Mahasiswa_2511533008 mhs : list) {
			if (mhs.nim.equals(nimCari)) {
				System.out.println("Hasil Pencarian: " + mhs);
				ditemukan = true;
				break;
			}
		}
		
		if (!ditemukan) {
			System.out.println("NIM tidak ada.");
		}
	}
	
	public static void main (String [] args) {
		ArrayList<Mahasiswa_2511533008> mahasiswaList_2511533008 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int choise;
		do {
			tampilkanMenu_2511533008();
			System.out.print("Pilih menu: ");
			choise = scanner.nextInt();
			scanner.nextLine(); //consume new line
			
			switch (choise) {
			case 1 :
				tambahMahasiswa_2511533008(mahasiswaList_2511533008, scanner);
				break;
			case 2 :
				tampilkanSemuaMahasiswa_2511533008(mahasiswaList_2511533008);
				break;
			case 3 :
				hapusMahasiswa_2511533008(mahasiswaList_2511533008,scanner);
				break;
			case 4 :
				cariMahasiswa_2511533008(mahasiswaList_2511533008,scanner);
				break;
			case 5 :
				System.out.println("Keluar dari program.");
				break;
			default :
				System.out.println("Pilihan tidak valid");	
			}
		} while (choise != 5);
		scanner.close();
	}

}
