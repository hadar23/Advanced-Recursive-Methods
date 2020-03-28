public class Question13 {
	public final static int N = 4;
	public static int i = 1;

	public static void main(String[] args) {
		char[][] A = { { 'a', 'a', 'a', 'b' }, { 'a', 'a', 'b', 'a' }, { 'a', 'b', 'a', 'a' }, { 'b', 'a', 'a', 'a' } };
		System.out.println(checkMat1(A));
		System.out.println(checkMat2(A));
		printMat(A);
	}

	public static int checkMat1(char[][] A) {
		int k;
		if (A[0][N - 1] != 'b')
			return 0;
		if (i == N)
			return i;
		if (A[i][N - i - 1] == 'b') {
			for (k = 0; k < i; k++) {
				if ((A[i][N - i + k] != 'a') || (A[i - 1 - k][N - i - 1] != 'a')) {
					return i;
				}
			}
		} else {
			return i;
		}
		i++;
		return checkMat1(A);
	}

	public static int checkMat2(char[][] A) {
		int k;
		if (A[0][N - 1] != 'b')
			return 0;
		if (i == N)
			return i;
		if (A[i][N - i - 1] == 'b') {
			for (k = N - i; k <= N - 1; k++) {
				if (A[i][k] != 'a') {
					return i;
				}
			}
			for (k = i - 1; k >= 0; k--) {
				if (A[k][N - i - 1] != 'a') {
					return i;
				}
			}
		} else {
			return i;
		}
		i++;
		return checkMat2(A);
	}

	public static void printMat(char[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
