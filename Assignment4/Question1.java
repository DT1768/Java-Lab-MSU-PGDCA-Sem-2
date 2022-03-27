import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter Another String: ");
        String s2 = sc.nextLine();
        System.out.println("1st String Length: " + s1.length());
        System.out.println("2nd String Length: " + s2.length());
        if(s1.equals(s2)){
            System.out.println("Strings are equal.");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
