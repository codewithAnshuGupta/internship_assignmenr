package internship_assignment;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        if(num%2==0) {
            System.out.println("it is even");
        }
        else{ System.out.println("it is odd");
        }



    }
}
