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
class Car {
    int speed = 50;
    int speedUp(int speedUp) {  
     speed = speed + speedUp;
     return speed;
    }
    int speedDown(int speedDown) {
     speed = speed - speedDown;
     return speed;
    }
    void showSpeed() {
        System.out.println("Speed: " + speed);
    }
}
