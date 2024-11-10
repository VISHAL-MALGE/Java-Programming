import java.util.ArrayList;

public class arrayList2D {
    public static void main(String[] args){



//  2D ArrayList : dynamic resizable list of lists that allows storing elements in a grid-like structure,
//                 with flexible rows and columns.

        ArrayList<ArrayList<String>> eats = new ArrayList<>();  // new ArraList of ArrayList

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        ArrayList<String> vegies = new ArrayList<>();

        vegies.add("Tomato");
        vegies.add("Potato");
        vegies.add("Onion");

        ArrayList<String> sweet = new ArrayList<>();

        sweet.add("barfi");
        sweet.add("Kaju Katli");
        sweet.add("soon papdi");

        eats.add(fruits);      // Adding fruit list to eats ArrayList
        eats.add(vegies);      // Adding vegies list to eats ArrayList
        eats.add(sweet);      // Adding sweet list to eats ArrayList

        System.out.println(eats);   // Print All list's
        System.out.println(eats.get(0));  // it will print specific list index no.
        System.out.println(eats.get(0).get(1));  // it will print specific element through index from specific list index no.

    }
}
