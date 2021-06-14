package Searching;

import java.util.Scanner;

public class LinearSearch {
	
		    
		  private static int linearSearch(int[] arr, int searchElement){
		    for(int i = 0; i < arr.length; i++){
		      if(arr[i] == searchElement){
		        return i;
		      }
		    }
		    return -1;
		  }
		  public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    int[] arr = {12, 23, 10, 34, 55, 4, 68, 3, 73, 99};
			    System.out.println("Enter value to search: ");
			    int searchElement = sc.nextInt();
			    int index = linearSearch(arr, searchElement);
			    if(index != -1){
			        System.out.println("Found item at " + index );
			    }else{
			        System.out.println("Searched item " + searchElement + " not found ");
			    }
			  }
}
