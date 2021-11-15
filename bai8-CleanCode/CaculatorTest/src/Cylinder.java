public class Cylinder {
    public static void main(String[] args) {

    }
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    public static double getBaseArea(double radius){
        return Math.PI * radius * radius;
    }
    public static double getPerimeter(double radius){
        return 2 * Math.PI  * radius;
    }
}
