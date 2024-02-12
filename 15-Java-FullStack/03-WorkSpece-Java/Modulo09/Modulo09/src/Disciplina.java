package Modulo09.Modulo09.src;

import java.util.Objects;

public class Disciplina {

    private String disciplina1;
    private String disciplina2;
    private String disciplina3;
    private String disciplina4;

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public String getDisciplina4() {
        return disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        this.disciplina4 = disciplina4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;
        return Double.compare(getNota1(), that.getNota1()) == 0 && Double.compare(getNota2(), that.getNota2()) == 0 && Double.compare(getNota3(), that.getNota3()) == 0 && Double.compare(getNota4(), that.getNota4()) == 0 && Objects.equals(getDisciplina1(), that.getDisciplina1()) && Objects.equals(getDisciplina2(), that.getDisciplina2()) && Objects.equals(getDisciplina3(), that.getDisciplina3()) && Objects.equals(getDisciplina4(), that.getDisciplina4());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNota1(), getDisciplina1(), getNota2(), getDisciplina2(), getNota3(), getDisciplina3(), getNota4(), getDisciplina4());
    }

    @Override
    public String toString() {
        return "------Disciplina do Aluno----- " + "\n" +
                "Disciplina 01: " + disciplina1 +"\n" +
                "Media da matéria " + disciplina1 + " => " + nota1 + "\n" +
                "Disciplina 02: " + disciplina2 +"\n" +
                "Média da materia " + disciplina2 + " => " +nota2 + "\n" +
                "Disciplina 03: " + disciplina3 +"\n" +
                "Média da máteria " + disciplina3 + " => " + nota3 + "\n" +
                "Disciplina 04: " + disciplina4 +"\n" +
                "Media da materia " + disciplina4 + " => " + nota4 + "\n";
    }
}
