import javax.swing.*;

public class QuestionFourDriver {
    public static void main(String[] args) {
        String password = "";
        while(!QuestionFour.validate(password)){
            password = JOptionPane.showInputDialog("Please enter password");

            if(!QuestionFour.validate(password)){
                JOptionPane.showMessageDialog(null, "Please try again");
            }
            else{
                JOptionPane.showMessageDialog(null, "Password is secure");
            }
        }

    }
}
