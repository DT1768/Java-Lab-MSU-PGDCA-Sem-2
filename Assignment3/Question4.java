public class Question4 {
    public static void main(String[] args){
        int arr[] = {5,8,2,3,6,7};
        System.out.println("Original Array:");
        for (int i=0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nSorted Array:");
        for (int i=0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}