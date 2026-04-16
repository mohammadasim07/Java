public class A11_Enum{
enum Light{
 RED,YELLOW,GREEN;
}
public static void main(String[] args){
        Light A = Light.RED;
        switch(A){
            case RED:
                System.out.println("STOP");
                break;
            case YELLOW:
                System.out.println("READY");
                break;
            case GREEN:
                System.out.println("Goooooooooo");
                break;
        }
}

}