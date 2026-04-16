
import java.util.function.Predicate;

public class A12func_inter{
    public static void main(String[] args) {

        // it is anonyomus class
        // car ref = new car(){
        //     public void eat(){
        //         System.out.println("my name is asim");
        //     }
        // };



        // we can write this thing in lambda

        // car ref = ()-> {
        //     System.out.println("my name");
        // };
        // ref.eat();




       car ref = ( a, b)->{
        return a+b ;
        };
       System.out.println(ref.eat(2,3));




       Predicate<Integer> isEven = (x)-> x%2 == 0;
       System.out.println(isEven.test(3));
       System.out.println(isEven.test(4));

       
    }
}

@FunctionalInterface

interface car{
    int eat(int a,int b);
}

// class bike implements car{
//     public void eat(){
//         System.out.println("name");
//     }
// }