package CProject;

// Import necessary Java Swing components and classes
import javax.swing.*;

// TextView is an abstract class representing a view for displaying text content
public abstract class TextView {
    
    // Instance variable to store the JScrollPane component
    protected JScrollPane scrollpane;
    
    // Abstract method to be implemented by subclasses, returns the underlying Swing component
    public abstract JComponent getComponent();
}
