import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class WhatsAppLink {

    public static String criarLinkWhatsApp(String numero) {
        // Remove espaços, parênteses ou outros caracteres indesejados
        numero = numero.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");

        // Cria o link com o número fornecido
        String link = "https://wa.me/" + numero;

        return link;
    }

    public static void abrirLinkWhatsApp(String numero) {
        String link = criarLinkWhatsApp(numero);
        System.out.println("Abrindo o link do WhatsApp: " + link);

        // Abre o link no navegador padrão
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Navegador não suportado.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de telefone com código do país (Exemplo: 5511999999999): ");
        String numero = scanner.nextLine();

        abrirLinkWhatsApp(numero);

        scanner.close();
    }
}
