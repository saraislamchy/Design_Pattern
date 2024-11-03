/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainclass;

interface Strategy {
   public int performOperation(int a, int b);
}

class Addition implements Strategy {
   public int performOperation(int a, int b) {
      return a + b;
   }
}
class Multiplication implements Strategy {
   public int performOperation(int a, int b) {
      return a * b;
   }
}
class Subtraction implements Strategy {
   public int performOperation(int a, int b) {
      return a - b;
   }
}

class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int doStrategy(int a, int b){
      return strategy.performOperation(a, b);
   }
}

public class mainClass {

    public static void main(String[] args) {
        Context context = new Context(new Addition());		
      System.out.println("Addition: " + context.doStrategy(30, 20));

      context = new Context(new Multiplication());		
      System.out.println("Multiplication: " + context.doStrategy(30, 20));
    }
}

