package internship_assignment;
import java.util.Scanner;
public class positivenegative {
    public static void main (String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter your number:");
        int number=num.nextInt();
        if(number<0){
            System.out.println("negative number");}
        else if (number>0) {
            System.out.println("positive number");
        }
        else{
            System.out.println("zero ");
        }


        }

    }

