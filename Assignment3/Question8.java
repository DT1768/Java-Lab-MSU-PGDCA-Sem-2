import java.util.*;
public class Question8 {
  public static void main(String[] args){
        int[][] arr1 ={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 ={{9,8,7},{6,5,4},{3,2,1}};
        int[][] answer = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        System.out.println("\t+");
        System.out.println(Arrays.deepToString(arr2));
        System.out.println("\t=");
        System.out.println(Arrays.deepToString(answer));
  }
}
