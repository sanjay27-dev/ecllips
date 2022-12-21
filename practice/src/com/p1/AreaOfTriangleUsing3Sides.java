package com.p1;

import java.util.Scanner;
import java.lang.*;

public class AreaOfTriangleUsing3Sides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int a,b,c;
		float s;
		double area;
		
		System.out.println("enter the 3 sides of Triangle:");
		
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		s=(a+b+c)/2f;
		
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("area of triangle:"+area);
	    
	}

}
