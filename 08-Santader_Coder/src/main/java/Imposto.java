
import java.util.Scanner;

class Imposto{

    public static void main(String a[]){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o 1o salário");
        String salario1 = scanner.nextLine();

        System.out.println("Informe o 2o salário");
        String salario2 = scanner.nextLine();

        System.out.println("Informe o 3o salário");
        String salario3 = scanner.nextLine();

        System.out.println("Informe o 4o salário");
        String salario4 = scanner.nextLine();

        System.out.println("Informe o 5o salário");
        String salario5 = scanner.nextLine();

        double[] salarios = {
            Double.parseDouble(salario1), 
            Double.parseDouble(salario2), 
            Double.parseDouble(salario3), 
            Double.parseDouble(salario4), 
            Double.parseDouble(salario4)
        };

        for(double salario : salarios){
            double descontINSS = 0;

            if(salario <= 1212)
                descontINSS = 7.5 / 100d;
            else if(salario > 1212 && salario <= 2427.35)
                descontINSS = 9 / 100d;
            else if(salario > 2427.35 && salario <= 3641.03)
                descontINSS = 12 / 100d;
            else if(salario > 3641.03 && salario <= 7087.22)
                descontINSS = 14 / 100d;
            else
                descontINSS = 16.5 / 100d;

            double descontImpostoDeRenda = 0;

            System.out.printf("Salário bruto: R$ %.2f \n", salario);
            System.out.printf("Quanto pagou ao INSS: R$ %.2f \n", salario * descontINSS);
            System.out.println();
        }
        scanner.close();
    }

    

}