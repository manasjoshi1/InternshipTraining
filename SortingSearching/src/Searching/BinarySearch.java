//Binary Search Time compexity O(log n)
//space complexity O(1)


package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	    
	  private static int binarySearch(int[] arr, int start, int end, int searchElement){
	    while(start <= end){
	      int middle = (start+end)/2;
	    
	      if(searchElement == arr[middle]){
	        return middle;
	      }
	      // left half
	      if(searchElement < arr[middle]){
	        end = middle - 1;
	      }else{
	          // right half
	        start = middle + 1;
	      }
	    }
	    return -1;
	  }
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int[] arr = {12, 23, 10, 34, 55, 4, 68, 3, 73, 99};
		    Arrays.sort(arr);
		    System.out.println("sorted array- " + Arrays.toString(arr));
		    System.out.println("Enter value to search: ");
		    int searchElement = sc.nextInt();
		    int index = binarySearch(arr, 0, arr.length-1, searchElement);
		    if(index != -1){
		      System.out.println("found item at "+index);
		    }else{
		      System.out.println("Searched item " + searchElement + " not found in the array");
		    }
		  }

}
