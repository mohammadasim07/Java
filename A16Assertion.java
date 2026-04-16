import java.util.Date;

public class A16Assertion{
    public static void main(){
        // java -ea filename.java                    --to run--
        Date obj = new Date();
        System.out.println(obj);
        
        int a = 10;

        assert(a>10) : "error" + a;         

    }
}