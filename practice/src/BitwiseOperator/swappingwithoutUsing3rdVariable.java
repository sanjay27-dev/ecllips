package BitwiseOperator;

public class swappingwithoutUsing3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // int a=9,b=12;
		
		byte a=9,b=12;
		
		byte c;
		
		c=(byte)(a<<4); 
		c= (byte)(c|b);
		
		
		System.out.println( (c&0b11110000)>>4);
      
      /*  a=a^b;//5
        b=a^b;//9
        a=a^b;//12
        System.out.println("a :"+a+" b: "+b);
       */
      
      
	}

}
