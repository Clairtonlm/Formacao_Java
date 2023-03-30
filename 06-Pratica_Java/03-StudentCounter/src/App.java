import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

       int passes = 0;
       int failures = 0;
       int studentCount = 1;

        while (studentCount <=10) {
            System.out.println("Qual foi resultado 1= aprovado, 2= reprovado");
            int resultado = input.nextInt();

            if(resultado == 1){
                passes = passes + 1;
            }else{
                failures = failures + 1;
            
            }
        studentCount = studentCount + 1;
        }
        //fora do while
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if(passes >= 8){
        System.out.println("O curso é Bom");
        }else{
            System.out.println("Curso nao é bom");
        }
        //fechar Scanner
        input.close();

    }//fim do main

    
}//fim da class
