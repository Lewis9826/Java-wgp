/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02.exp2;

/**
 *
 * @author 喃卿
 */
public class Manufacturer {
    void assemble( ){
        System.out.println("An automobile has been assembled。");
    }
    public static void main(String[] arguments){
        Wheel W1 = new Wheel();
        Wheel W2 = new Wheel();
        Wheel W3 = new Wheel();
        Wheel W4 = new Wheel();
        Engine E1 = new Engine();
        Frame F1 = new Frame();
       Manufacturer M1 = new Manufacturer();
       M1.assemble();
              
    }
}
