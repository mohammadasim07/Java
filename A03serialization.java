
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A03serialization{
    public static void main(String [] args){
        int a = 10;
        int b = 30;
        stud obj = new stud(a,b);
        try {
            FileOutputStream fos = new FileOutputStream("ser.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            System.out.println("Task done");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class stud implements Serializable{
    int age;
    int marks;
    stud(int age, int marks){
        this.age = age;
        this.marks = marks;
    }
}