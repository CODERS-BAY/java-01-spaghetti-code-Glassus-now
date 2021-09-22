package geo;

public class Geometrics {
    private static double x = 10.0;
    private static double y = 5.0;
    private static double z = 3.0;
    private static double x3 = 45;
    private static double z3 = 69;

    public static void main(String[] args) {
        // area ... Fläche
        System.out.println("Square area");
        System.out.println("x * x = " + multiply(x));

        // perimeter ... Umfang
        System.out.println("Square perimeter");
        System.out.println("4 * x = " + multiplyFour(x));

        System.out.println("Rectangle area");
        System.out.println("x * y = " + multiplyEach(x, y));

        System.out.println("Rectangle perimeter");
        System.out.println("x + y = " + addition(x, y));

        System.out.println("We can also calculate some volumes");
        /*
         * z is our height y is our radius
         */
        System.out.println("Zone of a sphere");
        System.out.println(zoneOfASphere(x, y, z));

        System.out.println("Sphere with cylinder");
        System.out.println(calcCylinder(z));

        System.out.println("Ungula");
        System.out.println(calcUngula(x, y));
    }

    public static double multiply(double x) {
        return x * x;
    }

    public static double multiplyFour(double x) {
        return 4 * x;
    }

    public static double multiplyEach(double x, double y) {
        return x * y;
    }

    public static double addition(double x, double y) {
        return x + y;
    }

    public static double zoneOfASphere(double x, double y, double z) {
        return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }

    public static double calcCylinder(double z) {
        return Math.PI * Math.pow(z, 3) / 6;
    }

    public static double calcUngula(double x, double y) {
        return ((double) (2 * x3 * z3) / 3);
    }
}
