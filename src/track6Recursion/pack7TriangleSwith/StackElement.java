package track6Recursion.pack7TriangleSwith;

public class StackElement {

    private long returnElement;
    private boolean isFirst;

    public StackElement(long returnElement, boolean isFirst) {
        this.returnElement = returnElement;
        this.isFirst = isFirst;
    }

    public long getReturnElement() {
        return returnElement;
    }

    public boolean isFirst() {
        return isFirst;
    }
}
