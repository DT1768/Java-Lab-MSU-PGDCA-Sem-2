import java.util.Scanner;

public class Box {
    int length;
    int breadth;
    int height;
    public Box(){
        length = 1;
        breadth = 1;
        height = 1;
    }
    public Box(int length, int breadth,int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Box(Box myBox){
        this.length = myBox.length;
        this.breadth = myBox.breadth;
        this.height = myBox.height;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        breadth = sc.nextInt();
        System.out.print("Enter Height: ");
        height = sc.nextInt();
    }
    public void show(){
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }
    public int volume(){
        return (length*breadth*height);
    }
}
class Demo{
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box(1,2,3);
        Box box4 = new Box(box3);
        System.out.println("Box 1 Parameters:");
        box1.show();
        System.out.println("Enter Values for box 2:");
        box2.input();
        System.out.println("Volume of box 2: " + box2.volume());
        System.out.println("Volume of box 4: " + box4.volume());
    }
}
