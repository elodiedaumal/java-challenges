public class MethodCalleng1 {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + toCentimeter(5,8) + " cm");

        System.out.println("68in = " + toCentimeter(68) + " cm");

    }

    private static double toCentimeter(int feet, int inches) {

        return feet*30.48 + inches*2.54;
    }

    private static double toCentimeter(int feet) {

        return feet*30.48;
    }
}
