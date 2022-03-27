import java.util.Arrays;
public class Question10 {
    public static void main(String[] args){
        int[][] arr = {{1,0,3},{0,5,0},{0,0,0}};
        System.out.println("Matrix:");
        System.out.println(Arrays.deepToString(arr));
        int count=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr[i][j] == 0){
                    count++;
                }
            }
        }
        System.out.println("Total Number of zeros in the Matrix: "+ count);
    }
}
