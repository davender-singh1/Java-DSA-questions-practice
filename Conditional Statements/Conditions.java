import java.util.Scanner;

public class Conditions {
    public static void main(String args[]){
        // int age = 15;
        // if(age >= 18) {
        //     System.out.println("adult : drive, vote");
        // }

        // if(age > 13 && age < 18) {
        //     System.out.println("teenager");
        // }
        // else {
        //     System.out.println("not adult");
        // }

        // Print the largest of 2
        // int A = 1;
        // int B = 5;
        // if (A>=B) {
        //     System.out.println("A is largest of 2");   
        // } else {
        //     System.out.println("B is largest of 2");
        // }


        // Print if a number is Odd or Even
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    }
}