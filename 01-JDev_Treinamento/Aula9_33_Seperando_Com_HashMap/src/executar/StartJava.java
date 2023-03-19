package executar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class StartJava {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*HashMap é uma lista que dentro dela tem uma chave que identifica uma
		 * de valores
		 * */
	HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		//Aqui pedindindo a quantidade de aluno na lista
		for(int qtd = 0; qtd <= 2; qtd++) {
			
			// Para receber as entradas
			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno" +qtd+ "?");
			//String idade = JOptionPane.showInputDialog("Qual a idade do Aluno(a)");

			// 1-Instancia o objeto
			Aluno aluno1 = new Aluno();
			// 2-seta os atributos
			aluno1.setNome(nome);
			//estudante1.setIdade(Integer.valueOf(idade));

			// Recebendo materia e nota de forma dinanmica recendo disciplina 1
			for (int posicao = 1; posicao <= 1; posicao++) {
				String nomeMateria = JOptionPane.showInputDialog(" Nome da Materia " + posicao + "?");
				String notaMateria = JOptionPane.showInputDialog(" Nota da Materia " + posicao + "?");

				Disciplina materia = new Disciplina();
				materia.setMateria(nomeMateria);
				materia.setNota1(Double.valueOf(notaMateria));

				// Para Adcionar a lista
				aluno1.getMaterias().add(materia);
			}

			// Remover disciplina da Grade
//			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma Materia");
//			
//			if (escolha == 0) {//yes--quer remover?SIM é zero.
//				int continuarRemover = 0;
//				int posicao = 1;
//						
//				while(continuarRemover == 0){
//					String materiaRemover = JOptionPane.showInputDialog("Qual materia a ser removida 1, 2, 3, 4 ? ");
//					aluno1.getMaterias().remove(Integer.valueOf(materiaRemover).intValue() - posicao);//-1 para acessar o local correto da lista
//					posicao ++;
//					continuarRemover = JOptionPane.showInternalConfirmDialog(null, "Continuar a remover?");
//				}
//				
//				
//			
//		}
			
			alunos.add(aluno1);	
		
		}
		//inicializando a lista
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		
		// percorrendo a lista e separando os alunos
		for(Aluno aluno : alunos){
			if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)){
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}else if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}
		}//fim do for
		System.out.println("------------Lista dos aporvados---------");
		for(Aluno aluno : maps.get(StatusAluno.APROVADO)){
			System.out.println("Nome : " + aluno.getNome());
			System.out.println(" Resultado : "+ aluno.getAlunoAprovado());
			System.out.println("Média : "+ aluno.getMediaNota());
		}
		System.out.println("------------Lista dos Recuoeracao---------");
		for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)){
			System.out.println("Nome : " + aluno.getNome());
			System.out.println(" Resultado : "+ aluno.getAlunoAprovado());
			System.out.println("Média : "+ aluno.getMediaNota());
			}
		System.out.println("------------Lista dos Reprovados---------");
		for(Aluno aluno : maps.get(StatusAluno.REPROVADO)){
			System.out.println("Nome : " + aluno.getNome());
			System.out.println(" Resultado : "+ aluno.getAlunoAprovado());
			System.out.println("Média : "+ aluno.getMediaNota());

		}
	}//fim

}//fim
