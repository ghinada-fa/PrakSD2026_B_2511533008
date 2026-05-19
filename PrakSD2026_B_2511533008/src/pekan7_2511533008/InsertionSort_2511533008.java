package pekan7_2511533008;

public class InsertionSort_2511533008 {
	public static void insertionSort_2511533008 (int[] arr_3008) {
		int n_3008 = arr_3008.length;
		for (int i_3008 = 1; i_3008 < n_3008; i_3008++) {
			int key_3008 = arr_3008[i_3008];
			int j_3008 = i_3008 - 1;
			while (j_3008 >= 0 && arr_3008[j_3008] > key_3008) {
				arr_3008[j_3008 + 1] = arr_3008[j_3008];
				j_3008--;
			}
			arr_3008[j_3008 + 1] = key_3008;
		}
	}

	public static void main(String[] args) {
		int arr_3008[] = {23, 78, 45, 8, 32, 56, 1};
		int n_3008 = arr_3008.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_3008 = 0; i_3008 < n_3008; i_3008++)
			System.out.print(arr_3008[i_3008]+ " ");
		System.out.println("");
		insertionSort_2511533008(arr_3008);
		System.out.printf("array yang sudah terurut:\n");
		for (int i_3008 = 0; i_3008 < n_3008; i_3008++)
			System.out.print(arr_3008[i_3008]+ " ");
		System.out.println("");

	}

}
