package pekan6_2511533008;
import java.util.Scanner;

public class Musik_2511533008 {
    // tambah lagu di akhir
    static Lagu_2511533008 tambahLagu_3008(Lagu_2511533008 head_3008, String judul_3008, String penyanyi_3008) {
        Lagu_2511533008 newLagu_3008 = new Lagu_2511533008(judul_3008, penyanyi_3008);
        if (head_3008 == null) {
            head_3008 = newLagu_3008;
        } else {
            Lagu_2511533008 curr_3008 = head_3008;
            while (curr_3008.next_3008 != null) {
                curr_3008 = curr_3008.next_3008;
            }
            curr_3008.next_3008 = newLagu_3008;
            newLagu_3008.prev_3008 = curr_3008;
        }
        return head_3008;
    }

    // hapus lagu pertama
    public static Lagu_2511533008 hapusLaguAwal_3008(Lagu_2511533008 head_3008) {
        if (head_3008 == null) return null;
        head_3008 = head_3008.next_3008;
        if (head_3008 != null) head_3008.prev_3008 = null;
        return head_3008;
    }

    // tampil maju
    static void tampilMaju_3008(Lagu_2511533008 head_3008) {
        Lagu_2511533008 curr_3008 = head_3008;
        while (curr_3008 != null) {
            System.out.print(curr_3008.judul_3008 + " - " + curr_3008.penyanyi_3008 + " | ");
            curr_3008 = curr_3008.next_3008;
        }
        System.out.println();
    }

    // tampil mundur
    static void tampilMundur_3008(Lagu_2511533008 head_3008) {
        if (head_3008 == null) return;
        Lagu_2511533008 curr_3008 = head_3008;
        while (curr_3008.next_3008 != null) {
            curr_3008 = curr_3008.next_3008;
        }
        while (curr_3008 != null) {
            System.out.print(curr_3008.judul_3008 + " - " + curr_3008.penyanyi_3008 + " | ");
            curr_3008 = curr_3008.prev_3008;
        }
        System.out.println();
    }

    // cari lagu
    public void cariLagu_3008(Lagu_2511533008 head_3008, String judul_3008) {
        Lagu_2511533008 curr_3008 = head_3008;
        while (curr_3008 != null) {
            if (curr_3008.judul_3008.equalsIgnoreCase(judul_3008)) {
                System.out.println("Lagu ditemukan: " + curr_3008.judul_3008 + " - " + curr_3008.penyanyi_3008);
                return;
            }
            curr_3008 = curr_3008.next_3008;
        }
        System.out.println("Lagu tidak ditemukan!");
    }

    // menu
    public static void tampilkanPilihan_3008() {
        System.out.println("=== Playlist Musik NIM: 2511533008 ===");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Hapus Lagu Pertama");
        System.out.println("3. Lihat Playlist (Maju)");
        System.out.println("4. Lihat Playlist (Mundur)");
        System.out.println("5. Cari Lagu");
        System.out.println("6. Keluar");
    }

    public static void main(String[] args) {
        Scanner sc_3008 = new Scanner(System.in);
        Musik_2511533008 playlist_3008 = new Musik_2511533008();
        Lagu_2511533008 head_3008 = null;
        int choise_3008;

        do {
            tampilkanPilihan_3008();
            System.out.print("Pilihan : ");
            choise_3008 = sc_3008.nextInt();
            sc_3008.nextLine();

            switch (choise_3008) {
                case 1:
                    System.out.print("Judul lagu: ");
                    String judul_3008 = sc_3008.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi_3008 = sc_3008.nextLine();
                    head_3008 = tambahLagu_3008(head_3008, judul_3008, penyanyi_3008);
                    System.out.println("Lagu berhasil ditambahkan");
                    break;
                case 2:
                    head_3008 = hapusLaguAwal_3008(head_3008);
                    System.out.println("Lagu pertama berhasil dihapus");
                    break;
                case 3:
                    tampilMaju_3008(head_3008);
                    break;
                case 4:
                    tampilMundur_3008(head_3008);
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu yang dicari: ");
                    String cari_3008 = sc_3008.nextLine();
                    playlist_3008.cariLagu_3008(head_3008, cari_3008);
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choise_3008 != 6);

        sc_3008.close();
    }
}