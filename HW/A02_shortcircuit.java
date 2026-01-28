public class A02_shortcircuit{
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        if(b != 0 && a/b > 1){
            System.out.println("safe");
        }
        else{
            System.out.println("unsafe");
        }
    }
}