import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;

public class ButtonDemo
{

    public static void main(String []args)
    {
        // top-level container
        JFrame mainFrame = new JFrame("Button Demo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // a separate container for storing our other objects
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(200, 200));

        // some text to display
        JLabel label = new JLabel("5+5?");
        // add the text to our special container
        mainPanel.add(label);

        // create a button
        JButton submitButton = new JButton("see answer");

        // when the button is clicked, change the text we are 
        // displaying and disable the button (we don't want anyone
        // to click it again)
        submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                label.setText("10");
                submitButton.setEnabled(false);
            }
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                mainFrame.setVisible(false);
                mainFrame.dispose();
            }
        });
        
        // add the button to our special container
        mainPanel.add(submitButton);
        mainPanel.add(cancelButton);

        // add our special container to the top-level container
        mainFrame.add(mainPanel);
        // auto-size everything
        mainFrame.pack();
        // make top level container visible
        mainFrame.setVisible(true);
    }
}
