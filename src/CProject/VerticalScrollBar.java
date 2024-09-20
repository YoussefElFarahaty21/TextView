package CProject;

//imports the JComponent class for working with Swing components.
import javax.swing.JComponent;

//Imports the JScrollPane class for creating scrollable panes.
import javax.swing.JScrollPane;

//Imports the ScrollPaneConstants class for scroll pane constants.
import javax.swing.ScrollPaneConstants;

public class VerticalScrollBar extends ScrollBar{

    public VerticalScrollBar(TextView tv, int scrollPosition) {
        super(tv, scrollPosition);
        
        // Obtain the JScrollPane component from the given TextView
        scrollpane=(JScrollPane)tv.getComponent();
        
        // Set the vertical scroll bar policy to "always"
        scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        // Setvalue method sets the initial vertical scroll bar position
        scrollpane.getVerticalScrollBar().setValue(scrollPosition);
    }

    @Override
    public JComponent getComponent() {
       // Return the JScrollPane component containing the vertical scroll bar
        return scrollpane;
    }
    
}
