package TopshiriqJava;

public class MathFunctions {
    public static double π = 3.14;
    public static double e = 2.71;

    public static double doiraYuzi(double radius) {
        return π \* Math.pow(radius, 2);
    }

    public static double oshirishSonDarajasiga(double a) {
        return Math.pow(e, a);
    }

    public static double uchburchakYuzi(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p \* (p - a) \* (p - b) \* (p - c));
    }
}


