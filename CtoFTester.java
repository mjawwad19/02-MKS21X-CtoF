public class CtoFTester {
  public static double celsiusToFahrenheit(double c) {
    return (1.8 * c) + 32;
  }
  public static double fahrenheitToCelsius(double f) {
    return (f - 32) * 5.0/9.0;
  }
  public static void main(String[] args) {
    System.out.println(20.0 + " degrees Celsius is " +
                celsiusToFahrenheit(20.0) + " degrees Fahrenheit (68)");
    System.out.println(0.0 + " degrees Celsius is " +
                celsiusToFahrenheit(0.0) + " degrees Fahrenheit (32)");
    System.out.println(37.7777 + " degrees Celsius is " +
                celsiusToFahrenheit(37.7777) + " degrees Fahrenheit (100)");
    System.out.println(32.0 + " degrees Fahrenheit is " +
                         fahrenheitToCelsius(32.0) + " degrees Celsius(0)");
    System.out.println(50.0 + " degrees Fahrenheit is " +
                       fahrenheitToCelsius(50.0) + " degrees Celsius (10)");
    System.out.println(35.6 + " degrees Fahrenheit is " +
                        fahrenheitToCelsius(35.6) + " degrees Celsius (2)");
  }
}
