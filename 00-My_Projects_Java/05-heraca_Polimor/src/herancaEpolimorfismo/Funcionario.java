package herancaEpolimorfismo;

public class Funcionario extends Pessoa{
     String matricula;
     String setor;

     public Funcionario(String nome,String documento, int idade, String matricula, String setor) {
          super(nome, idade, documento);
          this.matricula = matricula;
          this.setor = setor;
     }
     public void imprimirDados(){
          super.imprimirDados();
          System.out.println("Matricula " + this.matricula);
          System.out.println("Setor de Trabalhho: " + this.setor);
     }
}
