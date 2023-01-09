import java.util.Scanner;

public class iterative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int search = sc.nextInt();

		System.out.println(iterativeBinarySearch(ar, search));

	}

	private static int iterativeBinarySearch(int[] ar, int search) {
		int l = 0, r = ar.length - 1;
		while (l <= r) {

			int m = l + (r - l) / 2;

			if (ar[m] == search)
				return m;

			if (ar[m] < search)
				l = m + 1;

			else
				r = m - 1;
		}

		return -1;
	}

}
