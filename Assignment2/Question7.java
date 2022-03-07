public class Question7 {
    public static void main(String[] args){
        int flag = 0;
        System.out.println("Prime Numbers between 51 to 100:");
        for(int i=51;i<=100;i++){
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print( i + "\t");
            }
            flag = 0;
        }
    }
}
