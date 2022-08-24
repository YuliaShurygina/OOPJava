package example;

public class Point2D {
    private int x, y;
    // перегрузка конструкторов
    public Point2D(int valueX, int valueY){ //ctor
        x = valueX;
        y = valueY;
    }
    //public Point2D(){ //ctor
   //     x = 0;
   //     y = 0;
  //  }
  //  public Point2D(int value){ //ctor
  //      x = value;
  //      y = value;
  //  }
    public Point2D(int value) {
        this(value, value);
    }
    public Point2D() {
        this(0);
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String GetInfo(){
        return String.format("x: %d; y: %d", x, y);

    }
    
    @Override
    public String toString() {
        return GetInfo();
    }
}