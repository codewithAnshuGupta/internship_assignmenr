package ifelse;
import java.util.Scanner;
public class sidesofatriangle {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("ENTER 1st SIDE");
        int a = sb.nextInt();
        System.out.println("Enter 2nd side");
        int b = sb.nextInt();
        System.out.println("enter 3rd side");
        int c = sb.nextInt();
        if (a + b > c && b + c > a && c + a > b)
            System.out.println("valid triangle");
        else System.out.println("not valid");
    }
}
