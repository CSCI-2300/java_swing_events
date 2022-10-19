import javax.swing.*;
import java.awt.event.*;

public class SubmitButton extends JButton implements ActionListener
{
    private int buttonNumber;
    public SubmitButton(int buttonNumber)
    {
        super(String.valueOf(buttonNumber));
        this.buttonNumber = buttonNumber;
        addActionListener(this);
    }

    // our implementation of ActionListener
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("button clicked");
        System.out.println("button number is " + this.buttonNumber);
    }
}
