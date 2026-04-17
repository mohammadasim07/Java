
import java.io.*;
public class A02Buffer{
    public static void main(String[] args) {
        try {
        // FileWriter k = new FileWriter("buffer.txt");
        // BufferedWriter bw = new BufferedWriter(k);
        // String l = "we are learning ";
        // bw.write(l);
        // bw.close();                                             // this close is important;;

        
        BufferedReader br = new BufferedReader(new FileReader("buffer.txt"));
        String data;
        while((data = br.readLine()) != null){
            System.out.print(data);
        }
        br.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}