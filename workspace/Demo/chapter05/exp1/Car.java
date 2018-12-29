/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05.exp1;

/**
 *
 * @author 喃卿
 */
public class Car extends Vehicle implements IAlarm{
    @Override
    public void run() {
	System.out.println("小汽车具有行驶的功能");
    }
    @Override
    public void alarm(){
	System.out.println("具有防盗报警的功能");
    }
}
