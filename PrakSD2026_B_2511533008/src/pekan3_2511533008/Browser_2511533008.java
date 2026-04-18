package pekan3_2511533008;
import java.util.Stack;
import java.util.Scanner;

public class Browser_2511533008 {

	public static void main(String[] args) {
		Stack<Website_2511533008> history_3008 = new Stack<>();
		Scanner sc = new Scanner (System.in);
		int pilihan_3008;
		 do {
	            System.out.println("\n=== Browser History NIM: 2511533008 ===");
	            System.out.println("1. Kunjungi Website (Push)");
	            System.out.println("2. Tombol Back (Pop)");
	            System.out.println("3. Lihat Halaman Aktif (Peek)");
	            System.out.println("4. Keluar");
	            System.out.print("Pilihan: ");
	            pilihan_3008 = sc.nextInt();
	            sc.nextLine();
	            
	            switch (pilihan_3008) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul_3008 = sc.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url_3008 = sc.nextLine();
                    Website_2511533008 web_3008 = new Website_2511533008(judul_3008, url_3008);
                    history_3008.push(web_3008);
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history_3008.isEmpty()) {
                        Website_2511533008 keluar_3008 = history_3008.pop();
                        System.out.println("Kembali dari halaman: " + keluar_3008);
                    } else {
                        System.out.println("Riwayat kosong, tidak bisa kembali!");
                    }
                    break;

                case 3:
                    if (!history_3008.isEmpty()) {
                        System.out.println("Halaman aktif: " + history_3008.peek());
                    } else {
                        System.out.println("Tidak ada halaman aktif!");
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari browser...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_3008 != 4);

        sc.close();

	}

}
