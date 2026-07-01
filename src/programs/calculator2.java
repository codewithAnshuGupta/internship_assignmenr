package programs;

import java.util.Scanner;

public class calculator2 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.println("THIS IS YOUR CALCULATOR");

            System.out.println("enter your first number");
            double number1=sc.nextDouble();

            System.out.println("enter your operator(+,-,*,/");
            char op=sc.next().charAt(0);

            System.out.println("Enter your second number");
            double number2=sc.nextDouble();
            switch (op){
                case '+':
                    System.out.println("result=" +(number1+number2));
                    break;
                case '-':
                    System.out.println("result="+(number1-number2));
                    break;
                case '*':
                    System.out.println("resulut="+(number1*number2));break;
case '/':
if(number2!=0){System.out.println("Result="+(number1/number2));}
else{
System.out.println("cannot divide");}
break;
default:
System.out.println("invalid operator");}}

    public static class calculator{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.println("THIS IS YOUR CALCULATOR");
            System.out.println("enter your first number");
            double number1=sc.nextDouble();
            System.out.println("Enter your second number");
            double number2=sc.nextDouble();



            System.out.println("Choose operation");
            System.out.println("1. Addition(+) ");
            System.out.println("2.Substraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");

            System.out.println(" ENTER YOUR CHOICE (1-4)");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Rsult= " + (number1 + number2));
                    break;
                case 2:
                    System.out.println("Result= " + (number1 - number2));
                    break;
                case 3:
                    System.out.println("Result=" + (number1 * number2));
                    break;
                case 4:
                    if (number2 != 0) System.out.println("Result=" + (number1 / number2));
                    break;
                default:
                    System.out.println("invalid choices");
            }




        }
    }
}
