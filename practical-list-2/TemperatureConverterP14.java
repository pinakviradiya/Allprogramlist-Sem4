public class TemperatureConverterP14 {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        TemperatureConverterP14 converter = new TemperatureConverterP14();

        double fahrenheit = 88.6;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(+ fahrenheit + " Fahrenheit is equal to " + celsius + "Celsius");

        celsius = 31.44;
        fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(+ celsius + " Celsius is equal to " + fahrenheit + "Fahrenheit");
    }
}
