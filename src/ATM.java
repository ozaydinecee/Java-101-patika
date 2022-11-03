import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select=0;
        int price=0;
            do {
                System.out.print("Username :");
                userName = input.nextLine();
                System.out.print("Password : ");
                password = input.nextLine();

                if (userName.equals("ozaydinecee") && password.equals("dev123")) {
                    System.out.println("Hi, welcome to Kodluyoruz bank!");
                    do{
                        System.out.println("1-Payments\n" +
                                "2-Cash withdrawal\n" +
                                "3-Balances\n" +
                                "4-Quit");
                        System.out.print("Please select a transaction: ");
                        select = input.nextInt();
                        switch (select) {
                            case 1:
                                System.out.print("Select an amount : ");
                                price = input.nextInt();
                                balance += price;
                                break;
                            case 2:
                                System.out.print("Select an amount : ");
                                price = input.nextInt();
                                if (price > balance) {
                                    System.out.println("Insufficient balance.");
                                } else {
                                    balance -= price;
                                }
                                break;
                            case 3:
                                System.out.println("Balance : " + balance);
                                break;

                        }
                    }while(select!=4);
                    System.out.println("Good Day!");
                    break;
                } else {
                    right--;
                    System.out.println("Invalid username or password. Try again.");
                    if (right == 0) {
                        System.out.println("Your account has been blocked, please contact the bank.");
                    } else {
                        System.out.println("Remaining right : " + right);
                    }
                }
            }while(right>0);


    }
}
