public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors
    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and Setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Methods to get individual coordinates
    public int getTopLeftX() {
        return topLeft.getX();
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public int getBottomRightX() {
        return bottomRight.getX();
    }

    public int getBottomRightY() {
        return bottomRight.getY();
    }

    // Method to calculate width
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Method to calculate height
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Method to calculate area
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Method to calculate perimeter
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // toString method
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }
}