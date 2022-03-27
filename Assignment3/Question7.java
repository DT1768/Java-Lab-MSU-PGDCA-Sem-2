class Question7 {
    public static void main(String[] args) {
        String[] day = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        int[][] sales = {
                {800,800,700,200,700,600,900,300,400,200,200}, //Mon
                {500,500,400,600,200,900,600,300,100,400,100}, //tue
                {300,300,200,700,200,400,100,200,500,400,600}, //wed
                {300,300,600,500,900,600,200,200,700,400,600}, //thu
                {400,800,700,600,300,600,100,300,400,200,200}, //fri
        };
        int sum = 0;
        for(int i = 0; i< sales.length; i++){
            for(int j = 0; j< sales[i].length; j++){
                sum = sum+ sales[i][j];
            }
        }
        System.out.println("Average Sale per day for given week is: "+(double)sum/ sales.length);
        System.out.println();

        for(int i = 0; i< sales.length; i++){
            sum =0;
            for(int j=0;j<=4;j++){
                sum = sum+ sales[i][j];
            }
            System.out.println(day[i] +"'s average sale between 9:00am and 1:00 pm is: "+(double)sum/4);
        }
        System.out.println();

        for(int i = 0; i< sales.length; i++){
            sum =0;
            for(int j = 7; j< sales[i].length; j++){
                sum = sum+ sales[i][j];
            }
            System.out.println(day[i] +"'s average sale between 4:00pm and 8:00pm is: "+(double)sum/4);
        }
        System.out.println();

        for(int i = 0; i< sales.length; i++){
            sum =0;
            for(int j = 0; j< sales[i].length; j++){
                sum = sum+ sales[i][j];
            }
            System.out.println(day[i] +"'s average sale for whole day is: "+(double)sum/ sales[i].length);
        }
    }
}