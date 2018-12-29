/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02.exp4;
import java.util.Stack;
/**
 *
 * @author 喃卿
 */
public class TestStack {
    public static void main(String[] args) {
          Stack<Integer> stack1=new Stack<Integer>();
          Stack<Integer> stack2=new Stack<Integer>();
          stack1.push(-5);
          stack1.push(27);
          stack1.push(35);
          stack1.push(-123);
          stack1.push(11);
          stack1.push(29);
          stack1.push(3);
          stack1.push(66);
          while(!stack1.empty()){
                if(stack1.peek()==27)
                    System.out.println(stack1.pop());
                else
                    stack2.push(stack1.pop());
          }
          while(!stack2.empty()){
                if(stack2.peek()==35)
                    System.out.println(stack2.pop());
                else
                    stack1.push(stack2.pop());
          }
          while(!stack1.empty()){
                if(stack1.peek()==29)
                    System.out.println(stack1.pop());
                else
                    stack2.push(stack1.pop());
          }
          while(!stack2.empty()){
                if(stack2.peek()==11)
                    System.out.println(stack2.pop());
                else
                    stack1.push(stack2.pop());
          }
          while(!stack1.empty()){
                if(stack1.peek()==3)
                    System.out.println(stack1.pop());
                else
                    stack2.push(stack1.pop());
          }
          while(!stack2.empty()){
                if(stack2.peek()==-123)
                    System.out.println(stack2.pop());
                else
                    stack1.push(stack2.pop());
          }
          while(!stack1.empty()){
                if(stack1.peek()==66)
                    System.out.println(stack1.pop());
                else
                    stack2.push(stack1.pop());
          }
          while(!stack2.empty()){
                if(stack2.peek()==-5)
                    System.out.println(stack2.pop());
                else
                    stack1.push(stack2.pop());
          }
     }
}