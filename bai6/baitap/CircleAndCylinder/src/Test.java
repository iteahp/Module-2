public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.0,"yellow");
        System.out.println(circle);
        System.out.println("Test Cylinder Class");
        Cylinder cylinder = new Cylinder(3.0);
        System.out.println(cylinder);
    }
}
