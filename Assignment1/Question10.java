public class Question10 {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 1;
        double r1=0, r2=0;
        double d = b * b - 4 * a * c;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are " +r1 + " and " +r2);
        }
        else if (d == 0) {
            r1  = -b / (2 * a);
            System.out.format("root1 = root2 = " +r1);
        }
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.println("root1 = " +real +imaginary);
            System.out.println("root2 = " +real +imaginary);
        }
    }
}
