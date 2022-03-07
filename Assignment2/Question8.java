import java.util.*;
public class Question8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int sum = 0,temp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                temp = temp*x;
            }
            sum = sum + temp;
            temp = 1;
        }
        System.out.println("Sum of Series:" + sum);
    }
}
