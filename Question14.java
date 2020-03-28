public class Question14 {
	public static void main(String[] args) {
		int[] A = { 3, 43, 91, 10, 7, 17, 22, 18, 11, 57 };
		int[] B = { 5, 3, 2, 0, 1, 4, 7 };
		int smallestElementInOrder = 6;
		System.out.printf("Smallest (%d order) Element in A: %d\n", smallestElementInOrder,
				findIthSmallestElement(A, 0, A.length - 1, smallestElementInOrder));
		System.out.println();
		System.out.println("Missing Element in B: " + findMissingElement(B, 0, 6));
	}

	public static int findIthSmallestElement(int[] A, int l, int r, int i) {
		if (r < l)
			return A[i - 1];

		int j = l + 1;
		int k = r;
		int pivot = A[l];
		while (j < k) {
			while (A[j] < pivot && j < r) {
				j++;
			}
			while (pivot < A[k] && l < k)
				k--;
			if (j < k)
				swap(A, j, k);
		}
		if (A[k] < A[l])
			swap(A, l, k);
		if (k + 1 < i)
			return findIthSmallestElement(A, k + 1, r, i);
		else if (i < k + 1)
			return findIthSmallestElement(A, l, j - 1, i);
		else
			return A[i - 1];

	}

	public static int findMissingElement(int[] A, int l, int r) {
		int m = (r + l) / 2;
		if (r <= l) {
			return m;
		}
		if (m == findIthSmallestElement(A, l, r, m + 1)) {
			return findMissingElement(A, m + 1, r);
		} else
			return findMissingElement(A, l, m);
	}

	public static void swap(int[] A, int j, int k) {
		int temp = A[j];
		A[j] = A[k];
		A[k] = temp;
	}

	public static void mergeSort(int[] A, int l, int r) {
		if (l < r) {
			int m = (r + l) / 2;
			mergeSort(A, l, m);
			mergeSort(A, m + 1, r);
			merge(A, l, m, r);
		}
	}

	public static void merge(int[] A, int l, int m, int r) {
		int lengthL = m - l + 1;
		int lengthR = r - m;
		int[] right = new int[lengthR];
		int[] left = new int[lengthL];

		for (int i = 0; i < lengthL; i++)
			left[i] = A[l + i];

		for (int j = 0; j < lengthR; j++) {
			right[j] = A[m + 1 + j];
		}

		int indexL = 0;
		int indexR = 0;
		int indexM = l;

		while (indexL < lengthL && indexR < lengthR) {
			if (left[indexL] < right[indexR])
				A[indexM++] = left[indexL++];
			else
				A[indexM++] = right[indexR++];
		}

		while (indexL < lengthL)
			A[indexM++] = left[indexL++];

		while (indexR < lengthR)
			A[indexM++] = right[indexR++];
	}
}
