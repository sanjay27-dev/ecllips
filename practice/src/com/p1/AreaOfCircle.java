package com.p1;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		float radius,area;
		float pi=3.142f;
		
		System.out.println("Enter the Radius");
		
		Scanner sc = new Scanner(System.in);
		
		radius=sc.nextFloat();
		
	    area= pi*radius * radius;
	    
	    System.out.println("area of circle ="+area);
	    

	}

}
