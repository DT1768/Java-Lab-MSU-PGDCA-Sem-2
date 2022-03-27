import java.util.Scanner;

public class Question6 {
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
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        while(start <= end){
            if(arr[mid]< a){
                start = mid+1;
            }
            else if(arr[mid] == a){
                System.out.println(a + " is in the array at index " + mid);
                break;
            }
            else{
                end = mid-1;
            }
            mid = (start + end)/2;
        }
        if(start>end){
            System.out.println("Element is not there in given array.");
        }



    }
}
