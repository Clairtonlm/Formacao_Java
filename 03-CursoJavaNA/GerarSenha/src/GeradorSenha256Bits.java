import java.security.SecureRandom;

public class GeradorSenha256Bits {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] senha = new byte[8]; // 256 bits = 32 bytes
        secureRandom.nextBytes(senha);

        // Convertendo os bytes para hexadecimal
        StringBuilder sb = new StringBuilder();
        for (byte b : senha) {
            sb.append(String.format("%02x", b));
        }

        System.out.println("Senha de 256 bits: " + sb.toString());
    }
}
