package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ErgasiaChap8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int epilogi = 0;

        do {
            menu();


            try {
                epilogi = in.nextInt();
                switch (epilogi) {
                    case 1:
                        System.out.println("epilogi1");
                        break;
                    case 2:
                        System.out.println("epilogi2");
                        break;
                    case 3:
                        System.out.println("epilogi3");
                        break;
                    case 4:
                        System.out.println("epilogi4");
                        break;
                    case 5:
                        System.out.println("GOODBYE");
                        break;
                    default:
                        System.out.println("Error in choice");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Δεν δώσατε έγκυρη τιμή");
                in.nextLine();
            }

        } while(epilogi != 5);

    }

    public static void menu(){
        System.out.println("Δώστε μια επιλογή από τους αριθμούς 1-5");
        System.out.println("Επιλογή 1");
        System.out.println("Επιλογή 2");
        System.out.println("Επιλογή 3");
        System.out.println("Επιλογή 4");
        System.out.println("Επιλογή 5");
    }

}
