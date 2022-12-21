package com.p1;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int length,breadth,height;
		int totalarea,volume;
		System.out.println("Enter the parameters");
		
		Scanner sc = new Scanner(System.in);
		
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		
		volume=length+breadth+height;
		
		totalarea = 2*(length*height+breadth*height+length*breadth);
		
		 int premeter = 2*length + 2* breadth;

		 System.out.println("area of cuboid is:"+volume);
		 System.out.println("perrimeter of cuboid is: "+premeter);
		 System.out.println("tottal area :"+totalarea);
	}

}
