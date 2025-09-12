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






/*square brackets --array
  new (keyword) ---create object
  
  ARRAY
  --similar datatype elements should be stored
            (ex:if we use int datatype means all elements(data) should be an integer,if we want to store names(data) use string ,decimal value--double,float)
  --index element should be starts with o ( a[0]=1 , a[1]=2)
  
Drawbacks
  --array size should be known in advance
  if suppose we give size as 100 and only use 20...then balance 80
  memory will be waste
 */


/* 
 
 m1=1,m2=2,...m100=100-----if we create more variables(m1,m2) to store data...by accessing it we need to remember all the variable names
 so that all the data should be stored in single variable  
 its called array. in array--access the data by index element.
 
 */