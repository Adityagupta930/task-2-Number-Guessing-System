import java.util.Scanner;

public class ATM2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Balance = 9999,  withdraw , deposit;
        System.out.println("Enter the pin number");
        int pin = sc.nextInt();
        if(pin == 2003){
            while (true){
                System.out.println("1. for withdraw");
                System.out.println("2. for deposit");
                System.out.println("3. for check balance ");
                System.out.println("4 for quit");
                System.out.println("Choose the operation you want ro perform");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("enter money for withdraw");
                        withdraw = sc.nextInt();
                        if (withdraw <= Balance) {
                            Balance = Balance - withdraw;
                        } else {
                            System.out.println("insufficient balance");
                        }
                    }
                    case 2 -> {
                        System.out.println("enter money for deposit");
                        deposit = sc.nextInt();
                        Balance = Balance + deposit;
                        System.out.print(" ");
                    }
                    case 3 -> {
                        System.out.println("your total Balance is :" + Balance);
                        System.out.print(" ");
                    }
                    case 4 -> {
                        System.out.println("exit :");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid Choice ");

                }

                System.out.println("thanks for using this ATM");

            }

        }
         else {
            System.out.println("Enter pin number is wrong");
        }
        System.out.println("thanks for using this atm");
    }

}

