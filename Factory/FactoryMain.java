/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorymain;
interface Shape{
    String show();
}
class Circle implements Shape{
    public String show(){
        return "This is Circle.";
    }
}
class Rectangle implements Shape{
    public String show(){
        return "This is Rectangle.";
    }
}
class Triangle implements Shape{
    public String show(){
        return "This is triangle.";
    }
}
interface Maker{
    Shape makeShape();
}
class CircleMaker implements Maker{
    public Shape makeShape(){
        return new Circle();
    }
}
class RectangleMaker implements Maker{
    public Shape makeShape(){
        return new Rectangle();
    }
}
class TriangleMaker implements Maker{
    public Shape makeShape(){
        return new Triangle();
    }
}
class Factory{
    public Shape getShape(String name){
        Maker maker;
        if(name == "Circle"){
            maker = new CircleMaker();
        }
        else if(name == "Rectangle"){
            maker = new RectangleMaker(); 
    }
        else{
            maker = new TriangleMaker();
        }
       return maker.makeShape();
    }
}
public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape shape = factory.getShape("Circle");
        System.out.println(shape.show());
    }
}
