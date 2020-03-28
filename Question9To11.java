public class Question9To11 {
	public static void main(String[] args) {
		System.out.println(count(3));
	}

	public static int count(int num) {
		int sum = 0;
		if (num == 0) {
			return 1;
		}
		for (int i = 1; i <= num; i++) {
			sum += count(num - i);
		}
		return sum;
	}
}