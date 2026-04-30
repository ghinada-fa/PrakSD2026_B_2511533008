package pekan4_2511533008;
import java.util.Scanner;

public class Queue_2511533008 {

	public static void main(String[] args) {
		Scanner sc_3008 = new Scanner(System.in);
        AntrianLoket_2511533008 antrian_3008 = new AntrianLoket_2511533008(10);

        int pilihan_3008;
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_3008 = sc_3008.nextInt();
            sc_3008.nextLine(); 

            switch (pilihan_3008) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_3008 = sc_3008.nextLine();
                    antrian_3008.enqueue_3008(nama_3008);
                    break;
                case 2:
                    antrian_3008.dequeue_3008();
                    break;
                case 3:
                    antrian_3008.display_3008();
                    break;
                case 4:
                    antrian_3008.reverse_3008();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_3008 != 5);

        sc_3008.close();
    }

}
