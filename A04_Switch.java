public class A04_Switch{

/* one thing we have to remember when switch is not returning somthing it not use (;)
 when it return in this case it must have to end with ;..*/
    public static void main(String[] args){
        String day = "Monday";
       String alarm = switch(day){
            case "Monday","Sunday"-> "6am";
            case "Tusday"-> "10am";
            case "friday"-> "6am";
            default -> "7am";
        };
        System.out.println("alarm on " + alarm);
    }
}