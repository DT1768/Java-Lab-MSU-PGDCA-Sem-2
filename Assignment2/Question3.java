public class Question3 {
    public static void main(String[] args){
        System.out.println("Multiplication Tables of 21 to 25:");
        int i=21;
        while(i<=25 && i>=21){
            int j = 1;
            System.out.println("Table of" + i + " :");
            while(j<=10){
                System.out.println(i + " * " + j + " = " + (i*j));
                j++;
            }
            System.out.println("\n");
            i++;
        }
    }
}
