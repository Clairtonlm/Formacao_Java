package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        double xA, xB, xC, yA, yB, yC;
	        System.out.println("Enter the measures of triangle X");
	        xA = sc.nextDouble();
	        xB = sc.nextDouble();
	        xC = sc.nextDouble();
	        System.out.println("Enter the measures of triangle Y");
	        yA = sc.nextDouble();
	        yB = sc.nextDouble();
	        yC = sc.nextDouble();

	        double pX = (xA + xB + xC) / 2.0;
	        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

	        double pY = (yA + yB + yC) / 2.0;
	        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

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
