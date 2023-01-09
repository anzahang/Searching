import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//recursive binary search takes more time to compile than iterative binary search
public class exercise2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> wordlist = readFile();
		System.out.println("Please enter a search word.");
		String search = sc.nextLine();
		if (binarySearch(wordlist, search)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
		System.out.println("Please enter a search word");
		search = sc.nextLine();
		if (recursiveBinarySearch(wordlist, search)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}

	private static boolean recursiveBinarySearch(ArrayList<String> list, String search) {
		int start = 0;
		int end = list.size();
		int mid = end / 2;

		if (end < start) {
			return false;
		} else if (search.equals(list.get(mid))) {
			return true;
		} else if (search.compareTo(list.get(mid)) < 0) {
			String[] split = new String[mid];
			for (int i = 0; i < mid; i++) {
				String s = list.get(i);
				split[i] = s;
			}
			ArrayList<String> ar = new ArrayList<>();
			for (int i = 0; i < split.length; i++) {
				ar.add(split[i]);
			}
			return recursiveBinarySearch(ar, search);
		} else {
			ArrayList<String> ar = new ArrayList<>();

			for (int i = 0; i < end - mid - 1; i++) {
				String s = list.get(mid + i + 1);
				ar.add(s);
			}
			return recursiveBinarySearch(ar, search);
		}
	}

	private static boolean binarySearch(ArrayList<String> arr, String s) {
		int l = 0, r = arr.size() - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = s.compareTo(arr.get(m));

			// Check if x is present at mid
			if (res == 0)
				return true;

			// If x greater, ignore left half
			if (res > 0)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		return false;
	}

	private static ArrayList<String> readFile() throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<>();
		File file = new File("C:\\Users\\andre\\Downloads\\wordlist.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			list.add(s);
		}
		sc.close();
		return list;
	}

}
