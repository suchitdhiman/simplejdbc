package com.example;

public class SortingAnArray {

	public static void main(String[] args) {
		 int[] a = {1000,34,55,77,88, 23,11};
		 for(int i = 0; i<a.length; i++) {
			 for(int j = i+1; j<a.length; j++) {
				 if(a[i]>a[j]) {
					 int max = a[i];
					 a[i]=a[j];
					 a[j]=max;
					 
						 }
						 }
		 }
		 
		 for (int i = 0; i < a.length; i++) 
         {     
            System.out.println(a[i]);  
         }

	}

}
