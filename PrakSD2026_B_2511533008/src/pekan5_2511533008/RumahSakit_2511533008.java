package pekan5_2511533008;
import java.util.Scanner;

public class RumahSakit_2511533008 {
	private Pasien_2511533008 head_3008;
    private int counter_3008;

    public RumahSakit_2511533008() {
        head_3008 = null;
        counter_3008 = 0;
    }

    // Daftarkan Pasien (Insert at Tail)
    public void daftarkanPasien_3008(String nama_3008, String penyakit_3008) {
        counter_3008++;
        Pasien_2511533008 baru_3008 = new Pasien_2511533008(nama_3008, penyakit_3008, counter_3008);
        if (head_3008 == null) {
            head_3008 = baru_3008;
        } else {
            Pasien_2511533008 temp_3008 = head_3008;
            while (temp_3008.getNext_3008() != null) {
                temp_3008 = temp_3008.getNext_3008();
            }
            temp_3008.setNext_3008(baru_3008);
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_3008);
    }

    // Panggil Pasien (Delete Head)
    public void panggilPasien_3008() {
        if (head_3008 == null) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Memanggil pasien: " + head_3008.getNamaPasien_3008() +
                               " | Keluhan: " + head_3008.getPenyakit_3008());
            head_3008 = head_3008.getNext_3008();
        }
    }

    // Tampilkan Antrian (Display)
    public void tampilkanAntrian_3008() {
        if (head_3008 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        Pasien_2511533008 temp_3008 = head_3008;
        while (temp_3008 != null) {
            System.out.println("No: " + temp_3008.getNomorAntrian_3008() +
                               " | Nama: " + temp_3008.getNamaPasien_3008() +
                               " | Keluhan: " + temp_3008.getPenyakit_3008());
            temp_3008 = temp_3008.getNext_3008();
        }
    }

    // Cari Pasien (Search by name, case-insensitive)
    public void cariPasien_3008(String nama_3008) {
        Pasien_2511533008 temp_3008 = head_3008;
        boolean found_3008 = false;
        while (temp_3008 != null) {
            if (temp_3008.getNamaPasien_3008().equalsIgnoreCase(nama_3008)) {
                System.out.println("Pasien ditemukan: " + temp_3008.getNamaPasien_3008() +
                                   " | Keluhan: " + temp_3008.getPenyakit_3008() +
                                   " | No Antrian: " + temp_3008.getNomorAntrian_3008());
                found_3008 = true;
                break;
            }
            temp_3008 = temp_3008.getNext_3008();
        }
        if (!found_3008) {
            System.out.println("Pasien dengan nama " + nama_3008 + " tidak ditemukan.");
        }
    }

    // Cek Status Antrian
    public void cekStatusAntrian_3008() {
        if (head_3008 == null) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Total pasien: " + counter_3008);
            System.out.println("Pasien terdepan: " + head_3008.getNamaPasien_3008());
        }
}
    public static void main(String[] args) {
    	 RumahSakit_2511533008 rs = new RumahSakit_2511533008();
         Scanner sc_3008 = new Scanner(System.in);
         int pilihan_3008;

         do {
             System.out.println("\n=== MENU ANTRIAN RUMAH SAKIT ===");
             System.out.println("1. Daftarkan Pasien");
             System.out.println("2. Panggil Pasien");
             System.out.println("3. Tampilkan Antrian");
             System.out.println("4. Cari Pasien");
             System.out.println("5. Cek Status Antrian");
             System.out.println("0. Keluar");
             System.out.print("Pilihan: ");
             pilihan_3008 = sc_3008.nextInt();
             sc_3008.nextLine(); // buang newline

             switch (pilihan_3008) {
                 case 1:
                     System.out.print("Masukkan Nama Pasien: ");
                     String nama_3008 = sc_3008.nextLine();
                     System.out.print("Masukkan Keluhan: ");
                     String penyakit_3008 = sc_3008.nextLine();
                     rs.daftarkanPasien_3008(nama_3008, penyakit_3008);
                     break;
                 case 2:
                     rs.panggilPasien_3008();
                     break;
                 case 3:
                     rs.tampilkanAntrian_3008();
                     break;
                 case 4:
                     System.out.print("Masukkan Nama Pasien yang dicari: ");
                     String cari_3008 = sc_3008.nextLine();
                     rs.cariPasien_3008(cari_3008);
                     break;
                 case 5:
                     rs.cekStatusAntrian_3008();
                     break;
                 case 0:
                     System.out.println("Program selesai. Terima kasih!");
                     break;
                 default:
                     System.out.println("Pilihan tidak valid!");
             }
         } while (pilihan_3008 != 0);

         sc_3008.close();
     }

}
