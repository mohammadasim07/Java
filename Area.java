public class Area{
    public static void main(String[] args){
    double r = 4.43;
    double P = 3.14;
    double overAll = ((r*r)*P);
    System.out.println("Area of crcl " + overAll);
    int roundOf = (int)overAll;
    System.out.println(roundOf);
    }
}
//write a code with static counter that increment every time you create an object (construct concept coming soon, but try to use static method to increment )