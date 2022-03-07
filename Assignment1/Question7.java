import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        double n,sqrt, square;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextDouble();
        square=n*n;
        sqrt= Math.sqrt(n);
        if ( n % 2 == 0 ){
            System.out.println("The entered number is even");
            System.out.println("Square of number is " +square);
        }
        else{
            System.out.println("The entered number is odd");
            System.out.println("Square root of number is " +sqrt);
        }
    }

}
