package pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println(" How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Digite seu Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Qual seu Email: ");
            String email = sc.next();
            System.out.print("Room: Temos quartos de 0 a 9. Qual vc quer? ");
            int roomNumber = sc.nextInt();

            Rent rent = new Rent(name, email);
            vect[roomNumber] = rent;
        }
        System.out.println();
        System.out.println("Busy rooms");
        for(int i = 0; i< 10; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }


        sc.close();
    }
}