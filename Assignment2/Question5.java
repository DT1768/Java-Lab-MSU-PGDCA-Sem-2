public class Question5 {
    public static void main(String[] args){
        char c;
        System.out.println("Char-Unicode");
        for(int i=65;i<=90;i++)
        {
            c = (char)i;
            System.out.println("  "+ c + " - " + i);
        }
    }
}
