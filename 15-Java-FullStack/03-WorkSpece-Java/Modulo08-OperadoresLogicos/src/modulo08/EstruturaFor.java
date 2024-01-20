package modulo08;
//FOR - usada para percorrer uma determinada vezes
public class EstruturaFor {
    public static void main(String[] args) {

        for(int num = 0; num <= 9; num++){
            if(num == 5){
                System.out.println("Encontrei número 5");
                break;
            }
            System.out.println("O número é :" + (num + 1));
        }
        System.out.println("Vamos fazer descrescente");
        System.out.println();
        for(int num = 10; num  >= 0; num--){
            if(num == 7){
                System.out.println("Encontrei número 7");
                continue;
            }
            System.out.println("O número é :" + (num ));
        }
    }
}
