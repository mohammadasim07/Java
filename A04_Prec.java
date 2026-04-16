public class A04_Prec{
    public static void main(String[] args) {
        int x = 5;
        int y = 5;  
        System.out.println(x++ + ++x);
        System.out.println(++y + y++);
        System.out.println(y);

        // ternary operator

        int a = 10;
        int b = 12;
        int c = 32;

        // find max one;    // most importaint................ ternary operator with three..

        System.out.println((a>b)?((a>c) ? a:c):((b>c) ? b:c));
    }
}