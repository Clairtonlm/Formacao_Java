package modulo.estruturarepetitivas;
import java.util.Scanner;

public class PostoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int codigo;
        int alcool = 0, gasolina = 0, diesel = 0;
        
        System.out.println("Informe o tipo de combustível abastecido:");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");
        
        while (true) {
            codigo = scanner.nextInt();
            
            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else if (codigo == 4) {
                break; // Encerra o programa
            } else {
                System.out.println("Código inválido. Informe novamente:");
                continue; // Pula para a próxima iteração do loop
            }
            
            System.out.println("Informe o próximo código de combustível (ou 4 para encerrar):");
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Quantidade de clientes que abasteceram com Álcool: " + alcool);
        System.out.println("Quantidade de clientes que abasteceram com Gasolina: " + gasolina);
        System.out.println("Quantidade de clientes que abasteceram com Diesel: " + diesel);
        
        scanner.close();
    }
}

