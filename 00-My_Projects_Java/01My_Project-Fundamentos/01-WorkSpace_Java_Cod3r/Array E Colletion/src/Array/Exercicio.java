package Array;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 7.7;
		notasAlunoA[3] = 8.7;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for(int i = 0; i< notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA/notasAlunoA.length);
		/*
		//CASOS MENOS USADOS
		double [] notasAlunoB = {7, 8, 8 ,9};
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++);
		totalAlunoB += notasAlunoB[i];*/
		
	}
	
}
