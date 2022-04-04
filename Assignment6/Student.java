import java.util.Scanner;

public class Student {
    String name;
    String section;
    int rollNumber;
    static int count = 0;
    int weight;

    public Student(){
        this.name = "AAAAA";
        this.section = "Default";
        rollNumber = 0;
        weight = 0;
    }

    public Student(String name, String section,int weight){
        count++;
        this.name = name;
        this.section = section;
        rollNumber = count;
        this.weight = weight;
    }

    public Student(Student student){
        this.name = student.name;
        this.section = student.section;
        this.rollNumber = student.rollNumber;
        this.weight = student.weight;
    }

    public void input(){
        count++;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name:");
        name = sc.nextLine();
        System.out.print("Enter Student Section:");
        section = sc.nextLine();
        System.out.print("Enter Student Weight:");
        weight = sc.nextInt();
        rollNumber = count;
    }

    public void show(){
        System.out.println(rollNumber+"  "+ name +"  "+ section+"  "+weight);
    }
}

class demo{
    public static void main(String[] args) {
        Student[] studentObject = new Student[3];
        for(int i=0;i<3;i++){
            studentObject[i] = new Student();
            studentObject[i].input();
        }
        System.out.println("=====================");
        for(int i=0;i<3;i++){
            studentObject[i].show();
        }
    }
}
