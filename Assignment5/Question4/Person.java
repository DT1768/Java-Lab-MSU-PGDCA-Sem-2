package Question4;

import javax.security.auth.Subject;
import java.util.Scanner;


public class Person {
    static int count=0;
    String fname;
    String lname;
    String address;
    String mobileNumber;

    public Person(){
        this.fname = "Hello";
        this.lname = "World";
        this.address = "MSU";
        this.mobileNumber = "9999999999";
    }
    public Person(String fname, String lname,String address, String mobileNumber){
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }
    public Person(Person person){
        this.fname = person.fname;
        this.lname = person.lname;
        this.address = person.address;
        this.mobileNumber = person.mobileNumber;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name:");
        fname = sc.nextLine();
        System.out.print("Enter Last Name:");
        lname = sc.nextLine();
        System.out.print("Enter Address:");
        address = sc.nextLine();
        System.out.print("Enter Mobile Number:");
        mobileNumber = sc.nextLine();
    }
    public void show(){
        System.out.println("Name: "+fname + " " + lname);
        System.out.println("Address: "+address);
        System.out.println("Mobile Number: "+ mobileNumber);
    }
}

class Student extends Person {
    int rno;
    String subject;
    int marks;
    Student(){
        super();
        this.rno = 0;
        this.subject = "None";
        this.marks =0;
    }
    Student(String fname, String lname,String address, String mobileNumber,String subject, int marks){
        super(fname,lname,address,mobileNumber);
        count++;
        this.rno = count;
        this.subject = subject;
        this.marks = marks;
    }
    Student(Student student){
        super(student);
        this.rno = student.rno;
        this.subject = student.subject;
        this.marks = student.marks;
    }
    public void input(){
        System.out.println("Enter Student Details:");
        super.input();
        count++;
        rno = count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject:");
        subject = sc.nextLine();
        System.out.print("Enter marks:");
        marks = sc.nextInt();
    }
    public void show(){
        System.out.println("Student Details:");
        System.out.println("Roll No: "+rno);
        super.show();
        System.out.println("Subject: "+ subject);
        System.out.println("Marks: "+ marks);
    }
}

class Employee extends Person{
    int empno;
    String designation;
    String department;
    Employee(){
        super();
        this.empno = 0;
        this.designation = "None";
        this.department = "None";
    }
    Employee(String fname, String lname,String address, String mobileNumber,String designation, String department){
        super(fname,lname,address,mobileNumber);
        count++;
        this.empno = count;
        this.designation = designation;
        this.department = department;
    }
    Employee(Employee employee){
        super(employee);
        this.empno = employee.empno;
        this.designation = employee.designation;
        this.department = employee.department;
    }
    public void input(){
        System.out.println("Enter Employee Details:");
        super.input();
        count++;
        empno = count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Designation:");
        designation = sc.nextLine();
        System.out.print("Enter Department:");
        department = sc.nextLine();
    }
    public void show(){
        System.out.println("Employee Details:");
        System.out.println("Employee No: "+empno);
        super.show();
        System.out.println("Designation: "+ designation);
        System.out.println("Department: "+ department);
    }
}

class demo{
    public static void main(String[] args) {
        Employee e1 = new Employee("Dhruv","Thakkar","Padra","7096525598","Manager","IT");
        Student s1 = new Student("Jeet","Vora","Rajkot","9876543210","Physics",95);
        Employee e2 = new Employee();
        System.out.println("=========================================");
        e2.input();
        System.out.println("=========================================");
        e1.show();
        System.out.println("=========================================");
        s1.show();
        System.out.println("=========================================");
        e2.show();
        System.out.println("=========================================");
    }
}
