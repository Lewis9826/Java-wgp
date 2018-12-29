/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03.exp5;

/**
 *
 * @author 喃卿
 */
public class TestVariable {
    public static void main(String[] arguments)
    {
        System.out.println("height:"+Variable.height);
        Variable v=new Variable();
        v.name="张";
        v.height=173;
        System.out.println("name:"+v.name+"   height:"+v.height);
        
    }

}
