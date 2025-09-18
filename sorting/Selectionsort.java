package course;

//this prints only output

import java.util.Arrays;
public class Selectionsort {

	public static void main(String[] args) {
		int a[]= {20,10,35,5};
	int min=0;
	
		System.out.println(Arrays.toString(a)); //is a class to print array
		
        for(int i=0;i<a.length;i++) {
        	// j=i+1...because the checks starts with next element of i.. until the end(a.length)
        	
        	for(int j=i+1;j<a.length;j++) {
        		
//here we consider min(current element or index element) as the minimum elememt and compares to other elements in the right,whether any other element is minimum than that min
        		if(a[j]<a[min]) {
        			 min=j;
        		}
        	}
        	// swapping
        	//here even without this if statement the output runs correct;this if statement is for not to swap the same values...its not needed
        	
        	 if(min!=i){
        	int temp=a[i];
        	a[i]=a[min];
        	a[min]=temp;
        	}
           //if we print 	  System.out.println(Arrays.toString(a));  here, it will show all the iterations
        }
       System.out.println(Arrays.toString(a)); 
	}

}

/*
public class Selectionsort {

	public static void main(String[] args) {
		int a[]= {20,10,35,5};
	int min=0;      
	
	System.out.println("Unsorted Array");
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" "); //ln after the print gives u a new line...here we want to print all numbers in the array in same line. 
	}
		System.out.println();// it gives a space of line
		
        for(int i=0;i<a.length;i++) {
        	
        	for(int j=i+1;j<a.length;j++) {
        		
        		if(a[j]<a[min]) {
        			 min=j;
        		}
        	}
        	
        	 if(min!=i){
        	int temp=a[i];
        	a[i]=a[min];
        	a[min]=temp;
        	}
           
        }
    	System.out.println("Sorted Array");
    	
    	for(int i=0;i<a.length;i++) {
    		System.out.print(a[i]+" "); 
    	}
    	
       
	}

}
*/