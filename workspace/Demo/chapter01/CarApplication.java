/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01;

/**
 *
 * @author 喃卿
 */
public class CarApplication {
public static void main(String[] arguments) {
        Car dante = new Car();
        System.out.println("Increasing speed.");
        dante.speedUp(100);
        dante.showSpeed();
        System.out.println("reduce speed");
        dante.speedDown(30);
        dante.showSpeed();
        
    }
    
}
