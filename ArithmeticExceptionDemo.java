package gr.aueb.cf.ch8;

import java.util.Scanner;

/*
ΘΑ ΚΑΝΟΥΜΕ ΔΙΑΙΡΕΣΗ 5 0 ΘΑ ΜΑΣ ΒΓΑΛΕΙ ERROR
* Είναι unchecked exception αφού συνέβει κατά τον χρόνο εκτέλεσης
*
* */

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, result;

       try {
           System.out.println("Δώστε δύο αριθμούς για διαίρεση");
           a = in.nextInt();
           b = in.nextInt();

           result = a / b;

           System.out.print("Το αποτέλεσμα της διαίρεσης είναι: " + result);

       }catch (ArithmeticException e) {
           e.printStackTrace();
           
        }
    }
}
