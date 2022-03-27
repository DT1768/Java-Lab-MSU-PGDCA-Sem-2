import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        i = sc.nextInt();
        if(isPrime(i)){
            System.out.println("Number is prime.");
        }
        else{
            System.out.println("Number is not prime.");
        }
    }
    public static boolean isPrime(int n){
        boolean flag = false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag = true;
                break;
            }
            else{
                flag = false;
            }
        }
        if(flag){
            return false;
        }
        else{
            return true;
        }
    }
}
