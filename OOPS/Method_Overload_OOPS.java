//  Method Overload : that have same names but different work and parameter
//                    method name + parameter  = method signature
//                    compiler determines which method to call based on the parameters used in the call.


public class Method_Overload_OOPS {
    public static void main(String[] args){

        int x = add(2,3,4,1);
        double s = add(2.0,3.0);
        System.out.println(x);
        System.out.println(s);
    }

    static int add(int a, int b){
        System.out.println("This is Method 1");
        return a + b;
    }

    static int add(int a, int b, int c){      // Same method name but diff work
        System.out.println("This is Method 2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){    // Same method name but diff work
        System.out.println("This is Method 3");
        return a + b + c + d;
    }

    static double add(double a, double b){      // Same method name but diff work
        System.out.println("This is Method 4");
        return a * b ;
    }




}
