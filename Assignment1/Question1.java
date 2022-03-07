public class Question1 {
    public static void main(String[] args) {

        byte a=10,b=4;
        int c;
        c = ((a+b)*b)/(a-b);
        System.out.println("Arithmetic on Byte:"+ c);

        short d =10, e =4;
        int f;
        f = ((d + e)* e)/(d - e);
        System.out.println("Arithmetic on Short:"+ f);

        int g=10, h =4;
        int i;
        i = ((g+ h)* h)/(g - h);
        System.out.println("Arithmetic on Int:"+ i);

        long j =10000000, k =444444;
        long l;
        l = ((j + k)* k)/(j - k);
        System.out.println("Arithmetic on Long:"+ l);

        float m =10.005f, n =4.586f;
        float o;
        o = ((m + n)* n)/(m - n);
        System.out.println("Arithmetic on Float:"+ o);

        double p =10.005, q =4.586;
        double r;
        r = ((p + q)* q)/(p - q);
        System.out.println("Arithmetic on Double:"+ r);
    }
}
