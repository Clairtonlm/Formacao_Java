public class ConversorTemperatura {

    public static double celsiusParaFahrenheit(double celsius) {
        // Fatores de conversão
        double fator1 = 9.0 / 5.0;
        double fator2 = 32.0;

        // Fórmula de conversão
        double fahrenheit = (celsius * fator1) + fator2;

        return fahrenheit;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função
        double temperaturaCelsius = 10.0;
        double temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);

        System.out.println(temperaturaCelsius + " graus Celsius é equivalente a " + temperaturaFahrenheit + " graus Fahrenheit.");
    }
}

