package Selection;

public class SelectionSort {

	public int[] sortArray(int arr[]) {
		for(int i =0; i< arr.length-1;i++) {
			int index= i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
				int t=arr[index];
				arr[index]=arr[i];
				arr[i]=t;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		SelectionSort s = new SelectionSort();
		int arr[] = { 1, 32, 34, 21, 31, 12, 78, 5 };
		int sorted[] = s.sortArray(arr);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
	}
	}
