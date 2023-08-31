package condicao;

import java.util.Scanner;

public class SwiteCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero");
		 int diaSemana = scan.nextInt();
//		 if(diaSemana ==1) {
//			 System.out.println("Domingo");
//		 }else if(diaSemana == 2 ) {
//			 System.out.println("Segunda");
//		 }else if(diaSemana == 3) {
//			 System.out.println("Terça");
//		 }else if(diaSemana == 3) {
//			 System.out.println("qurta");
//		 }else if(diaSemana == 3) {
//			 System.out.println("quita");
//		 }else if(diaSemana == 3) {
//			 System.out.println("sexta");
//		 }else if(diaSemana == 3) {
//			 System.out.println("sabado");
//		 }else {
//			 System.out.println(" nao é dia da semana válido");
//		 }
		 //---------------------------------------------------------
		switch(diaSemana) {
		case 1: System.out.println("Domingo");break;
		case 2: System.out.println("segunda");break;
		case 3: System.out.println("terca");break;
		case 4: System.out.println("qurta");break;
		case 5: System.out.println("quinta");break;
		case 6: System.out.println("sexta");break;
		case 7: System.out.println("sabado");break;
		default:System.out.println(" nao é dia da semana válido");
		
		
		}
		 
		 
		 scan.close();
	}

}
