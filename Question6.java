public class Question6 {
	public static void main(String[] args) {
		System.out.println(f(4, 3));
	}

	public static int f(int n, int k) {
		if (k == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		return f(n, k - 1) + f(n - 1, k);
	}
}
