package Selection;

public class Merge {
public static void mergeSort(int list[],int low, int high){
	 
	   if (low >= high) 
	          { 
	               return;
	              }   
	 
	 
	  int middle = (low + high) / 2;          
	 
	  mergeSort(list, low, middle);
	 
	  mergeSort(list, middle + 1, high);
	 
	  merge(list, low,middle,high);
	 
	 
	       }
	 
	 
	private static void merge(int list[], int low, int middle, int high)
	 
	{
	 
	  int IstList_end= middle;
	 
	  int IIndList_start = middle + 1;
	 
	  int l=low;
	 
	  while ((l <= IstList_end) && (IIndList_start <= high))
	 
	             {
	 
	      if (list[low] < list[IIndList_start]) {
	 
	            low++;
	 
	         } else {
	 
	              int temp = list[IIndList_start];
	     
	              for (int j = IIndList_start-1; j >= low; j--) {
	     
	              list[j+1] = list[j];
	 
	          }
	 
	      list[low] = temp;
	 
	      low++;
	 
	      IstList_end++;
	 
	      IIndList_start++;
	 
	      }
	 
	    }
	 
	 
	  }

	public static void main(String[] args) {

		
		int arr[] = { 1, 32, 34, 21, 31, 12, 78, 5 };
		Merge.mergeSort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
