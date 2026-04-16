
import java.util.Scanner;
public class A05_Input{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    char c = sc.next().charAt(0);

    if(c == '/' && b == 0){
        System.out.println("Error");
        System.exit(0);                   // to terminate the void program.....
    }
    int ans = switch(c){
        case '+' -> a + b;
        case '-' -> a - b;
        case '*' -> a * b;
        case '/' -> a / b;
        default -> 0;
    };
    System.out.println("Ans = " + ans);
}
}