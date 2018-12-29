
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02.exp3;
import java.util.Scanner;
/**
 *
 * @author 喃卿
 */
public class JiTu {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("请输入笼子里脚的总数：");
    int n=input.nextInt();//输入一个整数
    int i=0,j=0,t=0;
    for(i=0;i<=n/2;i++)
        for(j=0;j<=n/4;j++)
    if(2*i+4*j==n){
        System.out.println("鸡可能有："+i+"兔可能有："+j);t=1;
        }
    if(t==0)
        System.out.println("你的输入可能有误！！！");
    }

}
