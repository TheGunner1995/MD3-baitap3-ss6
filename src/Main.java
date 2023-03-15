public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        Point point1 = new Point(1,2);
        System.out.println(point1);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint1.move());
    }
}