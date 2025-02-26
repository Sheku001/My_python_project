package Oops_concept;

import java.awt.*;

class Circle{
    Point center;
    double Radius;
    Circle(){

    }
    Circle (Point InitialCenter, double  InitialRadius){
        this.center = InitialCenter;
        this.Radius = InitialRadius;
    }

    public static void main(String[] args) {
        Circle C1 = new Circle(new Point(1, 2), 3);
        System.out.println(C1.center);
        System.out.println(C1.Radius);
    }
}



