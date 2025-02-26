package Oops_concept;

import java.awt.*;

public class Class_creation {
    Point Center;
    double Radius;

    Class_creation() {
    }

    Class_creation(Point Center, double Radius) {
        this.Center = Center;
        this.Radius = Radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * this.Radius;

    }

    double getArea() {
        return Math.PI * this.Radius * this.Radius;
    }
    void setCenter(Point center){
        this.Center = center;
    }
    void setRadius(double radius){
        this.Radius = radius;
    }

}
