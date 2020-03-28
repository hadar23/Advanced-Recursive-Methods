public class Question12 {
	public static void main(String[] args) {
		int[] A = {87, 88, 95, 103, 5, 3, 96, 102, 6, 78, 120, 130, 205, 256, 300};
		findRec(A, 0);
		System.out.println("first is " + first + ", longest is " + longest);
	}

	static int longest = 0;
	static int first = 0;
	static int counter = 1;
	static boolean isFirst = true;

	public static void findRec(int[] A, int p) {
		if (p == A.length - 1) {
			if (counter > longest)
				longest = counter;
			return;
		}
		if (A[p] <= A[p+1])
			counter++;
		else {
			if(isFirst==true) {
				first = counter;
				longest = counter;
				isFirst = false;
			} else {
				if(counter > longest)
					longest = counter;
			}
			counter = 1;
		}
		findRec(A, p+1);
	}
}
