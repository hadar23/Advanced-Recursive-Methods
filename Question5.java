public class Question5 {

	public static void main(String[] args) {
		System.out.println(f(6, 2));
	}

	public static int f(int n, int k) {
		if (k == 0) {
			return 1;
		}
		if (n < k) {
			return 0;
		}
		if (k == 1) {
			return n;
		}
		return f(n - 2, k - 1) + f(n - 1, k);
	}
}