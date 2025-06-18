package escola_dev;

import java.util.Objects;

public class Secretario extends Pessoa implements PermitirAcesso {
	private String registo;
	private String nivelCargo;
	private String experiencia;
	
	
	
	
	
	//Metodo Getters e Setters
	public String getRegisto() {
		return registo;
	}
	public void setRegisto(String registo) {
		this.registo = registo;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public int hashCode() {
		return Objects.hash(experiencia, nivelCargo, registo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Secretario other = (Secretario) obj;
		return experiencia == other.experiencia && Objects.equals(nivelCargo, other.nivelCargo)
				&& Objects.equals(registo, other.registo);
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("Registro : " + this.registo);
		System.out.println("Nivel Cargo: " + this.nivelCargo);
		System.out.println("Expetiencia:" + this.experiencia);
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//Metodo da interface para o secretario implementar
	/*@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("admin");
	}*/
	
	@Override
	public boolean autenticar(String login, String senha) {
		
		return login.equals("admin") && senha.equals("admin");
	}
	
	@Override
	public boolean autenticar() {
		return false;
	}
	
	
}
