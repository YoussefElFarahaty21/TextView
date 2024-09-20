package CProject;


import java.awt.BorderLayout;       // Layout manager to arrange components along the borders of a container
import java.awt.Color;              // Class for representing colors
import java.awt.Dimension;          // Class representing the size of components or dimensions
import java.awt.FlowLayout;         // Layout manager to arrange components in a flow (left-to-right, top-to-bottom)
import java.awt.event.ActionEvent; // Represents an action event, such as button clicks
import java.awt.event.ActionListener;  // Interface for handling action events
import javax.swing.*;               // Main package for Java Swing components
import javax.swing.event.ChangeEvent; // Represents a change event, often used for components like spinners
import javax.swing.event.ChangeListener; // Interface for handling change events

//The GUI is constructed using various Swing components, and actions are handled through event listener methods
public class GUI extends JFrame implements ActionListener{
    
// Representing the TextView component in the GUI
private TextView tv;

// Button for choosing the border color
private JButton Bcolor;

// Storing the current border color (initialized to Color.BLACK)
private Color borderColor = Color.BLACK;

// JScrollPane component to provide a scrollable view
private JScrollPane scrollpane;

//Label used to display text indicating the purpose of the JSpinner for adjusting the border width.
private JLabel borderwidthLabel;

// JSpinner for adjusting the width of the border
private JSpinner borderwidth;

// Integer variable to store the current border width
private int bwidth;

    public GUI(){
        
        // Configure JFrame properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text View");
        this.setSize(new Dimension(650, 650));
       // When components are added to the JFrame, they will be positioned in (N-S-E-W) region chosen
        this.setLayout(new BorderLayout());
        // method is commonly used to center a JFrame on the screen when it is initially shown.
        this.setLocationRelativeTo(null);
        
        // Create a ConcreteTextView and decorate it with HorizontalScrollBar and VerticalScrollBar
        tv=new ConcreteTextView();
        tv=new HorizontalScrollBar(tv,0);
        tv=new VerticalScrollBar(tv, 0);
        
        // Obtain the JScrollPane component from the decorated TextView
        scrollpane = (JScrollPane) tv.getComponent();
        
        // Initialize components for border customization
        borderwidthLabel = new JLabel("Border Width:");
        borderwidth = new JSpinner();
        borderwidth.setPreferredSize(new Dimension(50, 25));
        borderwidth.setValue(0);
        
        // Add a ChangeListener to the borderwidth JSpinner when changed
        borderwidth.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Update the border width based on the JSpinner value
                bwidth = (int) borderwidth.getValue();
                // Decorate the TextView with a new Border using the default color and specified width
                tv = new Border(tv, borderColor, bwidth);
            }
        });
        
        
        // Button for choosing border color
        Bcolor=new JButton("Border Color");
        Bcolor.setPreferredSize(new Dimension(150,25));
        Bcolor.addActionListener(this);
        
        // Create a new JPanel with a FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Add components to the panel
        panel.add(Bcolor);              // JButton for choosing border color
        panel.add(borderwidthLabel);    // JLabel indicating the purpose of the JSpinner
        panel.add(borderwidth);         // JSpinner for adjusting the border width

        // Add the panel and the scrollpane to the JFrame
        this.add(panel, BorderLayout.NORTH);  // Add the panel to the NORTH region of the JFrame
        this.add(scrollpane, BorderLayout.CENTER);  // Add the scrollpane to the CENTER region of the JFrame

        // Set the JFrame as visible
        this.setVisible(true);
        
    }
    
     // ActionListener method for handling button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Checks if the "Border Color" button is clicked.
        if(e.getSource()==Bcolor){
            
            // Creates a new instance of JColorChooser to allow the user to choose a color for the border.
            JColorChooser colorChooser=new JColorChooser();
            
            //opens a color chooser dialog, allowing the user to pick a color for the border. 
            //The chosen color is then stored in the borderColor variable
            borderColor=colorChooser.showDialog(null,"Choose Border Color",Color.BLACK);
            
            // Decorate the TextView with a new Border using the updated color and width
            tv=new Border(tv, borderColor, bwidth);
            
            //Adds the updated JScrollPane to the JFrame, refreshing the display.
            this.add(scrollpane);
        }
    }
    
}
