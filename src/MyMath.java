public class MyMath {
    //Q1
    //part 1
    public static double smallestNumber(double a, double b, double c){
        double smallestNo = b;

        if(a<smallestNo)
        {
            smallestNo = a;
        }

        else if(b<smallestNo){
            smallestNo = b;
        }

        else if(c<smallestNo){
            smallestNo = c;
        }

        return smallestNo;
    }//end of SmallestNumber()

    //part 2
    public static double power(double a, double b){
        double newNum=a;
        for(int i = 0; i < b-1; i++){
            newNum=newNum*a;
        }
        return newNum;
    }//end of Power()

    //part 3
    public static int sumOfNumbersToN(int n){
        int totalValue=0;
        for(int i=0; i<=n; i++){
            totalValue+=i;
        }
        return totalValue;
    }

    //part 4
    public static int calculateNFactorial(int n){
        int totalValue=n;
        for(int i=0; i<=n; i++){
            totalValue=totalValue*n;
        }
        return totalValue;
    }

    public static boolean primeTime(int n){
        int i = 2;

        while(i<n)
        {
            if(n%i == 0)
            {
                return false;
            }
            i++;
        }
            return true;
    }

}
