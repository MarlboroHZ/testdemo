package com.example.testdemo;

/**
 * 类的描述
 *
 * @author Wangjinghao
 * @version v1.0.0
 * @date 2019/7/30
 */
public class Student {
    private String name;
    private int age;
    private String sex;

    public Student(String name, int age,String sex){
        this.name = name;
        this.age = age;
        this.sex=sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString(){
        return this.name + ":" + this.age+":"+this.sex;
    }
}
