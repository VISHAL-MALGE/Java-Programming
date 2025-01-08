public class JavaBasics {

    public static void main(String[] args){


//  variable : used to store any numbers or words , characters
//             You can name the variable anything

//     datatype   varName  =  value
        int         i      =  5;      // used to store only Integer No.
        String      s      = "Batman";   // used to store only String / Set of Characters
        char        c      =  'S';   // used to store only Characters
        double      d      = 1.27;   // used to store only Decimal No.

        System.out.println(i);     // it's used to print anything
        System.out.println(s);
        System.out.println(c);
        System.out.println(d);



//  -------------- printf method --------------------

 // printf : used to format & print text to console in specified way, printf-> 'print formatted'
 // printf() = 	an optional method to control, format, and display text to the console window
 //				two arguments = format string + (object/variable/value)
 //				% [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        //System.out.printf("%b",myBoolean);
        //System.out.printf("%c",myChar);
        //System.out.printf("%s",myString);
        //System.out.printf("%d",myInt);
        //System.out.printf("%f",myDouble);

        //[width]
        // minimum number of characters to be written as output
        //System.out.printf("Hello %10s",myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        //System.out.printf("You have this much money %.1f",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        //System.out.printf("You have this much money %,f",myDouble);





//  -------------- Scope Variables -----------------

//        Local  = declare inside a method
//                 visible only to that method

//        Global = declare outside the method, but within the class
//                 visible to all parts of the class















    }

}
