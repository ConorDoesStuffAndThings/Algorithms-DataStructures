public class RecursionMethods {
    //Question 2
    public static double myPow(double x, double y){
        if (y <= 0) {
            return 1;
        }
        else {
            double result1 = myPow(x, y - 1);
            double result = x * result1;
            //returns value of x raised to the power of y
            return result;
        }
    }

    //Question 3
    public static String reverse(String str){
        if (str.length()==0){
            return str;
        }

        else{
            String reversedString = reverse(str.substring(1)) + str.charAt(0);
            return reversedString;
        }
    }
}
