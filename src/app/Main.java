package app;

public class Main  {

    static double CONV_С_F = 0;

    public static void main(String[] args) {
            System.out.println("Converter °C to °F!!!");

            double C = 0;
            double celsius = convCeToFa(C);
            System.out.println("Result is " + celsius +  "°.");
        }

        private static double convCeToFa(double C) {
            return CONV_С_F = ((C * 9) / 5) + 32;
        }
}