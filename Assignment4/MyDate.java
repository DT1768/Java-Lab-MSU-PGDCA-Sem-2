import java.util.Scanner;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(){
        day = 1;
        month = 1;
        year = 9999;
    }

    public MyDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(MyDate date){
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public void setDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        day = sc.nextInt();
        System.out.print("Enter the Month: ");
        month = sc.nextInt();
        System.out.print("Enter the Year: ");
        year = sc.nextInt();
    }

    public void dispDate(){
        System.out.println(day + "/" + month + "/" + year);
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void isValid(){
        boolean valid;
        if(month == 2 && day>0 && day<=29 && year>0){
            if(year%400 == 0){
                valid = true;
            }
            else if(year%100 == 0){
                valid = false;
            }
            else if(year%4 == 0){
                valid = true;
            }
            else{
                valid = false;
            }
        }
        else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ||month == 12) && day>0 && day<=31 && year>0){
            valid = true;
        }
        else if(month>0 && month<12 && day>0 && day<=30 && year>0){
            valid = true;
        }
        else{
            valid = false;
        }
        if(valid){
            System.out.println("The Date is valid.");
        }
        else{
            System.out.println("The Date is not valid.");
        }
    }
}

class Demo1{
    public static void main(String[] args){
        MyDate defaultDate = new MyDate();
        System.out.print("Default Date is: ");
        defaultDate.dispDate();
        MyDate date1 = new MyDate(29,2,2021);
        MyDate date2 = new MyDate();
        System.out.println("Input for date2");
        date2.setDate();
        System.out.println("date 2: "+date2.getDay()+"/"+date2.getMonth()+"/"+date2.getYear());
        MyDate date3 = new MyDate(date2);
        System.out.println("Check date1 Validity:");
        date1.isValid();
        System.out.println("Check date3 Validity:");
        date3.isValid();
    }
}
