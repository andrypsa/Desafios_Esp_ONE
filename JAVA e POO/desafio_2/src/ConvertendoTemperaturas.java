public class ConvertendoTemperaturas {
    public static void main(String[] args) throws Exception {

        double temperaturaCelsius = 36.8;
        // Conversão para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Exibição com casas decimais
        System.out.println(String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit));

        // Conversão para inteiro (sem casas decimais)
        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;

        System.out.println("Temperatura em Fahrenheit (sem casas decimais) é: " + temperaturaFahrenheitInteira);
    }
}