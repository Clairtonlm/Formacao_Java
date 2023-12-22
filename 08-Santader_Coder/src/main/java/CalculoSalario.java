
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 2; i++) {
            System.out.print("Digite o salário bruto do funcionário " + i + ": ");
            double salarioBruto = scanner.nextDouble();
            
            double inss = calcularINSS(salarioBruto);
            double ir = calcularImpostoRenda(salarioBruto);
            
            double salarioLiquido = salarioBruto - inss - ir;
            
            System.out.println("Salário bruto do funcionário " + i + ": R$" + salarioBruto);
            System.out.printf("Total pago de INSS: R$%.2f%n", inss);
            System.out.println("Total pago de Imposto de Renda: R$" + ir);
            System.out.println("Salário líquido do funcionário " + i + ": R$" + salarioLiquido);
            System.out.println();
        }
        
        scanner.close();
    }
    //Metodo estaticos para calculos
    public static double calcularINSS(double salario) {
        if (salario <= 1212.00) {
            return salario * 0.075;
        } else if (salario > 1212.00 && salario <= 2427.35) {
            return salario * 0.09;
        } else if (salario > 2427.35 && salario <= 3641.03) {
            return salario * 0.12;
        } else if (salario > 3641.03 && salario <= 7087.22) {
            return salario * 0.14;
        } else {
            return salario * 0.165;
        }
    }
    
    public static double calcularImpostoRenda(double salario) {
        if (salario <= 1903.98) {
            return 0;
        } else if (salario > 1903.98 && salario <= 2826.65) {
            return (salario * 0.075) - 142.80;
        } else if (salario > 2826.65 && salario <= 3751.05) {
            return (salario * 0.15) - 354.80;
        } else if (salario > 3751.05 && salario <= 4664.68) {
            return (salario * 0.225) - 636.13;
        } else {
            return (salario * 0.275) - 869.36;
        }
        
    }
    
}

