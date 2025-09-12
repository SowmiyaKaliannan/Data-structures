package course;

/*
public class Array {
	
	public static void main(String[] args) {
		int a[]	= new int[5]; 
		
		System.out.println(a[0]);   //if suppose we didnt initialize the values, then the array values should be zero(int),null(string),0.0(float)
				
	}}
*/
	
/*
 public class Array { 
 	public static void main(String[] args) {
		
		int a[]	= new int[5]; //declaration
		
		a[0]=10;   // initialization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[2]);
	}}
	*/
	
public class Array {
	public static void main(String[] args) {
		
		int a[]={10,20,30,40,50};// both declaration and initialization
		                         //here there is no need to give size,it calculates the size
		
		for(int i=0;i<5;i++)  // or for(int i=0;i<a.length;i++)
			
		System.out.println(a[i]);
		//System.out.println(a[3]);   ----it prints 40 five times
	}
}






