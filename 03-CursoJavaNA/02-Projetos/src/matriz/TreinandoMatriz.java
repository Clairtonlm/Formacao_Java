package matriz;

import java.util.Scanner;

public class TreinandoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o tamanho da Matriz?");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat [i][j] = sc.nextInt();
            }
        }
        System.out.println("Números na diagonal da matriz");
        for (int i = 0; i < n; i++){
            System.out.println(mat[i][i] + " ");
        }













        sc.close();
    }
}
