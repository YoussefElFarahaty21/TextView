package CProject;
public abstract class ScrollBar extends Decorators{
    
    // Instance variable to store the scroll position
    protected int scrollPosition;
    
    public ScrollBar(TextView tv, int scrollPosition) {
        super(tv);
        this.scrollPosition = scrollPosition;
    }
    // Additional scroll bar functionality is added in subclasses
}
