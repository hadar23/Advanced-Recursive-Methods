public class Question15 {
	public static void main(String[] args) {
		int[] M = { 5, 12, 45, 49, 56, 58, 62 };
		int[] P = { 5, 14, 18, 12, 31, 13, 24};
		int k = 9;

		for (int i = 0; i < M.length; i++) {
			System.out.printf("mp(%d): %d\n", M[i], mp(M, P, k, i));
		}
		System.out.println();

		for (int i = 0; i < M.length; i++) {
			System.out.printf("mp2(%d): %d\n", M[i], mp2(M, P, k, i));
		}
		System.out.println("\nThe house numbers of the best places to build an ice-cream shop:\n"
				+ "(The difference between the numbers should be bigger than " + k + "\n");
		printMp(M, P, k, M.length - 1);

		System.out.println();

		System.out.println("\nThe house numbers of the best places to build an ice-cream shop:\n"
				+ "(The difference between the numbers should be bigger than " + k + "\n");
		printMp2(M, P, k, M.length - 1);
	}

	public static int max(int a, int b) {
		if (a > b)
			return a;
		return b;
	}

	public static int mp(int[] M, int[] P, int k, int i) {
		if (i < 0)
			return 0;
		int j = i;
		while (M[j] > M[i] - k) {
			j--;
			if (j < 0) {
				break;
			}
		}

		return max(P[i] + mp(M, P, k, j), mp(M, P, k, i - 1));
	}

	public static int mp2(int[] M, int[] P, int k, int i) {
		if (i < 0)
			return 0;

		if (i == 0)
			return P[0];

		int guessWithout = mp2(M, P, k, i - 1);
		int guessWith = P[i];

		if (M[i] > k) {
			for (int j = i; j >= 0; j--) {
				if (M[j] <= M[i] - k) {
					guessWith = guessWith + mp2(M, P, k, j);
					break;
				}
			}
		}
		return max(guessWith, guessWithout);
	}

	public static void printMp(int[] M, int[] P, int k, int i) {
		if (i < 0)
			return;
		int j = i;
		while (M[j] > M[i] - k) {
			j--;
			if (j < 0) {
				break;
			}
		}

		if (P[i] + mp(M, P, k, j) > mp(M, P, k, i - 1)) {
			System.out.print(M[i] + " ");
			printMp(M, P, k, j);
		} else {
			printMp(M, P, k, i - 1);
		}
	}

	public static void printMp2(int[] M, int[] P, int k, int i) {
		if (i < 0)
			return;

		if (i == 0) {
			System.out.print(M[i]);
			return;
		}

		int guessWithout = mp2(M, P, k, i - 1);
		int guessWith = P[i];
		
		int j = i;

		if (M[i] > k) {
			for (; j >= 0; j--) {
				if (M[j] <= M[i] - k) {
					guessWith = guessWith + mp2(M, P, k, j);
					break;
				}
			}
		}

		if (guessWith > guessWithout) {
			System.out.print(M[i] + " ");
			printMp2(M, P, k, j);
		} else {
			printMp2(M, P, k, i - 1);
		}
	}
}
