import javax.swing.JOptionPane;

class NameConfirmationApp {
    public static void main(String[] args) {
        while (true) {
            // Prompt user to enter their name
            String name = JOptionPane.showInputDialog(null, "What is your name please?", "Name Input", JOptionPane.QUESTION_MESSAGE);

            // If user presses Cancel or closes the dialog, exit the program
            if (name == null) {
                break;
            }

            // Ask for confirmation to display the name
            int response = JOptionPane.showConfirmDialog(null, "Do You Want To Proceed?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                // Show the name
                JOptionPane.showMessageDialog(null, "Hello Your name is: " + name, "Name Display", JOptionPane.INFORMATION_MESSAGE);
                break; // Exit after showing the name
            } else if (response == JOptionPane.NO_OPTION || response == JOptionPane.CANCEL_OPTION) {
                // Loop back to input dialog
                continue;
            } else {
                // If dialog is closed, exit
                break;
            }
        }
    }
}
