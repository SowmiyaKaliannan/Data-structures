package course;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int a[]= {50,70,20,40};
		
		System.out.println(Arrays.toString(a)); // prints the given array
		                                        // a.length-1 ....here -1 because in first pass of bubblesort 
		                                        //(ex in above first pass:50,20,40,70----70 is final,greatest one,there is no need to swap it again)
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int t= a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
			}
		System.out.println(Arrays.toString(a)); // prints the sorted array
			}
		}
	

