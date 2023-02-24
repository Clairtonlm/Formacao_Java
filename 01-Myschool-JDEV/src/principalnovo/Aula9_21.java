package principalnovo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import escolanova.Aluno;
import escolanova.Materias;

public class Aula9_21 {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new  ArrayList<Aluno>();
		
		for(int qtd = 0; qtd <= 1;qtd++) {
			
			// Para receber as entradas
			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno" +qtd+ "?");
			//String idade = JOptionPane.showInputDialog("Qual a idade do Aluno(a)");

			// 1-Instancia o objeto
			Aluno aluno1 = new Aluno();
			// 2-seta os atributos
			aluno1.setNome(nome);
			//estudante1.setIdade(Integer.valueOf(idade));

			// Recebendo materia e nota de forma dinanmica
			for (int posicao = 1; posicao <= 3; posicao++) {
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
		
		for (Aluno aluno : alunos) {
			
			
			//procurando um nome de Aluno e eignorando miuscula e 
			if(aluno.getNome().equalsIgnoreCase("Clairton")) {
				alunos.remove(aluno);
				break;//quando encontar o clairton para o codigo.
				
			}else {
				System.out.println(alunos);//descrição do Objeto
				System.out.println("Media do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado());
				System.out.println("----------------------------");
			}
		}
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas materias são");
			System.out.println("----------------------------");
			
			for(Materias materia :aluno.getMaterias()) {
				System.out.println(materia.getMateria());
				
				
			}
		}
			
		

	}

}
