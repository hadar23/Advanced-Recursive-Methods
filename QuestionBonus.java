public class QuestionBonus {
	static int[] arr;
	static int i = 0;
	static int counter = 0;

	public static void main(String[] args) {
		int n = 8;
		int N = 4;
		arr = new int[n];
		getOddN(n, N);
		System.out.printf(
				"The number of different ways to take apart the number %d, to a maximum of %d odd numbers is %d\n\n", n,
				N, counter);
		int temp = count(n, N, 1);
		arr = new int[n];
		System.out.printf(
				"The number of different ways to take apart the number %d, to a maximum of %d odd numbers is %d\n", n,
				N, temp);
	}

	public static int count(int num, int N, int j) {
		if (i >= arr.length || (N == 0 && num > 0)|| num < 0) {
			return 0;
		}
		int sum = 0;
		if (num == 0) {
			for (int k = 0; k < i; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
			return 1;
		}
		for (int k = j; k <= num; k = k + 2) {
			arr[i++] = k;
			sum += count(num - k, N - 1, k);
			arr[--i] = 0;
		}
		return sum;
	}

	public static void getOddN(int n, int N) {
		if (i >= arr.length || (N == 0 && n > 0) || n < 0) {
			return;
		}
		if (n == 0) {
			for (int j = 0; j < i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
			counter++;
			return;
		}
		int k = 1;
		while (k <= n) {
			if (i == 0 || arr[i - 1] <= k) {
				arr[i++] = k;
				getOddN(n - k, N - 1);
				arr[--i] = 0;
			}
			k += 2;
		}
	}
}
