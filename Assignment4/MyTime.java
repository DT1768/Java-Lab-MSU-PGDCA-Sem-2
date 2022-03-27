import java.util.Scanner;

public class MyTime {
    int hour;
    int minute;
    int second;

    public MyTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour,int minute,int second){
        this.hour =hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime(MyTime time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }

    public void setTime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hour: ");
        hour = sc.nextInt();
        System.out.print("Enter the Minute: ");
        minute = sc.nextInt();
        System.out.print("Enter the second: ");
        second = sc.nextInt();
    }

    public void dispTime(){
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public boolean isValid(){
        if(this.hour>= 0 && this.hour<24 && this.minute>=0 && this.minute<60 && this.second>0 && this.second<60){
            return true;
        }
        else {
            return false;
        }
    }
}

class demo2{
    public static void main(String[] args) {
        MyTime defaultTime = new MyTime();
        System.out.print("default time : ");
        defaultTime.dispTime();
        MyTime time1 = new MyTime(12,12,12);
        System.out.print("Time 1:");
        time1.dispTime();
        MyTime time2 = new MyTime();
        System.out.println("Input for time 2:");
        time2.setTime();
        System.out.println("time 2:"+time2.getHour()+":"+time2.getMinute()+":"+time2.getSecond());
        MyTime time3 = new MyTime(time2);
        time3.setHour(3);
        time3.setMinute(24);
        time3.setSecond(44);
        System.out.print("Time 3:");
        time3.dispTime();
        boolean valid = time2.isValid();
        if(valid){
            System.out.println("time 2 is valid.");
        }
        else{
            System.out.println("time2 is invalid.");
        }
    }
}
