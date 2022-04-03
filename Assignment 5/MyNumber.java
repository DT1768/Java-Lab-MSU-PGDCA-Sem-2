public class MyNumber {
    int number;

    public MyNumber(){
        number = 0;
    }

    public MyNumber(int number){
        this.number = number;
    }

    public MyNumber(MyNumber n){
        this.number = n.number;
    }

    public boolean isEven(){
        return (number % 2 == 0 && number > 0);
    }

    public boolean isOdd(){
        return (number % 2 != 0 && number > 0);
    }

    public boolean isPrime(){
        boolean flag = false;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                flag = true;
                break;
            }
            else{
                flag = false;
            }
        }
        return (!flag && number > 0);
    }

    public boolean isPositive(){
        return number > 0;
    }

    public boolean isNegative(){
        return number < 0;
    }

    public boolean isZero(){
        return number == 0;
    }

    public int factorial(){
        int fact = 1;
        for(int i=1;i<=number;i++){
            fact = fact * i;
        }
        return fact;
    }

    public int cube(){
        return number*number*number;
    }

    public int square(){
        return number*number;
    }
}

class Demo{
    public static void main(String[] args) {
        MyNumber defaultNum = new MyNumber();
        MyNumber num1 = new MyNumber(5);
        MyNumber num2 = new MyNumber(-4);
        MyNumber num3 = new MyNumber(num2);

        if(defaultNum.isZero()){
            System.out.println("Default number is zero.");
        }
        if(num1.isOdd()){
            System.out.println("Num1 is Odd.");
        }
        if(num3.isEven()){
            System.out.println("Num3 is Even.");
        }
        else{
            System.out.println("Num3 is either negative number or is not even.");
        }
        if(num1.isPositive()){
            System.out.println("Num1 is positive.");
        }
        if(num2.isNegative()){
            System.out.println("Num2 is negative.");
        }
        if(num1.isPrime()){
            System.out.println("Num1 is Prime.");
        }
        int numFact = num1.factorial();
        System.out.println("Num 1 Factorial: " + numFact );
        int numSquare = num1.square();
        System.out.println("Num 1 square = " + numSquare);
        int numCube = num2.cube();
        System.out.println("Num 2 cube = " + numCube);
    }
}