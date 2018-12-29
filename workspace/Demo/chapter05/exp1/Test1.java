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
public class Test1 {
    public static void main(String[] args){
        Vehicle V1 = new Car();
        V1.brand="奥迪";
        V1.color="红色";
        System.out.println("小汽车的品牌是"+V1.brand+"颜色是"+V1.color);
        V1.run();
        Door D1=new AlarmDoor();
        D1.height=1.8;
        D1.width=0.6;
        System.out.println("门的高度"+D1.height+"宽度是"+D1.width);
        D1.open();
        D1.close();
        IAlarm i1=new AlarmDoor();
        i1.alarm();
        IAlarm i2=new Car();
        i2.alarm();
        
        
    }
}
