package com.example.testdemo;

/**
 * 类的描述
 *
 * @author Wangjinghao
 * @version v1.0.0
 * @date 2019/8/6
 */
public class SingleObject {

    private static SingleObject singleObject=new SingleObject();

    private SingleObject(){}

    public static SingleObject getSingleObject() {
        return singleObject;
    }

    public void showMessage(){
        System.out.println("hello world");
    }
}

enum SingletonEnum{

    SINGLETON_ENUM;
    public void whateverMethod() {
    }
}


class Singleton{

    private static Singleton singleton;

    private Singleton (){}

    public static synchronized  Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}

class Main{
    public static void main(String[] args){
        SingleObject singleObject=SingleObject.getSingleObject();
        singleObject.showMessage();
        System.out.println(singleObject);
        SingleObject singleObject1=SingleObject.getSingleObject();
        System.out.println(singleObject1);

        Singleton singleton=Singleton.getSingleton();
        System.out.println(singleton);
        Singleton singleton1=Singleton.getSingleton();
        System.out.println(singleton1);

        SingletonEnum singletonEnum=SingletonEnum.SINGLETON_ENUM;
        System.out.println(singletonEnum);
        SingletonEnum singletonEnum1=SingletonEnum.SINGLETON_ENUM;
        System.out.println(singletonEnum1);
    }
}