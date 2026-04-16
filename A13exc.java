public class A13exc{
    public static void main(String[] args){

      // --------------------------------------------multiple catch------------------------------------------------------------------------------------
        // try{ 
        //         int a = 10/0;
        //         String  s = null;
        //         int k = s.length();
        // }
        // catch(ArithmeticException x){
        //     System.out.println("galat baat");
        // }
        // catch(Exception y){
        //     System.out.println("exc");
        // }


     // --------------------------------------------multy catch;--------------------------------------------------------------------------------------        try{ 
        try{
               // int a = 10/0;
                String  s = null;
                int k = s.length();
        }
        catch(ArithmeticException | NullPointerException x){
            System.out.println(x.getMessage());
            x.printStackTrace();
            System.out.println("galat baat");
        }
       



        finally{
            System.out.println("run every time");
        }
        System.out.println("run the remaining line");
    }
}