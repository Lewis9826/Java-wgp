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
public class Address {
    public String country;
    public String province;
    public String city;
    public String street;
    public String postcode;
    public String toString(){
        String address = country+province+"省"+city+"市"+street+"街道"+" 邮政编码:"+postcode;
        return address;
    }

}
