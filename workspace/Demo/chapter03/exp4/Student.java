/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03.exp4;

/**
 *
 * @author 喃卿
 */
public class Student {
    public int age;    //年龄
    public String name;    //姓名
    public String department;    //院系名称
    //要求以下定义多个setAttributes方法，设置学生的属性值
//比如，如果没有提供年龄，则设置年龄为18；没有提供院系，则设置院系为"地信"，等等
    
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
    public void setAge(int age) {
        this.age = age;
        if(age==0)
            age=18;
    }
    public void setName(String name) {
        this.name = name;
        if(name==null)
            name="张";
    }
    public void setDepartent(String departent){
        this.department=departent;
        if(department==null)
            department="地信";
    }
    public void info()
    {
    System.out.println("年龄："+age+"   姓名："+ name+"   院系："+department);
    }

}
