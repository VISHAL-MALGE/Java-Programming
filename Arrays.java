/*  Arrays : An array is a collection of elements (data items) stored at contiguous memory locations
           All elements in an array are of the same data type.

           To store multiple values in a single variable of Same Datatype
           Easy to access using an index.

           Fixed Size: Once created, the size of an array cannot be changed.
           Same Data Type: All elements must be of the same type (e.g., all integers).
           Indexing: Elements are accessed using indices, starting from zero

           Common Operations in Arrays:
           Insert an Element: Add a value at a specific index.
           Access an Element: Retrieve a value using its index.
           Update an Element: Change a value at a specific index.
           Delete an Element: Remove a value by setting it to a default (if allowed)



 */




public class Arrays {
    public static void main(String[] args){

        Integer[] arr1 = {1, 2, 3 ,4, 5};
        Integer[] arr = new Integer[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[1]); // To Access One Element

        for (Integer array : arr1) {   // This is Enhanced For loop it Will Auto Will Iterate Through All Index
            System.out.println(array);
        }



    }
}
