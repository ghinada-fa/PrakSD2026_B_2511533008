package pekan8_2511533008;

import java.util.Scanner;

class Lagu_3008 {
    String judul_3008;
    int durasi_3008; // dalam detik

    Lagu_3008(String judul_3008, int durasi_3008) {
        this.judul_3008 = judul_3008;
        this.durasi_3008 = durasi_3008;
    }

    @Override
    public String toString() {
        return judul_3008 + " - " + durasi_3008 + " detik";
    }
}

public class Sorting_2511533008 {
    Lagu_3008[] dataLagu_3008 = new Lagu_3008[20];
    int jumlahLagu_3008 = 0;

    // Input lagu
    public void inputData_3008() {
        dataLagu_3008[0] = new Lagu_3008("Rahmatun Lil'alamin", 230);
        dataLagu_3008[1] = new Lagu_3008("Qalbi Fil Madinah", 224);
        dataLagu_3008[2] = new Lagu_3008("Nas Tehbehlena", 256);
        dataLagu_3008[3] = new Lagu_3008("Sepanjang Hidup", 236);
        dataLagu_3008[4] = new Lagu_3008("Insha Allah", 270);
        dataLagu_3008[5] = new Lagu_3008("For The Rest Of My Life", 234);
        dataLagu_3008[6] = new Lagu_3008("Salla Alayka Rahman", 228);
        dataLagu_3008[7] = new Lagu_3008("Sallou", 222);
        jumlahLagu_3008 = 8;
    }

    // Quick Sort
    public void quickSort_3008(Lagu_3008[] arr_3008, int low_3008, int high_3008) {
        if (low_3008 < high_3008) {
            int pi = partition_3008(arr_3008, low_3008, high_3008);
            quickSort_3008(arr_3008, low_3008, pi - 1);
            quickSort_3008(arr_3008, pi + 1, high_3008);
        }
    }

    private int partition_3008(Lagu_3008[] arr_3008, int low_3008, int high_3008) {
        int pivot_3008 = arr_3008[high_3008].durasi_3008;
        int i_3008 = (low_3008 - 1);
        for (int j_3008 = low_3008; j_3008 < high_3008; j_3008++) {
            if (arr_3008[j_3008].durasi_3008 <= pivot_3008) {
                i_3008++;
                Lagu_3008 temp_3008 = arr_3008[i_3008];
                arr_3008[i_3008] = arr_3008[j_3008];
                arr_3008[j_3008] = temp_3008;
            }
        }
        Lagu_3008 temp_3008 = arr_3008[i_3008 + 1];
        arr_3008[i_3008 + 1] = arr_3008[high_3008];
        arr_3008[high_3008] = temp_3008;
        return i_3008 + 1;
    }

    // Merge Sort
    public void mergeSort_3008(Lagu_3008[] arr_3008, int left_3008, int right_3008) {
        if (left_3008 < right_3008) {
            int mid_3008 = (left_3008 + right_3008) / 2;
            mergeSort_3008(arr_3008, left_3008, mid_3008);
            mergeSort_3008(arr_3008, mid_3008 + 1, right_3008);
            merge_3008(arr_3008, left_3008, mid_3008, right_3008);
        }
    }

    private void merge_3008(Lagu_3008[] arr_3008, int left_3008, int mid_3008, int right_3008) {
        int n1_3008 = mid_3008 - left_3008 + 1;
        int n2_3008 = right_3008 - mid_3008;

        Lagu_3008[] L_3008 = new Lagu_3008[n1_3008];
        Lagu_3008[] R_3008 = new Lagu_3008[n2_3008];

        for (int i_3008 = 0; i_3008 < n1_3008; i_3008++) L_3008[i_3008] = arr_3008[left_3008 + i_3008];
        for (int j_3008 = 0; j_3008 < n2_3008; j_3008++) R_3008[j_3008] = arr_3008[mid_3008 + 1 + j_3008];

        int i_3008 = 0, j_3008 = 0, k_3008 = left_3008;
        while (i_3008 < n1_3008 && j_3008 < n2_3008) {
            if (L_3008[i_3008].durasi_3008 <= R_3008[j_3008].durasi_3008) {
                arr_3008[k_3008] = L_3008[i_3008]; i_3008++;
            } else {
                arr_3008[k_3008] = R_3008[j_3008]; j_3008++;
            }
            k_3008++;
        }
        while (i_3008 < n1_3008) { arr_3008[k_3008] = L_3008[i_3008]; i_3008++; k_3008++; }
        while (j_3008 < n2_3008) { arr_3008[k_3008] = R_3008[j_3008]; j_3008++; k_3008++; }
    }

    // Shell Sort
    public void shellSort_3008(Lagu_3008[] arr_3008, int n_3008) {
        for (int gap_3008 = n_3008/2; gap_3008 > 0; gap_3008 /= 2) {
            for (int i_3008 = gap_3008; i_3008 < n_3008; i_3008++) {
                Lagu_3008 temp_3008 = arr_3008[i_3008];
                int j_3008;
                for (j_3008 = i_3008; j_3008 >= gap_3008 && arr_3008[j_3008-gap_3008].durasi_3008 > temp_3008.durasi_3008; j_3008 -= gap_3008) {
                    arr_3008[j_3008] = arr_3008[j_3008-gap_3008];
                }
                arr_3008[j_3008] = temp_3008;
            }
        }
    }

    // Tampil data sebelum & sesudah sorting
    public void tampilData_3008(int pilihan_3008) {
        System.out.println("=== Sorting Playlist NIM: 2511533008 ===");
        System.out.println("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): " + pilihan_3008);

        System.out.println("\nData Sebelum Sorting:");
        for (int i_3008 = 0; i_3008 < jumlahLagu_3008; i_3008++) {
            System.out.println((i_3008 + 1) + ". " + dataLagu_3008[i_3008]);
        }

        switch (pilihan_3008) {
            case 1:
                shellSort_3008(dataLagu_3008, jumlahLagu_3008);
                System.out.println("\nData Setelah Shell Sort (Durasi Asc):");
                break;
            case 2:
                quickSort_3008(dataLagu_3008, 0, jumlahLagu_3008 - 1);
                System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
                break;
            case 3:
                mergeSort_3008(dataLagu_3008, 0, jumlahLagu_3008 - 1);
                System.out.println("\nData Setelah Merge Sort (Durasi Asc):");
                break;
            default:
                System.out.println("\nPilihan tidak valid!");
                return;
        }

        for (int i_3008 = 0; i_3008 < jumlahLagu_3008; i_3008++) {
            System.out.println((i_3008 + 1) + ". " + dataLagu_3008[i_3008]);
        }
    }

    public static void main(String[] args) {
        Sorting_2511533008 playlist_3008 = new Sorting_2511533008();
        playlist_3008.inputData_3008();

        Scanner sc_3008 = new Scanner(System.in);
        System.out.print("Masukkan pilihan algoritma (1=Shell, 2=Quick, 3=Merge): ");
        int pilihan_3008 = sc_3008.nextInt();

        playlist_3008.tampilData_3008(pilihan_3008);
    }
}
