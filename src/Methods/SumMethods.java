package Methods;
import java.util.*;
public class SumMethods {
 public static int sum(int x, int y){
     return x+y;
        }

        public static void main(String[] args){
Scanner sc=new Scanner(System.in);
            System.out.println("enter 1st number");
            int num1=sc.nextInt();
            System.out.println("enter 2nd number");
            int num2=sc.nextInt();
            System.out.println(sum(num1,num2));

        }


    }
