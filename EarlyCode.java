/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singletoncode;

/**
 *
 * @author Dell
 */

//Early Instatntiation

public class SingletonCode {

     public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();


        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Singleton obj1 = Singleton.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Singleton obj1 = Singleton.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}

class Singleton {
    static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Instance created..");
    }
    public static Singleton getInstance() {
        return instance;
    }
}