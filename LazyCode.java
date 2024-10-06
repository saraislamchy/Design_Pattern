/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singletoncode;

/**
 *
 * @author Dell
 */

//Lazy Instatntiation
public class LazyCode {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
    }
}
class Singleton{
    static Singleton instance;
    private Singleton(){
        System.out.println("Object is created");
    }
     public static synchronized Singleton getInstance(){
         if(instance == null){
             instance = new Singleton();
         }
 
        return instance;
    }
}
