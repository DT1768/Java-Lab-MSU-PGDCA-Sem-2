import java.util.Arrays;
public class Question12 {
    public static void main(String[] args){
        String[] breakfast = {"Bread-jam","paratha","toast","roti","eggs","cornflakes"};
        System.out.println("Breakfast Options:");
        System.out.println(Arrays.deepToString(breakfast));
        long i;
        i = Math.round(Math.random()*5);
        System.out.println("Breakfast for Today is: "+ breakfast[(int)i]);
    }
}
