import javax.swing.JOptionPane;

public class TrabalhandoArray {
    public static void main(String[] args) {

        // String [] paises = new String[3];

        int[] numeros = new int[10];

        /*
         * for (int index = 0; index <= 3; index++) {
         * paises [index] = JOptionPane.showInputDialog("informe um País");
         * }
         * for (String listaPaises : paises) {
         * 
         * System.out.println(listaPaises);
         * 
         * }
         */
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

        }
        for (Integer listaNumeros : numeros) {

            System.out.println(listaNumeros);
        }

        int novoValor = 11;
        numeros[8] = novoValor + 100;
        
        for (Integer listaNumeros : numeros) {

            System.out.println(listaNumeros);
        }
    }
}
