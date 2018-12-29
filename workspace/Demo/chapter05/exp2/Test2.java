/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05.exp2;

/**
 *
 * @author 喃卿
 */
public class Test2 {
     public static void main(String[] args){
        Computer C1 = new Computer();
        Fan fan = new Fan();
        USBFan U1 = new USBFan();
        C1.useUSB();
        fan.blow();
        U1.useUSB();
        U1.blow();

     }
}
