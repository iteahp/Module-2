package shape;

import resizeableAndColorable.Colorable;
import resizeableAndColorable.Resizeable;

public class Square extends Shape implements Resizeable, Colorable {
    private  double side = 1.0;
    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides.. ");
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + (getSide()*percent/100));
    }



    public double getArea(){
        return  getSide() * getSide();
    }
    public double getPerimeter(){
        return 4*(getSide());
    }

    @Override
    public String toString() {
        return "A Square with side = "+ getSide()
                + " Area  =  " +getArea()+" and Perimeter "+getPerimeter()+"";


    }

}






