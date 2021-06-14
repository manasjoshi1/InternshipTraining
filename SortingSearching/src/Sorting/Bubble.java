package Sorting;


public class Bubble {
	public int[] sortArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		Bubble s = new Bubble();
		int arr[] = { 1, 32, 34, 21, 31, 12, 78, 5 };
		int sorted[] = s.sortArray(arr);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
	}
}
