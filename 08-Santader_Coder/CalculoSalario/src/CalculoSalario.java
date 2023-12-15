
public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double inss = 0.0; // Variável para armazenar o total pago de INSS
        double ir = 0.0; // Variável para armazenar o total pago de Imposto de Renda
        double totalSalarioLiquido = 0.0; // Variável para armazenar o total de salários líquidos
        
        // Loop para receber os salários brutos de 5 funcionários
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o salário bruto do funcionário " + i + ": ");
            double salarioBruto = scanner.nextDouble();
            
            // Cálculo do desconto do INSS de acordo com a tabela de alíquotas
            if (salarioBruto <= 1100) {
                inss = salarioBruto * 0.075;
            } else if (salarioBruto <= 2203.48) {
                inss = salarioBruto * 0.09;
            } else if (salarioBruto <= 3305.22) {
                inss = salarioBruto * 0.12;
            } else if (salarioBruto <= 6433.57) {
                inss = salarioBruto * 0.14;
            } else {
                inss = 751.99; // Teto máximo do INSS para salários maiores que 6433.57
            }
            
            // Cálculo do desconto do Imposto de Renda considerando um valor fixo para o exemplo
            ir = salarioBruto * 0.1; // 10% de desconto de Imposto de Renda
            
            // Cálculo do salário líquido após descontos
            double salarioLiquido = salarioBruto - inss - ir;
            
            // Exibição dos resultados para cada funcionário
            System.out.println("Salário bruto do funcionário " + i + ": " + salarioBruto);
            System.out.println("Total pago de INSS: " + inss);
            System.out.println("Total pago de Imposto de Renda: " + ir);
            System.out.println("Salário líquido do funcionário " + i + ": " + salarioLiquido);
            System.out.println();
            
            // Somando ao total de salários líquidos
            totalSalarioLiquido += salarioLiquido;
        }
        
        // Exibição do total de salários líquidos de todos os funcionários
        System.out.println("Total de salários líquidos dos 5 funcionários: " + totalSalarioLiquido);
        
        scanner.close();
    }
}