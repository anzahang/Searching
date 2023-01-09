import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = new String[5];
		String[] phones = new String[5];

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
			phones[i] = sc.nextLine();
		}
		for (int j = 0; j < names.length - 1; j++) {

			int min = j;
			for (int k = j + 1; k < names.length; k++)
				if (names[k].compareTo(names[min]) < 0)
					min = k;

			String temp = names[j];
			names[j] = names[min];
			names[min] = temp;
			String temp2 = phones[j];
			phones[j] = phones[min];
			phones[min] = temp;
		}
		System.out.println("Please input a search value");
		String name = sc.nextLine();
		System.out.println(binarySearch(names, name));
	}

	static int binarySearch(String[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m]);

			if (res == 0)
				return m;

			if (res > 0)
				l = m + 1;

			else
				r = m - 1;
		}

		return -1;
	}
}
