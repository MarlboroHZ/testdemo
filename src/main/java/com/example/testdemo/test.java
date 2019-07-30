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
