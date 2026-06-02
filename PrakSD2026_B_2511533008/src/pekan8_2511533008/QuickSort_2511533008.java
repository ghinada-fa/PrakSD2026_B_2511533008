package pekan8_2511533008;

public class QuickSort_2511533008 {
	static void swap_3008(int[] arr_3008, int i_3008, int j_3008) {
		int temp_3008 = arr_3008[i_3008];
		arr_3008[i_3008] = arr_3008[j_3008];
		arr_3008[j_3008] = temp_3008;
	}
	//metode tambahan untuk mengatur pivot menggunakan median-od-three
	static void medianOfThree_3008(int[] arr_3008, int low_3008, int high_3008) {
		int mid_3008 = low_3008 + (high_3008 - low_3008)/2;
		
		//urutkan elemen low, mid, high
		if (arr_3008[low_3008] > arr_3008[mid_3008]) {
			swap_3008(arr_3008, low_3008, mid_3008);
		}
		if (arr_3008[low_3008] > arr_3008[high_3008]) {
			swap_3008(arr_3008, low_3008, high_3008);
		}
		if (arr_3008[mid_3008] > arr_3008[high_3008]) {
			swap_3008(arr_3008, mid_3008, high_3008);
		}
		swap_3008(arr_3008, mid_3008, high_3008);
	}
	static int partition_3008(int[] arr_3008, int low_3008, int high_3008) {
		//panggil fungsi medianofthree sebelum menentukan pivot
		medianOfThree_3008(arr_3008, low_3008, high_3008);
		
		int pivot_3008 = arr_3008[high_3008]; //sekarang arr[high] sudah berisi nilai median
		int i_3008 = (low_3008 - 1);
		
		for (int j_3008 = low_3008; j_3008 <= high_3008 - 1; j_3008++) {
			//jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if(arr_3008[j_3008] < pivot_3008) {
				//increment indeks elemen yang lebih kecil
				i_3008++;
				swap_3008(arr_3008, i_3008, j_3008);
			}
		}
		swap_3008(arr_3008, i_3008 + 1, high_3008);
		return (i_3008 + 1);
	}
	
	static void quickSort_2511533008(int[] arr_3008, int low_3008, int high_3008) {
		if(low_3008 < high_3008) {
			int pi_3008 = partition_3008(arr_3008, low_3008, high_3008);
			quickSort_2511533008(arr_3008, low_3008, pi_3008 - 1);
			quickSort_2511533008(arr_3008, pi_3008 + 1, high_3008);
		}
	}
	
	public static void printArr_3008(int[] arr_3008) {
		for(int i_3008 = 0; i_3008 < arr_3008.length; i_3008++) {
		System.out.print(arr_3008[i_3008] + " "); }
		System.out.println();	
	}

	public static void main(String[] args) {
		int[] arr_3008 = {10, 7, 8, 9, 1, 5};
		int N_3008 = arr_3008.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_3008(arr_3008);
		
		quickSort_2511533008(arr_3008, 0, N_3008 - 1);
		
		System.out.print("Data terurut quicksort: ");
		printArr_3008(arr_3008);

	}

}
