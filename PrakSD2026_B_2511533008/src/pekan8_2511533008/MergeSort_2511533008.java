package pekan8_2511533008;

public class MergeSort_2511533008 {
	void merge_3008(int arr_3008[], int l_3008, int m_3008, int r_3008) {
		//find sizes of two subarrays to be merged
		int n1_3008 = m_3008 - l_3008 + 1;
		int n2_3008 = r_3008 - m_3008;
		/* create temp arrays */
		int L_3008[] = new int[n1_3008];
		int R_3008[] = new int[n2_3008];
		/* copy data to temp arrays */
		for (int i_3008 = 0; i_3008 < n1_3008; i_3008++)
			L_3008[i_3008] = arr_3008[l_3008 + i_3008];
		for (int j_3008 = 0; j_3008 < n2_3008; j_3008++)
			R_3008[j_3008] = arr_3008[m_3008 + 1 + j_3008];
		int i_3008 = 0, j_3008 = 0;
		//initial index of merged subarray array
		int k_3008 = l_3008;
		while (i_3008 < n1_3008 && j_3008 < n2_3008) {
			if (L_3008[i_3008] <= R_3008[j_3008]) {
				arr_3008[k_3008] = L_3008[i_3008];
				i_3008++;
			} else {
				arr_3008[k_3008] = R_3008[j_3008];
				j_3008++;
			}
			k_3008++;
		}
		/*copy remaining elements of L[] if any */
		while (i_3008 < n1_3008) {
			arr_3008[k_3008] = L_3008[i_3008];
			i_3008++;
			k_3008++;
		}
		/*copy remaining elements of R[] if any */
		while (j_3008 < n2_3008) {
			arr_3008[k_3008] = R_3008[j_3008];
			j_3008++;
			k_3008++;
		}
	}
	
	void sort_3008(int arr_3008[], int l_3008, int r_3008) {
		if (l_3008 < r_3008) {
			//find the middle point
			int m_3008 = (l_3008 + r_3008)/2;
			//sort first and second halves
			sort_3008(arr_3008, l_3008, m_3008);
			sort_3008(arr_3008, m_3008 + 1, r_3008);
			//merge the sorted halves
			merge_3008(arr_3008, l_3008, m_3008, r_3008);
		}
	}
	/* A utility function to print array of size n */
	static void printArray_3008(int arr_3008[]) {
		int n_3008 = arr_3008.length;
		for (int i_3008 = 0; i_3008 < n_3008; ++i_3008) {
		    System.out.print(arr_3008[i_3008] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int arr_3008[] = {12, 11, 13, 5, 6, 7};
		System.out.println("Sebelum terurut: ");
		printArray_3008(arr_3008);
		MergeSort_2511533008 ob_3008 = new MergeSort_2511533008();
		ob_3008.sort_3008(arr_3008, 0, arr_3008.length - 1);
		System.out.println("\nSesudah terurut menggunakan merge sort: ");
		printArray_3008(arr_3008);
	}

}
