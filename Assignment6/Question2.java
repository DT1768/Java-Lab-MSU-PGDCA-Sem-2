import java.util.Scanner;

abstract class Shape {
    abstract void input();
    abstract void display();
    abstract void draw();
    abstract double area();
}

class Rectangle extends Shape{
    int l,b;

    Rectangle(){
        this.l = 0;
        this.b = 0;
    }
    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    Rectangle(Rectangle rectangle){
        this.l = rectangle.l;
        this.b = rectangle.b;
    }

    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length:");
        l = sc.nextInt();
        System.out.print("Enter the Width:");
        b = sc.nextInt();
    }

    @Override
    void display() {
        System.out.println("Length: "+ l +"   Width: "+ b);
    }

    @Override
    void draw() {
        System.out.println("Rectangle drawing.");
    }

    @Override
    double area() {
        return l*b;
    }
}

class Triangle extends Shape{
    int base;
    int height;

    Triangle(){
        this.base = 0;
        this.height = 0;
    }
    Triangle(int b,int h){
        this.base = b;
        this.height = h;
    }
    Triangle(Triangle triangle){
        this.base = triangle.base;
        this.height = triangle.height;
    }

    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base:");
        base = sc.nextInt();
        System.out.print("Enter the Height:");
        height = sc.nextInt();
    }

    @Override
    void display() {
        System.out.println("Base: "+ base +"   Height: "+ height);
    }

    @Override
    void draw() {
        System.out.println("Triangle drawing.");
    }

    @Override
    double area() {
        double a = (double)base*(double)height/2;
        return a;
    }
}

class Circle extends Shape{
    int radius;

    Circle(){
        this.radius = 0;
    }
    Circle(int r){
        this.radius = r;
    }
    Circle(Circle circle){
        this.radius = circle.radius;
    }

    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        radius = sc.nextInt();
    }

    @Override
    void display() {
        System.out.println("Radius: "+ radius);
    }

    @Override
    void draw() {
        System.out.println("Circle drawing.");
    }

    @Override
    double area() {
        double a = Math.PI*radius*radius;
        return a;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Rectangle();
        s[1] = new Triangle();
        s[2] = new Circle();
        System.out.println("==================");
        for(int i=0;i<3;i++){
            s[i].input();
            s[i].display();
            System.out.println("Area: "+s[i].area());
            s[i].draw();
            System.out.println("==================");
        }
    }
}
