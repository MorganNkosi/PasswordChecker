import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {

    public static void main(String[] args)
    {
        Scanner keyIn = new Scanner(System.in);
       //System.out.println("Enter password");
        String pass = "HelloW0rld!";
        System.out.println(passwordIsValid(pass));

    }

    public static boolean hasSpecial(String password)
    {
        Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher aMatcher = sPattern.matcher(password);

        if (!aMatcher.matches())
        {
            return true;
        }
        else
        {
            System.out.println("password should have at least one special character");
            return false;
        }


    }

    public static boolean passwordIsValid(String password)
    {


            if (password != " ")
            {
                if(password.length() > 7)
                {
                    System.out.println("length is ok");


                    if(passwordIsOk(password))
                    {
                        System.out.println("Password meets at least 3 conditions");


                        if (hasSpecial(password))
                        {
                            System.out.println("password is strong and valid!!");
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    System.out.println("password should be longer than 8 characters");
                    return false;
                }
            }
            else
            {
                System.out.println("Password  should exist");
                return false;

            }


    }

    public static boolean passwordIsOk(String password)
    {
        boolean hasNum = false, hasCap = false, hasLow = false;
        char c;
        for (int i = 0; i < password.length(); i++)
        {
            c = password.charAt(i);
            if(Character.isDigit(c))
            {
                hasNum = true;
            }
            if (Character.isUpperCase(c))
            {
                hasCap = true;
            }
            if (Character.isLowerCase(c))
            {
                hasLow = true;
            }
            if(hasNum && hasCap && hasLow)
            {
                return true;
            }
        }
        if(hasNum == false)
        {
            System.out.println("password should have at least one digit");
        }
        if(hasLow == false)
        {
            System.out.println("password should have at least one lower case letter");
        }
        if(hasCap == false)
        {
            System.out.println("password should have at least one upper case letter");
        }

        return false;
    }
}
