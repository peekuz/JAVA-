import java.util.Scanner;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {

		int n, sum, count = 0, testcases;
		Scanner scanner = new Scanner(System.in);
		testcases = scanner.nextInt();
		while (count < testcases) {
			count++;
			n = scanner.nextInt();
			sum = scanner.nextInt();
			int array[] = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scanner.nextInt();
			}
			findPositions(array, n, sum);
		}
		scanner.close();
	}

	public static int findPositions(int[] array, int n, int sum) {
		int temp = 0;
		int i = 0;
		for (int j = 0; j < n; j++) {
			if (temp + array[j] < sum) {
				temp = temp + array[j];

			} else {
				temp = temp + array[j];
				while (temp > sum) {
					temp = temp - array[i];
					i++;
				}
			}
			if (temp == sum) {
				System.out.println(i + 1 + " " + (j + 1));
				return 1;
			}
		}
		System.out.println("-1");
		return -1;
	}

}