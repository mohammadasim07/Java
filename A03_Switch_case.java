public class A03_Switch_case{
    public static void main(String[] args){
        String day = "sunday";
        String alarm = switch(day){
            case "sunday"->"11am";
            case "friday"->"9am";
            default->"8am";
        };
        System.out.println(alarm);
    }
}