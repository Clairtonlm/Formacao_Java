
public class Professor extends Pessoa {
	private	double salario;
	private String matricula;
	private String setor;
	
	public Professor(String nome, String cpf, double salario, String matricula, String setor ) {
		super(nome, cpf);
		this.salario =  salario;
		this.matricula = matricula;
		this.setor = setor;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Salário " + this.salario);
		System.out.println("Matricula do Professor " + this.matricula);
		System.out.println("Setor de Trabalaho " + this.setor);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
}
