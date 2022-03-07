import java.util.*;
public class Question6 {
    public static void main(String[] args){
        int n,fact=1;
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n>0) {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println(n + "! = " + fact);
        }
        else if(n==0){
            System.out.println(n + "! = " + fact);
        }
        else{
            System.out.println("Invalid Input.");
        }
    }
}
