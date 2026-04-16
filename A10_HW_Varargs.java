public class A10_HW_Varargs{
    public static int f(int... a){
        int larger = a[0];
            for(int i = 0;i<a.length;i++){
                if(larger < a[i]){
                    larger = a[i];
                }
            }
            return larger;
    }
    public static void main(String[] args){
            int b = f(1,2,45,4,5);
            System.out.println(b);
    }
}