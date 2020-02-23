package InterviewPreparation;

public class StringPasswordValidation {
    /*String -- Password Validation
    1. Write a return method that can verify if a password is valid or not.

     requirements:

   1. Password MUST be at least have 6 characters and should not contain space

   2. PassWord should at least contain one upper case letter

   3. PassWord should at least contain one lowercase letter

   4. Password should at least contain one special characters

   5. Password should at least contain a digit

    if all requirements above are met, the method returns true, otherwise returns  false

     */
    public static void main(String[] args) {

        System.out.println(PasswordValidation("35GnoM@250"));
    }

    public static boolean PasswordValidation(String password) {
        String lowerCase = "(.*[a-z].*)";
        String upperCase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialCharacters = "(.*[-/,:-@].*)";

        boolean hasLower = password.matches(lowerCase),//you can put comma and do not repeat word boolean
                hasUpper = password.matches(upperCase),
                hasDigits = password.matches(numbers),
                hasSpecial = password.matches(specialCharacters),
                Valid = false;

        if (password.length() >= 6 && !password.contains("")) {
            if (hasLower && hasUpper && hasDigits && hasSpecial) {
                Valid = true;

                return Valid;
            }


        }
        return hasLower;
    }}
