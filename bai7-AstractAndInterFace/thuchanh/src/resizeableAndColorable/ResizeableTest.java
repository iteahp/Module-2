package resizeableAndColorable;

import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Shape[] shapes = {rectangle,square};
        System.out.println("Mảng trước khi tăng kích thước : ");
        double number =  Math.random()*100;
        for (Shape shape:shapes
             ) {
            System.out.println(shape);
            if (shape instanceof Rectangle ){
                Resizeable resizeable = (Rectangle) shape;
                resizeable.resize(number);
            }
            if (shape instanceof Square){
                Square square1 = (Square) shape;
                square1.resize(number);
                square1.howToColor();
            };
        }
        System.out.println("Mảng sau khi tăng kích thước : ");
        for (Shape shape: shapes
             ) {
            System.out.println(shape);
        }


    }
}
