import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character for color (B/G/R/Y/V) :");
        c=sc.next().charAt(0);
        switch(c)
        {
            case 'B':
                System.out.println("Black");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'R':
                System.out.println("Red");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'V':
                System.out.println("Violet");
                break;
            default:
                System.out.println("Invalid color character");
                break;
        }
    }
}
