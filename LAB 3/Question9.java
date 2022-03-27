import java.util.Arrays;
public class Question9 {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println("The Upper Triangle of the Matrix:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j>i){
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }
    }
}
