import java.util.Scanner;

public class EnumNegativo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = sc.nextInt();

       if(n< 0){
            System.out.println("O eto é número digitado foi \" + n + \" esse numNEGATIVO");
        }else {
            System.out.println("O número digitado foi " + n +  " esse numeto é POSITIVO");
        }
    }
}
