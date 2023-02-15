package principalnovo;

import javax.swing.JOptionPane;
import escolanova.Estudante;
import escolanova.Materias;

public class Executar {

	public static void main(String[] args) {
		
		//Para receber as entradas
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno");
		String idade = JOptionPane.showInputDialog("Qual a idade do Aluno(a)");
		
		//1-Instancia o objeto
		Estudante estudante1 = new Estudante();
		
		//2-seta os atributos
		estudante1.setNome(nome);
		estudante1.setIdade(Integer.valueOf(idade));
		
		//3-instancia materia para criar a lista.
		// A cada nova materia faz esse procedimento de instaciar a materia para o estudante1
		
		Materias materia1 = new Materias();
		
		materia1.setMateria("Java");
		materia1.setNota1(90);
		
		//4-chamos a materia para addcionar
		estudante1.getMaterias().add(materia1);
		/*------------------------------------------------------*/
		//instancia novamente a segunda materias e seta
		
		Materias materia2 = new Materias();
		
		materia2.setMateria("JavaScript");
		materia2.setNota1(90);
		
		estudante1.getMaterias().add(materia2);
		/*-------------------------------------------------------*/
		
		Materias materia3 = new Materias();
		
		materia3.setMateria("PHP");
		materia3.setNota1(80);
		
		estudante1.getMaterias().add(materia3);
		
       /*-------------------------------------------------------*/
		
		Materias materia4 = new Materias();
		
		materia4.setMateria("Banco de Dados");
		materia4.setNota1(80);
		
		estudante1.getMaterias().add(materia4);
			
		
		//Observação:Pode ser feito os gets Todos Juntos
		
		/*estudante1.getMaterias().add(materia1);
		 *estudante1.getMaterias().add(materia2);
		 *estudante1.getMaterias().add(materia3);
		 *estudante1.getMaterias().add(materia4);
		 * */
		System.out.println(estudante1);
		System.out.println("Media do aluno = " + estudante1.getMediaNota());
		System.out.println("Resultado = " + estudante1.getAlunoAprovado());
		
		
		
		
	}
	
}
