/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polygonhierarchy;

/**
 *
 * @author Usher
 */
class Triangle  extends Polygon{

    
    @Override int getNumberofsides() {
        return 3;
    }

    @Override public double getArea() {
       double height = Math.sqrt(Math.pow(sideLength, 2)-(0.5*Math.pow(sideLength, 2)));
       return 0.5 * sideLength * height;
    }
    
}
