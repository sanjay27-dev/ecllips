package BitwiseOperator;

public class Arthmatic {

	public static void main(String[] args) {
		
		int x=12,y=10,z;
		z=x|y;
		
		z=x&y;
	//	System.out.println(z);  
		
		int a=-0b1000;
		int b;
		
		b=a>>>2;
 System.out.println(String.format("%s",Integer.toBinaryString(b)));
 System.out.println(String.format("%s",Integer.toBinaryString(a )));
	}

}
