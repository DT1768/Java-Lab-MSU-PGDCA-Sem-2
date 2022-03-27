import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array:");
        for (int i=0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number you would like to search: ");
        a = sc.nextInt();
        int flag = 0;
        for (int i=0;i < arr.length;i++){
            if(arr[i] == a){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Element is in the array.");
        }
        else{
            System.out.println("Element is not in the array");
        }
    }
}
