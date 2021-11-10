public class Test {
    public static void main(String[] args) {
        Point point = new Point(10.0f,10.0f);
        System.out.println(point.toString());
        MovablePoint movablePoint= new MovablePoint(2.0f,3.0f);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }

}
