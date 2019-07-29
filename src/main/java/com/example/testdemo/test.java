package com.example.testdemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 类的描述
 *
 * @author Wangjinghao
 * @version v1.0.0
 * @date 2019/7/5
 */
class Student{
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
public class test {
    public static void main(String[] args){
        add();
    }
    public static void add(){
        List<Student> list = new ArrayList();
        list.add(new Student("Aack",10,"男"));
        list.add(new Student("rose",36,"女"));
        list.add(new Student("lucy",97,"女"));
        list.add(new Student("Tom",42,"男"));
        list.add(new Student("wang",26,"男"));


        System.out.println(list);
        list.sort(Comparator.comparing(e ->e.getSex()));
        System.out.println(list);
        list.sort(Comparator.comparing(e ->e.getName()));
        System.out.println(list);
        list.sort(Comparator.comparing(e ->e.getAge()));
        System.out.println(list);
        Collections.sort(list, Comparator.comparing(Student::getName).reversed());
        System.out.println(list);
        Collections.sort(list, (o1,o2)->  o1.getName().compareTo(o2.getName()));
        System.out.println(list);
        Collections.sort(list, (o1,o2)-> o1.getSex().compareTo(o2.getSex()));
        System.out.println(list);
    }
}
