package principalnovo;

import javax.swing.JOptionPane;
import escolanova.Estudante;
import escolanova.Materias;

public class Executar {

	public static void main(String[] args) {
		
		//Para receber as entradas
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno");
		String idade = JOptionPane.showInputDialog("Qual a idade do Aluno(a)");
		
		//Instancia o objeto
		Estudante estudante1 = new Estudante();
		
		//2-seta os atributos
		estudante1.setNome(nome);
		estudante1.setIdade(Integer.valueOf(idade));
		
		//3-instancia materia para criar a lista.
		// A cada nova materia faz esse procedimento de instaciar a materia para o estudante1
		
		Materias materia1 = new Materias();
		
		materia1.setMateria("Java");
		materia1.setNota1(90);
		
		//chamos a materia addcionada
		estudante1.getMaterias().add(materia1);
		/*------------------------------------------------------*/
		//4-instancia novamente a segunda materias e seta
		
		Materias materia2 = new Materias();
		
		materia2.setMateria("JavaScript");
		materia2.setNota1(90);
		
		//chamos a materia addcionada
		estudante1.getMaterias().add(materia2);
		
		//Observação:Pode ser feito os gets Todos Juntos
		
		/*estudante1.getMaterias().add(materia1);
		 *estudante1.getMaterias().add(materia2);
		 * */
		
		
		
		
		
	}
	
}
