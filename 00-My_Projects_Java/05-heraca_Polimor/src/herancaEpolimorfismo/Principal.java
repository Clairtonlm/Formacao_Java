package herancaEpolimorfismo;

public class Principal {

    public static void main(String[] args) {
        System.out.println("\nInformações da classe Pai");
        Pessoa p = new Pessoa("Notrialc", 23, "03302203-23");
        p.imprimirDados();

        System.out.println("\nInformações do Paciente");
        Pessoa paciente = new Paciente("Jose da Silva","002003004",23,"0002",
                "Camed");
        paciente.imprimirDados();

        System.out.println("\nInformações do Funcionario");
        Pessoa funcionario = new Funcionario("Riron", "004008009-09",
                42,"003","Almoxarifado");
        funcionario.imprimirDados();

        System.out.println("\nInformações do Enfermeiro");
        Pessoa enfermeiro = new Enfermeiro("Yanrun", "0068976-9", 45, "08:00 as 17:00 horas", "UTI", "009008");
        enfermeiro.imprimirDados();

    }
}
