package condicao;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeiro numero");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com a segundo numero");
		double num2 = scan.nextDouble();
		
		System.out.println("Entre com a terceiro numero");
		double num3 = scan.nextDouble();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("num1 é maior " + num1);
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println("num2 é maior " + num2);
		}else if(num3 >= num1 && num3 >= num2) {
			System.out.println("num3 é maior " + num3);
		
		}
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("num1 é menor " + num1);
		}else if(num2 <= num1 && num2 <= num3) {
			System.out.println("num2 é menor " + num2);
		}else if(num3 <= num1 && num3 <= num2) {
			System.out.println("num3 é menor " + num3);
		
		}
	}

}
