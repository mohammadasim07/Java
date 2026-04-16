// for each loop     for(int  a : arr);
//int[] arr = new int(6);
public class A6_Array{
    public static void main(String[] args){
        int[][] arr;
        int a = 1;
         arr = new int[5][5];
         for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                arr[j][i] = a++;
            }             
         } 
         for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                System.out.print(arr[j][i]+" ");
            }          
            System.out.println();   
         } 
    }
}


//--------------------------jagged array------------------------------------

//int[][]arr3 = new int[3][];
//arr3[0] = new int[5]
//arr3[0] = new int[4]
//arr3[0] = new int[3]
//arr3[0] = new int[2]