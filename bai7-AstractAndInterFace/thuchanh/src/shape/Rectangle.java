package shape;

import resizeableAndColorable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() + (getWidth()*percent/100));
        setLength(getLength() + (getLength()*percent/100));
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return  width * this.length;
    }
    public double getPerimeter(){
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth()
                + " and length = "+ getLength()
                + " Area  =  " +getArea()+" and Perimeter "+getPerimeter()
                ;
    }

}
