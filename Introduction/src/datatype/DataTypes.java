package datatype;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println(5.0/2);
		System.out.println((double) 5/2);
		//adding the double is called casting. Changing the 5 to 5.0
		System.out.println(5/2);
		//gets 2.5, but rounds down
		System.out.println(3+5.0/2+5*2);
		System.out.println((double) 3+5/2+5*2);
		System.out.println((int)(3.0+5)/(2+5/2));
		
		double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;

		System.out.println("d1 : " + d1); 
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));
		
		//String s = "Happy "+18+"th birthday!";
		//System.out.println(s);
		
		String s = "Happy "+(54/3)+"th birthday!";
		System.out.println(s);
		
		int m = 22;
		int n = 7;
		System.out.println("m/n is "+(m/n));
		
		//int m = 22;
		//int n = 7;
		//System.out.println("m/n is "+((double)m/n));

	}

}
