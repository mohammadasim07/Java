public class A04_pattern{
    public static void main(String[] args) {
        int n = 9;
        for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    if( i == j || (i + j)+1 == n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
    }
}