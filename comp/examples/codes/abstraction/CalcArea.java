package comp.examples.codes.abstraction;

abstract class Shape{
    String color;
    public Shape(String color){
        this.color=color;
    }
    abstract double area();
    String  result () {
        System.out.println("Color is : "+color);
        return "";
    }
}

public class CalcArea extends Shape {
    double radius;
    public CalcArea(String color , double radius){
        super(color);
    }
    @Override
    double area() {
        return Math.PI*radius*radius;
    }
    public static void main (String [] args){
        CalcArea c=new CalcArea("Red",2.0);
        System.out.println("Area="+c.area());
        System.out.println(c.result());
    }
}
