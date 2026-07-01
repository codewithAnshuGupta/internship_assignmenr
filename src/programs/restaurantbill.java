package programs;

import java.util.Scanner;

public class restaurantbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        char more = 0;


        do {
            System.out.println("    WELCOME TO ANSHU RESTAURANT!!!!     ");
            System.out.println("SELECT YOUR FAVOURITE ITEM");
            System.out.println("1. Pizza      RS 399");
            System.out.println("2. Pasta      RS 299 ");
            System.out.println("3. Maggie     RS 199 ");
            System.out.println("4. Coldrink   RS 85 ");
            System.out.println("5.  Momoms    RS 350 ");
            System.out.println("6. Burger     RS 300");

            System.out.println("   PLEASE ENTER YOUR CHOICE   ");
            int choice = sc.nextInt();

            System.out.println("ENTER YOUR QUANTITY:: ");

            int quantity = sc.nextInt();
            if(quantity<=0){
                System.out.println("invalid ");
                continue;
            }


            switch (choice) {
                case 1:
                    System.out.println("PIZZA");
                    total = total + (399 * quantity);
                    break;
                case 2:
                    System.out.println("PASTA");
                    total = total + (299 * quantity);
                    break;
                case 3:
                    System.out.println("MAGGIE");
                    total += 199 * quantity;
                    break;
                case 4:
                    System.out.println("COLDRINK");
                    total += 85 * quantity;
                case 5:
                    System.out.println("MOMOS");
                    total += 350 * quantity;
                    break;
                case 6:
                    System.out.println("BURGER");
                    total += 300 * quantity;
                    break;
                default:
                    System.out.println("invalid choices");
            }
            System.out.println("do you want order more? (Y/N)");
            more = sc.next().charAt(0);
        } while (more == 'y' || more == 'Y');

        double gst = total * 0.05;
        double finalbill = total + gst;


        System.out.println("    *******YOUR BILL ******    ");
        System.out.println("Total bill:::" + total);
        System.out.println("GST::" + gst);
        System.out.println("FINAL BILLL  " + finalbill);
        System.out.println(  "THANK YOU!!!!!!!  ");
    }


}
