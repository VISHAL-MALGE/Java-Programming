public class stringMethods {
    public static void main(String[] args){

//        String : It's a Reference Datatype That Can Store One or More Characters

// -------------- String Methods ------------------

        String name = "The Batman  ";

        boolean result = name.equals("The Batman  ");  // It Checks The String Matches or Not & Returns True/False

        name.equalsIgnoreCase("the batman");  // it's Case Sensitive To Prevent Use ' equalsIgnoreCase '
        System.out.println(result);

        int length = name.length();    // Returns The Length Of String
        System.out.println(length);

        char ch = name.charAt(2);  // Access Specific Character From Index Position
        System.out.println(ch);

        int index = name.indexOf("B");   // Access Index Position From Specific Character
        System.out.println(index);

        String upCase = name.toUpperCase();  // Converts String To UpperCase
        System.out.println(upCase);

        String lowCase = name.toLowerCase();  // Converts String To LowerCase
        System.out.println(lowCase);

        String spaceTrim = name.trim();  // Removes Spaces From ' Starting & Ending '
        System.out.println(spaceTrim);

        String place = name.replace("B", "C");  // Replaces With New String or Chars
        System.out.println(place);



    }
}
