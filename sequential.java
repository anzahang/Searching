import java.util.Scanner;

public class sequential {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int search = sc.nextInt();

		System.out.println(sequential(ar, search));
	}

	public static int sequential(int[] ar, int search) {
		for (int i : ar) {
			if (i == search) {
				return i + "".indexOf(i);
			}
		}
		return -1;
	}

	public static int sequentialRecursive(int[] ar, int search, int length) {
		if (ar[length] == search) {
			return ar[length] + "".indexOf(ar[length]);
		} else if (length >= 0) {
			return sequentialRecursive(ar, search, length - 1);
		} else {
			return -1;
		}

	}
}
