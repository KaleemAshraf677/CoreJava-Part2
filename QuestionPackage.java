
/* You have to write package named com.edu
 * This package shuold have classes Rectangle,Square,Circle,cylinder,Sphere
 * these classes should use inheritance to properly manage this code 
 * include method like Volume,Surface area
 */

class Rectangle{

    double length=7.2d;
    double breadth=6.5;
    double height=10;

    public double areaOfRectangle(){
            return   length*breadth;
    }
    public double volumeOfRectangle (){
            return length*breadth*height;
    }
}
class Square extends Rectangle{

    public double areaOfSquare(){
        return length*length;     //side*side
    }
    public double VolumeOfSquare(){
        return  length*length*length;
    }
}
class Circle extends Rectangle{

    double radius=7;
    public double areaOfCircle(){
        return Math.PI*radius*radius;
    }
}
class Cylinder extends Circle{
    public double areaOfCylinder(){
        return 2*Math.PI* radius *(height+radius);
    }
    public double VolumeOfCylinder(){
        return 2*Math.PI*radius*radius*height;
    }
   
}

public class QuestionPackage {
    public static void main(String[] args) {
        
        Cylinder obj=new Cylinder();
        obj.areaOfCylinder();
        obj.VolumeOfCylinder();
    }
}

