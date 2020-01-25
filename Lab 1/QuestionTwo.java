import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class QuestionTwo {
    public static void main(String[] args) {
        /*Enter a list of numbers between 1 and 100. A number less than 1 indicates end of input. Count how many of each number entered.
        Write the code in main() method.*/
        int[] counter = new int [100];
        String output="";


        for(int i = 0; i < counter.length; i++){
            int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));

            if(number>100){
                JOptionPane.showMessageDialog(null, "Not a valid number, only numbers between 1 and 100 please");

            }
            else if(number <=0){
                JOptionPane.showMessageDialog(null, "You have chosen to exit!");
                break;
            }//end of if

            else{
                counter[number]++;
            }//end of else
        }//end of while

        //create counter for each number
        /*
            if(number = 1){
                counter for 1 ++;
            }
         */

        for(int i=0; i <= 99; i++){
            output += "The number of times " + i + " appeared is " + counter[i] +"\n";

        }

        JOptionPane.showMessageDialog(null, output);

    }//end of main
}//end of class
