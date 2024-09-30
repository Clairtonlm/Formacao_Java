import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeradorSenha256Bits {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        String allChars = UPPER + LOWER + DIGITS + SPECIAL;
        StringBuilder password = new StringBuilder(32);

        // Garantindo pelo menos um caractere de cada tipo
        password.append(UPPER.charAt(secureRandom.nextInt(UPPER.length())));
        password.append(LOWER.charAt(secureRandom.nextInt(LOWER.length())));
        password.append(DIGITS.charAt(secureRandom.nextInt(DIGITS.length())));
        password.append(SPECIAL.charAt(secureRandom.nextInt(SPECIAL.length())));

        // Preenchendo o restante da senha com caracteres aleatórios
        for (int i = 4; i < 8; i++) {
            password.append(allChars.charAt(secureRandom.nextInt(allChars.length())));
        }

        // Embaralhando os caracteres para garantir aleatoriedade
        List<Character> passwordChars = new ArrayList<>();
        for (char c : password.toString().toCharArray()) {
            passwordChars.add(c);
        }
        Collections.shuffle(passwordChars);

        StringBuilder finalPassword = new StringBuilder();
        for (char c : passwordChars) {
            finalPassword.append(c);
        }

        System.out.println("Senha de 256 bits: " + finalPassword.toString());
    }
}
