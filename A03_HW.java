//write a code with static counter that increment every time you create an object (construct concept coming soon, but try to use static method to increment )

class car{
     static int count = 10;
    
}
public class A03_HW{
    public static void main(String[] args) {
        car c = new car();
        c.count++;
        int a = c.count; 
        System.out.println(a);
        car b = new car();
        b.count++;
        System.out.println(b.count);
    }
}