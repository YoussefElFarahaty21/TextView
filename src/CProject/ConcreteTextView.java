package CProject;
import java.awt.*;
import javax.swing.*;
public class ConcreteTextView extends TextView{
    // Instance variable to store the JTextArea component
    //It serves as the area where text can be displayed and edited.
    private JTextArea textArea;
 public ConcreteTextView() {
        // Create a new JTextArea component
        textArea = new JTextArea();
        
        // Set the font of the JTextArea to Arial, plain style, and a font size of 20
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        
        // Create a JScrollPane and associate it with the JTextArea
        //The JScrollPane is used to make the JTextArea scrollable. 
        scrollpane = new JScrollPane(textArea);
        
        // Set the preferred size of the JScrollPane to 550x550 pixels
        scrollpane.setPreferredSize(new Dimension(550, 550));
    }
    @Override
    public JComponent getComponent() {
        // Return the JScrollPane component containing the JTextArea
        return scrollpane;
    }
}
