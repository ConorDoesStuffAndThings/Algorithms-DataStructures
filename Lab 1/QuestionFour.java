public class QuestionFour {
    /*
    * Validate a new password as follows:
    * It must be at least 8 characters long
    * It must have at least one uppercase and one lowercase letter
    * It must have at least one digit
    * Write a program that asks the user to enter a new password. Ask again until the input conforms to the rules. Use a method with the following header to check if a password is valid:
    * public boolean validate(String password)
    */


    public static boolean validate(String password){

        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsDigit = false;

        //must be 8 characters long
        if(password.length()>8){
            return true;
        }

        for(int i=0; i < password.length(); i++){

            //must have at least one uppercase
            if(Character.isUpperCase(i)){
                containsUppercase = true;
            }

            // must have at least one lowercase letter
            else if(Character.isLowerCase(i)){
                return true;
            }

            //must have at least one digit
            else if(Character.isDigit(i)){
                containsDigit = true;
            }

            //if all true
            if (containsUppercase && containsLowercase && containsDigit) {
                return true;
            }



        }
        return false;
    }
}
