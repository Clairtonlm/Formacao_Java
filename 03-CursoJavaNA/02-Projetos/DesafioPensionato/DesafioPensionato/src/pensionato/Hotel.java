package pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent r = new Rent("maria", "maria@gmail.com");
        System.out.println(r);












        sc.close();
    }
}