package escolanova;

import java.util.Objects;

public class Materias {
	
	private double nota1;
	private String materia;
	
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(materia, nota1);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materias other = (Materias) obj;
		return Objects.equals(materia, other.materia)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1);
	}
	
	@Override
	public String toString() {
		return "Materias [nota1=" + nota1 + ", materia=" + materia + "]";
	}

	

}
