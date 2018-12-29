/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03.exp1;

/**
 *
 * @author 喃卿
 */
public class PrimitiveArray {
    public static void main(String[] args){
    int[] array;
    array = new int[10];
    for(int i=0;i<array.length;i++)
        array[i]=i+5;
    for (int i = 0; i < array.length; i++) {
         System.out.println(array[i] + " ");
      }

    }
}
