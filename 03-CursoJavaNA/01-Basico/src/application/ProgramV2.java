package application;

import java.util.Scanner;

import entities.Triangle;

public class ProgramV2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	       
		 Triangle x, y;
		 x = new Triangle();
		 y = new Triangle();
		 
	        System.out.println("Enter the measures of triangle X");
	        x.a = sc.nextDouble();
	        x.b = sc.nextDouble();
	        x.c = sc.nextDouble();
	        System.out.println("Enter the measures of triangle Y");
	        y.a = sc.nextDouble();
	        y.b = sc.nextDouble();
	        y.c = sc.nextDouble();

	      
	        double areaX = x.area();

	       
	        double areaY = y.area();

	        System.out.println("Area of triangle X: " + areaX);
	        System.out.println("Area of triangle Y: " + areaY);
	        
	        if(areaX > areaY) {
	        	 System.out.println("A área do triângulo X é maior.");
	        }else if( areaY > areaX) {
	        	 System.out.println("A área do triângulo Y é maior.");
	        }else {
	        	 System.out.println("A área dos triângulos são iguais");
	        }
	        
		
		
		sc.close();
	}//main

}//clss
