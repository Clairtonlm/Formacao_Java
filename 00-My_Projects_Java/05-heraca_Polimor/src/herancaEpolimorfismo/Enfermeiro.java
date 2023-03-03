package herancaEpolimorfismo;

public class Enfermeiro extends Pessoa {
    String horaDeTrabalho;
    String setor;
    String numeroCadastro;

    public  Enfermeiro(String nome, String documento,int idade, String horaDeTrabalho, String setor, String numeroCdastro){
        super(nome,idade, documento);
        this.horaDeTrabalho = horaDeTrabalho;
        this.setor = setor;
        this.numeroCadastro = numeroCdastro;
    }
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Horario de Trabalho: " + this.horaDeTrabalho);
        System.out.println("Setor: " + this.setor);
        System.out.println("Número de Cadastro: " + this.numeroCadastro);
    }
}