import java.util.Scanner;

class Atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int correctpin = 1234;

        for (int i = 1; i <= 3; i++) {
            System.out.println("enter pin:");
            int pin = sc.nextInt();

            if (pin == correctpin) {
                System.out.println("login successful");
                break;
            } else {
                System.out.println("you have entered the wrong pin");
            }

            if (i == 3) {
                System.out.println("card blocked");
            }
        }
    }
}