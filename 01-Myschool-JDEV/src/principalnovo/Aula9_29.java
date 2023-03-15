package principalnovo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import EscolaVelha.Aluno;
import escolanova.AlunoEn;
import escolanova.Materias;

public class Aula9_29 {

	private static int mat;

	public static void main(String[] args) {
		
		List<AlunoEn> alunos = new  ArrayList<AlunoEn>();
		//Aqui pedindindo a quantidade de aluno na lista
		for(int qtd = 0; qtd <= 2; qtd++) {
			
			// Para receber as entradas
			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno" +qtd+ "?");
			//String idade = JOptionPane.showInputDialog("Qual a idade do Aluno(a)");

			// 1-Instancia o objeto
			AlunoEn aluno1 = new AlunoEn();
			// 2-seta os atributos
			aluno1.setNome(nome);
			//estudante1.setIdade(Integer.valueOf(idade));

			// Recebendo materia e nota de forma dinanmica recendo disciplina 1
			for (int posicao = 1; posicao <= 1; posicao++) {
				String nomeMateria = JOptionPane.showInputDialog(" Nome da Materia " + posicao + "?");
				String notaMateria = JOptionPane.showInputDialog(" Nota da Materia " + posicao + "?");

				Materias materia = new Materias();
				materia.setMateria(nomeMateria);
				materia.setNota1(Double.valueOf(notaMateria));

				// Para Adcionar a lista
				aluno1.getMaterias().add(materia);
			}

			// Remover disciplina da Grade
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma Materia");
			
			if (escolha == 0) {//yes--quer remover?SIM é zero.
				int continuarRemover = 0;
				int posicao = 1;
						
				while(continuarRemover == 0){
					String materiaRemover = JOptionPane.showInputDialog("Qual materia a ser removida 1, 2, 3, 4 ? ");
					aluno1.getMaterias().remove(Integer.valueOf(materiaRemover).intValue() - posicao);//-1 para acessar o local correto da lista
					posicao ++;
					continuarRemover = JOptionPane.showInternalConfirmDialog(null, "Continuar a remover?");
				}
				
				
			
		}
			
			alunos.add(aluno1);	
		
		}
		
		//percorrendo lista pelas posições para poder subistituir
		for(int pos = 0; pos < alunos.size(); pos++) {
			AlunoEn aluno = alunos.get(pos);
			
			System.out.println(" Aluno = " + aluno.getNome());
			System.out.println(" Média do aluno = " + aluno.getMediaNota());
			System.out.println(" Resultado = " + aluno.getAlunoAprovado());
			
			for (int mat = 0; mat < aluno.getMaterias().size();mat++);
			
			Materias disc = aluno.getMaterias().get(mat);
			
			System.out.println("Média = " + disc.getMateria() + " Nota = " + disc.getNota1());
		}
			
		

	}//fim da main

}//fim da classe
