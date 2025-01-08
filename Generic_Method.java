//  Generic Method : A method that can operate on different types of data using type parameters.
//                   <T>: Declares the generic type parameter, T is a placeholder for a type.
//                   Works with multiple data types.


public class Generic_Method {
    public static void main(String[] args){

        Integer[] myInt = {1,2,3,4,5};
        Double[] myDb = {2.2, 5.4, 8.8, 9.1};
        String[] myStr = {"B" , "E" , "A" , "S" ,"T"};
        Character[] myChar = {'V', 'I', 'S' , 'H', 'H'};

        GetArray(myInt);
        GetArray(myDb);
        GetArray(myStr);
        GetArray(myChar);

    }



    public static <Thing> void GetArray(Thing[] array){

        // One Method To Access All The Data Types  <T>

        for (Thing x : array){
            System.out.print( x + " ");
        }
        System.out.println();
    }
}


