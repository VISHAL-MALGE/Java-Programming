public class Logical_Operators {
    public static void main(String[] args){

/*         Used to Check conditions and expressions
           &&  : AND, Both Conditions Should Be True
           ||  : OR, Either One Conditions Should Be True
            !  : NOT, It Will Reverse The Boolean Value Of Condition
*/

        int age = 21;

        if (!(age >=18) || !(age <=25)){
            System.out.println("You Are An Adult");
        }
        else if (age >= 13 && age<=19) {
            System.out.println("You Are An Teenager");
        }
        else
            System.out.println("You are a baby");




/*  ------------------ EXPRESSION ---------------------

           Expression = operands & operators
           Operands = value, variable, number, quantity
           Operator = +  -  *  /  %

 */

        int Age = 21;
        age++;   // it adds +1 to the age, if you want to add more than 1
        age = age + 5; // this is increment
        age--; // it subtract -1 ,  decrement
        System.out.println(Age);

    }
}
