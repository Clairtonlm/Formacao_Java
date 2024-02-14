package novaescola;

import java.util.Objects;

public class Disciplina {

    private String disciplina;
    private double nota;


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;
        return Double.compare(getNota(), that.getNota()) == 0 && Objects.equals(getDisciplina(), that.getDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDisciplina(), getNota());
    }

    @Override
    public String toString() {
        return "disciplina = " + disciplina + "\n" + " nota= " + nota;

    }
}
