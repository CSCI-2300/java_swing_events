import javax.swing.*;
import java.awt.Dimension;

public class ButtonDemo
{

    public static void main(String []args)
    {
        // top level container
        JFrame mainFrame = new JFrame("Button Demo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the button object
        JButton submitButton = new JButton("submit");
        submitButton.setPreferredSize(new Dimension(200, 100));

        // crete an instance of our button listener
        SubmitButtonListener listener = new SubmitButtonListener();

        // add the listener to the button
        submitButton.addActionListener(listener);

        // add the button to the frame
        mainFrame.add(submitButton);

        // auto-size the frame
        mainFrame.pack();

        // make the frame visible
        mainFrame.setVisible(true);
    }
}
