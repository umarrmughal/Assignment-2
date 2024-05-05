import java.util.*;

public class ATMPINSYSTEM{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char opt;
        int password = 1020;
        int user_input_pin;
        int i = 1;
        do{
            System.out.println("WELCOEM TO MEEZAN BANK");
            System.out.println("Enter your PIN");
            user_input_pin = scn.nextInt();

            if (user_input_pin == password) {
                System.out.println("01: Check Balance");
                System.out.println("02: Withdraw Balance");
                System.out.println("03: Transfer Balance");
            } else {
                System.out.println("INVALID PASSWORD");
                System.out.println("CARD JIS KA HAY USE WAPIS DE AO");
                i++;
            }
        }while (i<= 3);
        System.out.println("your System is blocked please visit the bank");
    }
}
