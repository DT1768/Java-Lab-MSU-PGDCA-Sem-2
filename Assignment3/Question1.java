import java.util.Scanner;
import java.lang.Math;

public class Question1 {
    public static void main(String[] args){
        int n1,n2,max,min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n1 = sc.nextInt();
        System.out.print("Enter another Number: ");
        n2 = sc.nextInt();
        max = Math.max(n1,n2);
        min = Math.min(n1,n2);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
