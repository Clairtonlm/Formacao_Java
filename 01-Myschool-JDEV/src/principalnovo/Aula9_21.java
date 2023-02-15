package principalnovo;

import javax.swing.JOptionPane;
import escolanova.Estudante;
import escolanova.Materias;

public class Aula9_21 {

	public static void main(String[] args) {

		// Para receber as entradas
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno");
		String idade = JOptionPane.showInputDialog("Qual a idade do Aluno(a)");

		// 1-Instancia o objeto
		Estudante estudante1 = new Estudante();
		// 2-seta os atributos
		estudante1.setNome(nome);
		estudante1.setIdade(Integer.valueOf(idade));

		// Recebendo materia e nota de forma dinanmica
		for (int posicao = 1; posicao <= 4; posicao++) {
			String nomeMateria = JOptionPane.showInputDialog(" Nome da Materia " + posicao + "?");
			String notaMateria = JOptionPane.showInputDialog(" Nota da Materia " + posicao + "?");

			Materias materia = new Materias();
			materia.setMateria(nomeMateria);
			materia.setNota1(Double.valueOf(notaMateria));

			// Para Adcionar a lista
			estudante1.getMaterias().add(materia);
		}

		// Remover disciplina da Grade
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma Materia");
		if (escolha == 0) {
			String materiaRemover = JOptionPane.showInputDialog("Qual materia a ser removida 1, 2, 3, 4 ? ");
			estudante1.getMaterias().remove(Integer.valueOf(materiaRemover).intValue()-1);
		}

		System.out.println(estudante1);
		System.out.println("Media do aluno = " + estudante1.getMediaNota());
		System.out.println("Resultado = " + estudante1.getAlunoAprovado());

	}

}
