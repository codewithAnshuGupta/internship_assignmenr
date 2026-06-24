package internship_assignment;
import java.util.Scanner;
public class largestofthreenumbers {
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.println("Enter your three number ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int largest;
largest=a>b?a:b;
largest=c>largest?c:largest;
System.out.println("so the largest number=" +largest);



}

}
