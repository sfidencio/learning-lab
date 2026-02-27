public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25.9;
        int fahrenheit = (int) ((celsius * 1.8) + 32);
        System.out.printf("%.2f Celsius is %d Fahrenheit%n", celsius, fahrenheit);
    }
}