package herancaEpolimorfismo;

public class Paciente extends  Pessoa{
    String matricula;
    String planoDeSaude;

    public Paciente(String nome,String documento, int idade, String matricula, String planoDeSaude){
        super(nome,idade, documento);
        this.matricula = matricula;
        this.planoDeSaude = planoDeSaude;
    }
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Matricula " + this.matricula);
        System.out.println("Plano de saúde: " + this.planoDeSaude);
        }
    }


