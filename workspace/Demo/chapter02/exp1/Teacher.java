/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02.exp1;

/**
 *
 * @author 喃卿
 */
public class Teacher {
    String Name;
    String Tno;
    void startLesson( ){
        System.out.println("Lesson starts!");
    }
    void endLesson( ){
        System.out.println("Lesson ends!");
    }
    void ask( ){
        System.out.println("Who can answer a question!");
    }
    void teach( ){
        System.out.println("I am teaching!");
    }
    public static void main(String[] arguments){
        Teacher t1 = new Teacher();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        t1.startLesson();
        t1.teach();
        t1.ask();
        s1.answer();
        t1.endLesson();
    }
}
