public class Point2D {// класс
    int x, y;// поля класса(общие характеристики)
    static double distance( Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x-b.x, 2) + Math.pow(a.y-b.y, 2));
        
    }
    public static void main(String[] args) {
        Point2D a = new Point2D();// экземпляр класса(конкретный представитель)
        a.x = 0;// значения полей
        a.y = 2;
        System.out.println(a.toString());
        Point2D b = new Point2D(); //второй экземпляр
        b.x = 0;
        b.y = 10;
        System.out.println(b.toString());
        System.out.println(distance(a,b));
    }
}
