public class MyMath {
    //Q1
    //part 1, find the smallest of three numbers
    public static double smallestNumber(double a, double b, double c){
        double smallestNo = b;

        if(a<smallestNo)
        {
            smallestNo = a;
        }//end of if

        else if(b<smallestNo){
            smallestNo = b;
        }//end of else if

        else if(c<smallestNo){
            smallestNo = c;
        }//end of else if

        return smallestNo;
    }//end of SmallestNumber()

    //part 2, calculate ab  where b is a positive integer i.e. write code equivalent to pow() method in Math.java
    public static double power(double a, double b){
        double newNum=a;
        for(int i = 0; i < b-1; i++){
            newNum=newNum*a;
        }
        return newNum;
    }//end of Power()

    //part 3, find the sum of the numbers 1 to n  where n >=1
    public static int sumOfNumbersToN(int n){
        int totalValue=0;
        for(int i=0; i<=n; i++){
            totalValue+=i;
        }
        return totalValue;
    }//end of sumOfNumbersToN()

    //part 4, calculate n!  where n >=0, n! = 1*2*3*4*…*n  if n>=1 =  1 if n = 0
    public static int calculateNFactorial(int n){
        int totalValue=n;
        for(int i=0; i<=n; i++){
            totalValue=totalValue*n;
        }
        return totalValue;
    }//end of calculateNFactorial()
    //part 5, test if a number n is a prime number
    public static boolean primeTime(int n){
        int i = 2;

        while(i<n)
        {
            if(n%i == 0)
            {
                return false;
            }//end of if
            i++;
        }//end of while
            return true;
    }//end of primeTime()

}//end of class
