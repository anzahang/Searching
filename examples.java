import java.util.Scanner;

public class examples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		int index0 = 0;
		int length = ar.length;
		System.out.println(binarySearch(ar, index0, length, search));

	}

	public static int binarySearch(int arr[], int min, int max, int search) {
		if (max >= min) {
			int mid = min + (max - min) / 2;
			if (arr[mid] == search) {
				return mid;
			}
			if (arr[mid] > search) {
				return binarySearch(arr, min, mid - 1, search);
			}

			return binarySearch(arr, mid + 1, max, search);
		}
		return -1;
	}

}
