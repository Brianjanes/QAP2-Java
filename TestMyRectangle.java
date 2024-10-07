public class TestMyRectangle {
    public static void main(String[] args) {
        // Test constructor with coordinates
        MyRectangle rect1 = new MyRectangle(0, 0, 3, 4);
        System.out.println("Rectangle 1: " + rect1);

        // Test constructor with MyPoint objects
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(6, 5);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println("Rectangle 2: " + rect2);

        // Test getters
        System.out.println("Rectangle 1 top-left: " + rect1.getTopLeft());
        System.out.println("Rectangle 1 bottom-right: " + rect1.getBottomRight());

        // Test setters
        rect1.setTopLeft(new MyPoint(1, 1));
        rect1.setBottomRight(new MyPoint(5, 6));
        System.out.println("Rectangle 1 after setters: " + rect1);

        // Test individual coordinate getters
        System.out.println("Rectangle 2 top-left X: " + rect2.getTopLeftX());
        System.out.println("Rectangle 2 top-left Y: " + rect2.getTopLeftY());
        System.out.println("Rectangle 2 bottom-right X: " + rect2.getBottomRightX());
        System.out.println("Rectangle 2 bottom-right Y: " + rect2.getBottomRightY());

        // Test width, height, area, and perimeter calculations
        System.out.println("Rectangle 1 width: " + rect1.getWidth());
        System.out.println("Rectangle 1 height: " + rect1.getHeight());
        System.out.println("Rectangle 1 area: " + rect1.getArea());
        System.out.println("Rectangle 1 perimeter: " + rect1.getPerimeter());

        System.out.println("Rectangle 2 width: " + rect2.getWidth());
        System.out.println("Rectangle 2 height: " + rect2.getHeight());
        System.out.println("Rectangle 2 area: " + rect2.getArea());
        System.out.println("Rectangle 2 perimeter: " + rect2.getPerimeter());

        // Test with a rectangle where top-left is not actually top-left
        MyRectangle rect3 = new MyRectangle(3, 5, 1, 2);
        System.out.println("Rectangle 3: " + rect3);
        System.out.println("Rectangle 3 width: " + rect3.getWidth());
        System.out.println("Rectangle 3 height: " + rect3.getHeight());
        System.out.println("Rectangle 3 area: " + rect3.getArea());
        System.out.println("Rectangle 3 perimeter: " + rect3.getPerimeter());
    }
}