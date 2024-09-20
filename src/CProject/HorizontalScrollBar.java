package CProject;

//imports the JComponent class for working with Swing components.
import javax.swing.JComponent;

//Imports the JScrollPane class for creating scrollable panes.
import javax.swing.JScrollPane;

//Imports the ScrollPaneConstants class for scroll pane constants.
import javax.swing.ScrollPaneConstants;

public class HorizontalScrollBar extends ScrollBar{

    public HorizontalScrollBar(TextView tv, int scrollPosition) {
        super(tv, scrollPosition);
        // Obtain the JScrollPane component from the given TextView
        scrollpane = (JScrollPane) tv.getComponent();
        
        // Set the horizontal scroll bar policy to "as needed"
        scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Setvalue method sets the initial horizontal scroll bar position
        scrollpane.getHorizontalScrollBar().setValue(scrollPosition);
    }

    @Override
    public JComponent getComponent() {
         // Return the JScrollPane component containing the horizontal scroll bar
       return scrollpane;
    }
    
}
