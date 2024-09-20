package CProject;
//Imports the Color class for handling color
import java.awt.Color;
// Imports necessary Swing classes for GUI components.
import javax.swing.*;   
//Imports the LineBorder class for creating borders.
import javax.swing.border.LineBorder; 
public class Border extends Decorators{
    // Instance variables to store the color and width of the border
    protected Color color;
    protected int width;
    public Border(TextView tv, Color color, int width) {
        super(tv);
        this.color = color;
        this.width = width;
        scrollpane=(JScrollPane)tv.getComponent();  //Obtains the JScrollPane component from the given TextView.
        LineBorder b=new LineBorder(color,width);  // Creates a LineBorder with the specified color and width.
        scrollpane.setBorder(b); //Applies the created border to the JScrollPane component.
    }

    @Override
    public JComponent getComponent() {
        //Returns the decorated JScrollPane component with the applied border.
        return scrollpane;
    }
    
}
