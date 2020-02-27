import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UI {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String fileName = "details.txt";

        Directory directory = new ArrayListDirectory();
        FileReader reader = new FileReader(fileName);
        directory.load(fileName);

        boolean more = true;
        while (more) {
            String cmd = JOptionPane.showInputDialog("L)ookup Name, A)dd entry, Q)uit?");

            if (cmd.equalsIgnoreCase("Q"))
                more = false;
            else if (cmd.equalsIgnoreCase("L")) {
                String n = JOptionPane.showInputDialog("Enter name:");
                JOptionPane.showMessageDialog(null, "Phone number: " + directory.lookup(n));
            } else if (cmd.equalsIgnoreCase("A")) {
                String name = JOptionPane.showInputDialog("Enter name to be added:");
                String number = JOptionPane.showInputDialog("Enter phone number:");

                directory.add(name, number);
            }
        }
    }
}

