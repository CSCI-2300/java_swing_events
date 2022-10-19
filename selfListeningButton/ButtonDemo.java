import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo
{
    public static void main(String []args)
    {
        // create a top-level container
        JFrame mainFrame = new JFrame("Button Demo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 4));

        // create our self listening buttons
        for (int i = 0; i < 10; i++)
        {
           SubmitButton submitButton = new SubmitButton(i);
           buttonPanel.add(submitButton);
        }
        // add the button panel to the top-level container
        mainFrame.add(buttonPanel);

        // auto-size everything
        mainFrame.pack();
        // make top-level container visible
        mainFrame.setVisible(true);
    }
}
