import java.util.Arrays;
import java.util.Scanner;

public class CountTheTriplets {

	public static void main(String[] args) {
		int n, count = 0, testcases;
		Scanner scanner = new Scanner(System.in);
		testcases = scanner.nextInt();
		while (count < testcases) {
			count++;
			n = scanner.nextInt();
			int array[] = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scanner.nextInt();
			}
			getCountTheTriplets(array, n);
		}
		scanner.close();
	}

	private static void getCountTheTriplets(int[] array, int n) {
		Arrays.sort(array);
		int j, k, count = 0;
		for (int i = 0; i < array.length - 2; i++) {

			j = i + 1;
			k = j + 1;
			while (k < n) {
				if (array[i] + array[j] == array[k]) {
					System.out.println("pair is " + array[i] + " and " + array[j]);
					count++;
					j++;
				} else if (array[i] + array[j] < array[k]) {
					j++;
					k--;
				}
				k++;
			}
		}
		if (count > 0) {
			System.out.println("output");
			System.out.println(count);
		} else {
			System.out.println("-1");
		}
	}

}
