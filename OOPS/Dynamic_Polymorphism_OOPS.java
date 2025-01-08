
//  Dynamic-Polymorphism : Happens at runtime (dynamic binding).
//                         Method overriding.


import java.util.Scanner;

public class Dynamic_Polymorphism_OOPS {
    public static void main(String[] args){

        pet animal;

        System.out.println("Enter Your Choice : " + "\n1 Dog" + "\n2 Cat");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if (choice == 1 ){
                animal = new kutta();
                animal.speak();
        }

        else if (choice == 2) {
            animal = new cat();
            animal.speak();

        }
        else {
            animal = new pet();
            System.out.println("Invalid Choice...");
        }

    }
}





class pet{

    public void speak(){      // generic method
        System.out.println("Animal goes *brrr");
    }
}


class kutta extends pet{

    @Override
    public void speak() {
        System.out.println("Dog Goes  *bark* ");
    }
}


class cat extends pet{

    @Override
    public void speak() {
        System.out.println("Cat Goes  *meow* ");
    }
}