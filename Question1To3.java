public class Question1To3 {
	public static int N = 3;
	
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{5,6,7},{9,10,5}};
		System.out.println(Tr(mat, 0));
	}
	
	public static int Tr(int mat[][], int n) {
		int i, num;
		num = mat[n][n];
		if(n==N-1) {
			return num;
		}
		else {
			for(i = n + 1; i < N; i++) {
				num -= mat[n][i] + mat[i][n];
			}
		}
		return num + Tr(mat, ++n);
	}
}