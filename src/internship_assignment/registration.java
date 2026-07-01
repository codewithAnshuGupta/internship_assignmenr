package internship_assignment;

import java.sql.SQLOutput;
import java.util.Scanner;
public class registration{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName, lastName, email, mobile,dob, password, confirmPassword;


        System.out.println("this is your registration");

        while (true) {
            System.out.println("enter your first name");
            firstName = sc.nextLine();
            if (firstName.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("invaid name");
            }
        }


        while (true) {
            System.out.println("enter your last name");
            lastName = sc.nextLine();
            if (lastName.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("invalid name");
            }
        }


    while(true){
        System.out.println("enter your email address::");
         email = sc.nextLine();
         if(email.contains("@") && email.contains(".")){
             break;}
         else {
             System.out.println("invalid email");}}



         while(true){
        System.out.println("enter your mobile number");
         mobile = sc.nextLine();
        if(mobile.length()==10 && mobile.matches("[6-9][0-9]{9}")){
            break;}

        else {
            System.out.println("this is invalid mobile number pls enter your correct phone number");
        }}



      while(true){
       System.out.println("enter dob  (dd/mm/yyyy)");
         dob= sc.nextLine();
        if(dob.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}")){
       break;
        } else{
           System.out.println("invalid dob");}}

while (true){
        System.out.println("enter passwords");
         password = sc.nextLine();
    if (password.length() >= 6) {
        break;}
    else {System.out.println("pls enter 6 digit password");
    } }

while(true){
        System.out.println("confirm password");
         confirmPassword = sc.nextLine();
        if (password.equals(confirmPassword)) {
System.out.println("password confirm");
break;}
          else{System.out.println("password is different");
        }}

        System.out.println("registration completed");

    }
}

