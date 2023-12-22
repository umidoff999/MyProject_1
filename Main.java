package TopshiriqJava;

public class Main {
    public static void main(String[] args) {
        // Doira radiusi berilgan bo'lsa yuzini hisoblaymiz
        double radius = 5;
        double yuzi = MathFunctions.doiraYuzi(radius);
        System.out.println("Doira yuzi: " + yuzi);

        // e ni biron berilgan son darajasiga oshirib qo'ying
        double son = 3;
        double oshirilganSon = MathFunctions.oshirishSonDarajasiga(son);
        System.out.println("Oshirilgan son: " + oshirilganSon);

        // Uchburchak tomonlari berilgan bo'lsa uning yuzini hisoblaymiz
        double a = 3;
        double b = 4;
        double c = 5;
        double uchburchakYuzi = MathFunctions.uchburchakYuzi(a, b, c);
        System.out.println("Uchburchak yuzi: " + uchburchakYuzi);
    }
}

