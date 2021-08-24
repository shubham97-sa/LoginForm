package formValidation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class LoginForm {
    public static void main(String[] args) {
//         int age=0;
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[a-zA-Z ]*$");
//        Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");


        while (true) {
            System.out.println(" Enter name:");
            String name = input.nextLine();
            if ((name == null) || (name.matches("^.*[^a-zA-Z].*")) || name.length() >= 20 || name.length() < 3) {
                System.out.println("Please enter valid name (between 3 -20 characters) and name field can not be null");
                continue;

            } else {
                break;
            }
        }
        while (true) {

            System.out.println("Enter  age:");
            String age = input.nextLine();
            if(age.isEmpty()){
                System.out.println("enter valid age");
                continue;
            }
            if(!age.matches("^[0-9]{1,3}$")){
                System.out.println("Please enter valid age");
                continue;
            }
            if (Integer.parseInt(age) <= 0 || Integer.parseInt(age) >= 150)  {
                System.out.println("enter valid age");
                continue;
            }
            else {
                break;
            }
        }
        while (true) {
            System.out.println("Please enter your email (for example:-ajay@yahoo.com) :");
            String email = input.nextLine();
            Pattern VALID_EMAIL_ADDRESS_REGEX =
                    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
            if (email == null || email.isEmpty()) {
                System.out.println("Email cant be nullL");
            } else if (matcher.find() == false) {
                continue;
            } else {
                break;
            }
        }



            while (true) {

                System.out.println(" Enter Date of birth:");
                String dob = input.nextLine();

                if (dob == null || dob.isEmpty()) {
                    System.out.println("Date of birth can't be null ! Please enter valid date");
                    continue;
                } else {
                    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                    try {
                        Date birthdate = formatter.parse(dob);
                        break;
                    } catch (ParseException e) {
                        System.out.println("Please enter valid date in format of MM/DD/YYYY");
                    }


                }

//
            }


        }
    }















