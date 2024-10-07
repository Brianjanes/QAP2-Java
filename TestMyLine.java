
public class TestMyLine {
    public static void main(String[] args) {
        // Test constructors
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println("Line 1: " + line1);

        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(5, 6);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("Line 2: " + line2);

        // Test getters and setters
        System.out.println("Line 1 begin: " + line1.getBegin());
        System.out.println("Line 1 end: " + line1.getEnd());

        line1.setBegin(new MyPoint(1, 1));
        line1.setEnd(new MyPoint(4, 5));
        System.out.println("Line 1 after setters: " + line1);

        // Test individual coordinate getters and setters
        System.out.println("Line 2 begin X: " + line2.getBeginX());
        System.out.println("Line 2 begin Y: " + line2.getBeginY());
        System.out.println("Line 2 end X: " + line2.getEndX());
        System.out.println("Line 2 end Y: " + line2.getEndY());

        line2.setBeginX(0);
        line2.setBeginY(0);
        line2.setEndX(3);
        line2.setEndY(4);
        System.out.println("Line 2 after coordinate setters: " + line2);

        // Test getBeginXY and getEndXY
        int[] beginXY = line1.getBeginXY();
        int[] endXY = line1.getEndXY();
        System.out.println("Line 1 begin XY: (" + beginXY[0] + ", " + beginXY[1] + ")");
        System.out.println("Line 1 end XY: (" + endXY[0] + ", " + endXY[1] + ")");

        // Test setBeginXY and setEndXY
        line1.setBeginXY(2, 2);
        line1.setEndXY(5, 6);
        System.out.println("Line 1 after setXY methods: " + line1);

        // Test getLength
        System.out.println("Length of Line 1: " + line1.getLength());

        // Test getGradient
        System.out.println("Gradient of Line 1: " + line1.getGradient());

        // Additional tests
        MyLine line3 = new MyLine(0, 0, 1, 1);
        System.out.println("Line 3: " + line3);
        System.out.println("Length of Line 3: " + line3.getLength());
        System.out.println("Gradient of Line 3: " + line3.getGradient());
    }
}
