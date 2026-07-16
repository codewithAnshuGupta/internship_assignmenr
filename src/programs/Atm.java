package programs;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int finalBalance= balance;

        System.out.println("enter balance");
         balance = sc.nextInt();
        while (balance <= 0) {
            System.out.println("negative value cann't take");
            System.out.println("enter your balance ");
            balance = sc.nextInt();
        }


        System.out.println("enter withdrawal amount");
        int withdrawal = sc.nextInt();
         if(withdrawal <= 0) {
            System.out.println("invalid withdrawal");
        } else if (withdrawal>balance) {
             System.out.println("amount not present");


         }
         else {
             finalBalance=balance-withdrawal;

             System.out.println("withdrawal done" +withdrawal);

        }

        System.out.println("your  previous balance" + balance);
        System.out.println("withdrwal "  + withdrawal);
        System.out.println("your final amount left after withdrwal " + finalBalance);




    }
        }







