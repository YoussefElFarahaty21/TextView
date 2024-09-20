package CProject;

// Import necessary Java Swing components and classes
import javax.swing.JComponent;

public abstract class Decorators extends TextView{
    private TextView tv;

    public Decorators(TextView tv) {
        this.tv = tv;
    }
    
     // Additional decorators functionality is  added in subclasses
}
