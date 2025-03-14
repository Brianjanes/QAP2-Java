public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructors
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters and Setters
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        int x = this.getBeginX();
        int y = this.getBeginY();

        int [] XY = {x, y};
        return XY;
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int[] getEndXY() {
        int x = this.getEndX();
        int y = this.getEndY();

        int [] XY = {x, y};
        return XY;
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

        // tyo use mypoint's distance
    public double getLength() {
        return begin.distance(end);
    }   

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return "MyLine[begin=" + begin + ",end=" + end + "]";
    }       
}
