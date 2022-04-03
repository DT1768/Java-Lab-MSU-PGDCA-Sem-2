public class Question2 {
        int number1;
        int number2;
        String string;
        static int count = 0;
        {
                System.out.println("Non-static initialization");
        }
        Question2() {
                count++;
        }

        Question2(int num, String str) {
                count++;
                number1 = num;
                string = str;
        }
        Question2(int n, int m) {
                count++;
                this.number1 = n;
                this.number2 = m;
        }

        public void display() {

                System.out.println("num1 = " + number1 + " num2 = " + number2);
        }

        public void display(char c) {

                System.out.println(c);
        }

        public void display(char c, int num) {

                System.out.println(c + " " + num);
        }

        static {
                count++;
        }

        public static void main(String[] args) {
                Question2 o1 = new Question2();
                System.out.println("Constructor overloading:");
                System.out.println("Number: " + o1.number1 + "\nString: " + o1.string);

                Question2 o2 = new Question2(5, "Dhruv Thakkar");
                System.out.println("Number: " + o2.number1 + "\nString: " + o2.string);

                Question2 o3 = new Question2(5, 10);
                o3.display();
                System.out.println("=====================");

                Question2 o4 = new Question2();
                System.out.println("Method overloading:");
                o4.display('D');
                o4.display('D', 50);
                System.out.println("=====================");

                System.out.println("Static block count value:" + count);
        }
}