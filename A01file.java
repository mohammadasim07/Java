
import java.io.*;
public class A01file {
    public static void main(String [] a){
        try {
            // write in the file

            // FileOutputStream fos = new FileOutputStream("file.txt");
            // String s = "my name is asim";
            // fos.write(s.getBytes());

            // read from file

        //     FileInputStream f = new FileInputStream("file.txt");
        //     int data;
        //     while ((data = f.read()) != -1) { 
                
        //    System.out.print((char)data); 
        //     }
           
           
            // file writer

            // FileWriter fos = new FileWriter("file.txt");
            // String s = "my name is asim";
            // fos.write(s);
            // fos.close()

            // reader

            FileReader f = new FileReader ("file.txt");
            int data;
            while ((data = f.read()) != -1) { 
                
           System.out.print((char)data); 
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}