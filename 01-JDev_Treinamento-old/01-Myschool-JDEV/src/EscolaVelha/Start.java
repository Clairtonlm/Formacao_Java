package EscolaVelha;

import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) {
		/*Instacia ou criação de objeto*/
		/* Referencia é a variavel do Objato no caso aluno1 é uma referncia do objeto*/
		
		//entrada de dados pelo teclado
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno");
		String idade = JOptionPane.showInputDialog("Qual a idade do Aluno(a)");
		/*String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento");
		String registroGeral = JOptionPane.showInputDialog("Qual o numero do RG");
		String numeroCpf = JOptionPane.showInputDialog("Qual o numero do CPF");
		String nomeMae = JOptionPane.showInputDialog("Qual o numero da Mãe");
		String nomePai = JOptionPane.showInputDialog("Qual o numero da Pai");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da Matrícula");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a série do Aluno(a)");*/
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1 ?");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2 ?");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3 ?");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4 ?");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		
		Aluno aluno1 = new Aluno();//Aqui o João
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		/*aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);*/
		
		//Notas do Aluno
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		/*System.out.println("O nome do(a) Aluno(a)  é: " + aluno1.getNome());
		System.out.println("O idade do(a) Aluno(a) é: " + aluno1.getIdade());
		System.out.println("O data de nascimento do(a) Aluno(a) é: " + aluno1.getIdade());
		System.out.println("O Rg do(a) Aluno(a) é: " + aluno1.getIdade());
		System.out.println("O CPF do(a) Aluno(a) é: " + aluno1.getIdade());
		System.out.println("O nome da Mãe do(a) Aluno(a) é: " + aluno1.getIdade());
		System.out.println("O nome do Pai do(a) Aluno(a) é: " + aluno1.getIdade());
		System.out.println("O data da matricula do(a) Aluno(a) é: " + aluno1.getIdade());
		System.out.println("O nome da escola do(a) Aluno(a) é: " + aluno1.getIdade());
		System.out.println("A série matriculado do(a) Aluno(a) é: " + aluno1.getIdade());
		System.out.println("A média é : " + aluno1.getMediaNota());
		System.err.println("Resultado = " + aluno1.getAlunoAprovado());
		System.out.println("Resultado2 = " + aluno1.getAlunoAprovado2());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado2() ? "Passei" : "Reprovado"));*/
		
		
		System.out.println(aluno1.toString());
		System.out.println("Média do Aluno(a) " + aluno1.getNome() + " é = "  + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		
	}
}
