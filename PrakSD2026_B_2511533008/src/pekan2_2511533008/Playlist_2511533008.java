package pekan2_2511533008;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533008 {
	public static void tampilkanPilihan_3008() {
		System.out.println("=== Playlist Musik NIM: 2511533008 ===");
		System.out.println("1. Tambah Lagu");
		System.out.println("2. Lihat Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Cek Kapasitas");
		System.out.println("5. Keluar");
	}
	
	public static void tambahLagu_3008(ArrayList<Musik_2511533008> list, Scanner sc) {
		System.out.print("Judul Lagu : ");
		String judul_3008 = sc.nextLine();
		System.out.print("Penyanyi : ");
		String penyanyi_3008 = sc.nextLine();
		System.out.print("Durasi : ");
		int durasi_3008 = sc.nextInt();
		list.add(new Musik_2511533008 (judul_3008, penyanyi_3008, durasi_3008));
		System.out.println("Musik berhasil ditambahkan");
	}
	
	public static void lihatPlaylist_3008(ArrayList<Musik_2511533008> list) {
		if (list.isEmpty()) {
			System.out.println("Playlist kosong.");
		} else {
			System.out.println("\nPlaylist:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i).getJudul_3008() +
                        " - " + list.get(i).getPenyanyi_3008() +
                        " (" + list.get(i).getDurasi_3008() + " detik)");
            }
		}
	}
	
	public static void hapusLagu_3008(ArrayList<Musik_2511533008> list, Scanner sc) {
		lihatPlaylist_3008(list);
        if (!list.isEmpty()) {
            System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
            int index = sc.nextInt();
            sc.nextLine();
            if (index > 0 && index <= list.size()) {
                list.remove(index - 1);
                System.out.println("Lagu berhasil dihapus!");
            } else {
                System.out.println("Nomor lagu tidak valid.");
            }
        }
	} 
	
	public static void cekKapasitas_3008(ArrayList<Musik_2511533008> list) {
		System.out.println("Jumlah total lagu : " + list.size());
	}

	public static void main(String[] args) {
		ArrayList<Musik_2511533008> MusikList_3008 = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		int choise_3008;
		do {
			tampilkanPilihan_3008();
			System.out.print("Pilihan : ");
			choise_3008 = sc.nextInt();
			sc.nextLine();
			
			switch (choise_3008) {
			case 1 :
				tambahLagu_3008(MusikList_3008, sc);
				break;
			case 2 :
				lihatPlaylist_3008(MusikList_3008);
				break;
			case 3 :
				hapusLagu_3008(MusikList_3008,sc);
				break;
			case 4 :
				cekKapasitas_3008(MusikList_3008);
				break;
			case 5 :
				System.out.println("Keluar dari program.");
				break;
			default :
				System.out.println("Pilihan tidak valid");	
			}
		} while (choise_3008 != 4);
		  sc.close();

	}

}
