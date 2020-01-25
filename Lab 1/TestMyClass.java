import javax.swing.*;

public class TestMyClass {
    public static void main(String[] args) {
        double smallestNoResult = MyMath.smallestNumber(76, 2, -23);
        double powerResult = MyMath.power(76, 2);
        int sumOfNResult = MyMath.sumOfNumbersToN(4);
        boolean primeNo = MyMath.primeTime(1);
        int finalFactorial = MyMath.calculateNFactorial(4);
        int noOfWords = QuestionThree.countWords("A Star Is Born");

        //JOptionPane.showMessageDialog(null, smallestNoResult);
        //JOptionPane.showMessageDialog(null, powerResult);
        //JOptionPane.showMessageDialog(null, sumOfNResult);
        //JOptionPane.showMessageDialog(null, finalFactorial);
        //JOptionPane.showMessageDialog(null, primeNo);

        JOptionPane.showMessageDialog(null, noOfWords);
    }
}
