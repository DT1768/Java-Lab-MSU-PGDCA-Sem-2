import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.print("Enter a Character:");
        c = sc.next().charAt(0);
        if(Character.isLetter(c)){
            System.out.println("Entered Character is Letter.");
            int flag = switch (c) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    yield 1;
                default:
                    yield 0;
            };
            if(flag == 1){
                System.out.println("Letter is Vowel.");
            }
            else{
                System.out.println("Letter is Consonant.");
            }
        }
        else if(Character.isDigit(c)){
            System.out.println("Entered Character is Digit.");
        }
        else if(Character.isWhitespace(c)){
            System.out.println("White Space is entered.");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
