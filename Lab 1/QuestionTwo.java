import javax.swing.*;

public class QuestionTwo {
    public static void main(String[] args) {
        /*Enter a list of numbers between 1 and 100. A number less than 1 indicates end of input. Count how many of each number entered.
        Write the code in main() method.*/
        int[] counter = new int [100];
        String output="";

        //for loop to end once i is less than the length of counter
        for(int i = 0; i < counter.length; i++){
            int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));

            //error message if not between 1 and 100
            if(number>100){
                JOptionPane.showMessageDialog(null, "Not a valid number, only numbers between 1 and 100 please");

            }
            //if less than or equal to zero exit and break out of while loop
            else if(number <=0){
                JOptionPane.showMessageDialog(null, "You have chosen to exit!");
                break;
            }//end of if

            //if number entered increment counter in array for that number
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
        //adds Sentence onto the String output and appends String
        for(int i=0; i <= 100; i++){
            //done this way to append in JOptionPane
            output += "The number of times " + i + " appeared is " + counter[i] +"\n";

        }//end of for loop

        JOptionPane.showMessageDialog(null, output);

    }//end of main
}//end of class
