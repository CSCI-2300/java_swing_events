import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;

public class TextFieldDemo implements ActionListener
{
    JFrame mainFrame;
    JPanel mainPanel;
    JLabel label;
    JTextField answerField;
    JButton submitButton;

    public TextFieldDemo()
    {
       // create a top-level container
       this.mainFrame = new JFrame("Button Demo");
       this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // create a special container for storing all the piecies
       this.mainPanel = new JPanel();
       this.mainPanel.setPreferredSize(new Dimension(200, 100));

       // create text containing a question
       this.label = new JLabel("5+5?");
       this.mainPanel.add(this.label);

       // create a text field (area for the user to input text)
       // the user will provide the answer here
       this.answerField = new JTextField();
       this.answerField.setPreferredSize(new Dimension(30, 30));
       this.mainPanel.add(this.answerField);

       // create a button for submitting the user's answer
       this.submitButton = new JButton("Submit");
       // button's action listener is an anonymous class, 
       // we don't care about reusing this code
       this.submitButton.addActionListener(this);

       // add the button to our special container
       this.mainPanel.add(this.submitButton);

       // add the special container to the top-level container
       this.mainFrame.add(this.mainPanel);
       // auto-size everything
       this.mainFrame.pack();
       // make top-level container visible
       this.mainFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
       // retrieve the user's answer, parse it as an integer
       // compare to the correct answer.
       // if the user is incorrect, change the text 
       // (which contained the question) to WRONG,
       // otherwise change the text to CORRECT

       int usersAnswer = 0;
       try
       {
          usersAnswer = Integer.parseInt(this.answerField.getText());
          if (usersAnswer != 10)
          {
             this.label.setText("WRONG!");
          }
          else
          {
             this.label.setText("CORRECT!");
          }
     
          // remove the submit button from our special container
          // (we don't need it anymore)
          this.mainPanel.remove(submitButton);
          // re-draw our special container
          this.mainPanel.repaint();
       }
       catch (NumberFormatException error)
       {
       }
 
    }

}
