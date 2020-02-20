import javax.swing.*;

public class FactorialDriver {
    public static void main(String[] args) {
        int fact = Factorial.factorial(5);
        double power = RecursionMethods.myPow(2, 2);
        String reverseString = RecursionMethods.reverse("super dupper");
        int arrayNumber[] = {4, 5 , 5};
        //int sumOfArrayValues = MyArrays.sum(arrayNumber);

        JOptionPane.showMessageDialog(null, fact);
    }

}
