
public class Aluno extends Pessoa{
 private int ra;
 private double nota;
 
 //construor
 public Aluno(String nome, String cpf, int ra, double nota) {
	 super(nome, cpf);
	 this.ra = ra;
	 this.nota= nota;
 }
 @Override
 public void imprimir(){
	 super.imprimir();
	 System.out.println("Registro do Aluno " + this.ra);
	 System.out.println("Nota do Aluno " + this.nota);
 }
public int getRa() {
	return ra;
}
public void setRa(int ra) {
	this.ra = ra;
}
public double getNota() {
	return nota;
}
public void setNota(double nota) {
	this.nota = nota;
}
 
 
}
