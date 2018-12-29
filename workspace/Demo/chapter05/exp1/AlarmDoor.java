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
public class AlarmDoor extends Door implements IAlarm{
    
    @Override
    public void open(){
        System.out.println("防盗门可以开");
    }
    @Override
    public void close(){
        System.out.println("防盗门可以关");
    }
    @Override
    public void alarm(){
        System.out.println("具有防盗报警功能");
    }
}
