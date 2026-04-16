
public class A15exc2{
    public static void main(String [] args){
          //  Scanner sc = new Scanner(System.in);                      in this case we have to close mannual way
    //     try(Scanner sc = new Scanner(System.in);){                      // it will automatically
    //         int a = 10/0; 
    //     } catch (Exception e) {
    //         System.out.println("error"+ e.getMessage());
    //     }finally{
    //         System.out.println("run always finally");
    //     }

    //    // sc.close();
    //     System.out.println("ok ok" );   


        try(cusRes ob = new cusRes();){                     
            int a = 10/0; 
            throw new myex("throw the ex by myex");
        } catch (Exception e) {
            System.out.println("error"+ e.getMessage());
        }finally{
            System.out.println("run always finally");
        }

    }
}

class cusRes implements AutoCloseable{
    cusRes(){
        System.out.println("ak");
    }
    public void close(){
        System.out.println("custom resource is closed");
    }
}

class myex extends Exception{              // custom the exception
    myex(String s){
        super(s);
    }
}