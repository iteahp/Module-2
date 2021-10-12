package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = input.nextDouble();
        System.out.println("Enter b :");
        double b = input.nextDouble();
        System.out.println("Enter c :");
        double c = input.nextDouble();
    QuadraticEquation  equation = new QuadraticEquation(a,b,c);
    if (equation.getDelta()<0){
        System.out.println(" The equation has no roots");
    }else {
        if (equation.getDelta()==0){
            System.out.println(" The equation with double solution = "+ -b/(2*a));
        }else {
            System.out.println("The equation has 2 solutions x1 = "+ equation.getRoot1()+" x2 = " +equation.getRoot2());
        }
    }

    }
}
class QuadraticEquation{
    double a,b,c;
    public QuadraticEquation(){

    }
    public  QuadraticEquation(double a,double b,double c){
        this.a =a;
        this.b = b;
        this.c=c;
    }
    public double getDelta(){return this.b*this.b + 4*this.a*this.c;}
    public double getRoot1(){return (-this.b + Math.pow(this.getDelta(),0.5))/2*this.a;}
    public double getRoot2(){
        return (-this.b - Math.pow(this.getDelta(),0.5))/2*this.a;
    }
}


