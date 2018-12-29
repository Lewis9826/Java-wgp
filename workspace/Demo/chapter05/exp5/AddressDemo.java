/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05.exp5;

/**
 *
 * @author 喃卿
 */
public class AddressDemo {
    public static void main(String[] args){
        Address A1 = new Address();
        A1.country = "中国";
        A1.province = "重庆";
        A1.city = "江津";
        A1.street = "双福";
        A1.postcode = "402200";
        System.out.println(A1.toString());
    }

}
