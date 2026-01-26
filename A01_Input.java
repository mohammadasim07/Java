import java.util.Scanner;

public class A01_Input {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        float b = sc2.nextFloat();
        System.out.println("the number is "+ a + "  " + b);
    }
}
