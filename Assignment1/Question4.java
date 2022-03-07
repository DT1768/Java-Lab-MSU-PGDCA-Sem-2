import java.util.*;
public class Question4 {
    public static void main(String args[]) {
        float c, f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit :");
        f =sc.nextFloat();
        c =(f - 32)*5/9;
        System.out.println("Celsius temperature = " + c);
    }

}
