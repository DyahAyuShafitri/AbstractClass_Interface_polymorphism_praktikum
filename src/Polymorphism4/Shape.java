/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism4;

/**
 *
 * @author Dyah Ayu Shafitri
 */
public class Shape {
    private String color;
    public Shape(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    public double getArea(){
        System.out.println("Shape uknown! cannot compute area!");
        return 0;
    }
}
