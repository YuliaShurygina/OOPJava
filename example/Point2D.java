package example;

/**
 * Это точка 2D
 */
public class Point2D {
    private int x, y;

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));

    }

    // перегрузка конструкторов
    /**
     * 
     * @param valueX Это координата X
     * @param valueY Это координата Y
     */
    public Point2D(int valueX, int valueY) { // ctor
        x = valueX;
        y = valueY;
    }

    // public Point2D(){ //ctor
    // x = 0;
    // y = 0;
    // }
    // public Point2D(int value){ //ctor
    // x = value;
    // y = value;
    // }
    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public String GetInfo() {
        return String.format("x: %d; y: %d", x, y);

    }

    @Override
    public String toString() {
        return GetInfo();
    }
}