public class Switches {
    public static void main(String[] args){

//      it is same if else statement, but you can when need to check a lot of statements

         String day = "Monday";
         switch (day) {

             // We can write All in one Line
//            case "Sunday", "Saturday", "Friday", "Thursday", "Wednesday", "Tuesday", "Monday": System.out.println("it is " + day);
//                break;
//            default: System.out.println("it is Not a day");


             case "Sunday":
                 System.out.println("it is " + day);
                 break;

             case "Monday":
                 System.out.println("it is " + day);
                 break;

             case "Tuesday":
                 System.out.println("it is " + day);
                 break;

             case "Wednesday":
                 System.out.println("it is " + day);
                 break;

             case "Thursday":
                 System.out.println("it is " + day);
                 break;

             case "Friday":
                 System.out.println("it is " + day);
                 break;

             case "Saturday":
                 System.out.println("it is " + day);
                 break;
         }


    }
}
