package pekan8_2511533008;

public class ShellSort_2511533008 {
	
	public static void shellSort_2511533008(int [] A_3008) {
		int n_3008 = A_3008.length;
		int gap_3008 = n_3008/2;
		while (gap_3008 > 0) {
			for (int i_3008 = gap_3008; i_3008 < n_3008; i_3008++) {
				int temp_3008 = A_3008[i_3008];
				int j_3008 = i_3008;
				while (j_3008 >= gap_3008 && A_3008[j_3008 - gap_3008] > temp_3008) {
					A_3008[j_3008] = A_3008[j_3008 - gap_3008];
					j_3008 = j_3008 - gap_3008;
				}
				A_3008[j_3008] = temp_3008;
			}
			gap_3008 = gap_3008/2;
		}
	}

	public static void main(String[] args) {
		int[] data_3008 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray_3008(data_3008);
		
		shellSort_2511533008(data_3008);
		
		System.out.print("Sesudah (shell sort): ");
		printArray_3008(data_3008);

	}
	
	public static void printArray_3008(int[] arr_3008) {
		for (int i_3008 : arr_3008) System.out.print(i_3008 + " ");
		System.out.println();
	}

}
