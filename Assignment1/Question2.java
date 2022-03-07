public class Question2 {
    public static void main(String[] args) {
        float principal, roi, duration, interest;
        principal = 10000;
        roi = 8;
        duration = 3;
        interest = (principal * roi * duration) / 100;
        System.out.println("Principal amount is: " + principal);
        System.out.println("Rate is: " + roi);
        System.out.println("Time period is: " + duration);
        System.out.println("Simple Interest is: " + interest);

    }
}
