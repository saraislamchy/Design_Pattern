/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strategymain;

interface NumberSystem {
   public int ConvertNumber(int num);
}

class Binary implements NumberSystem  {
   public int ConvertNumber(int num) {
      return num*2;
   }
}

class Octal implements NumberSystem {
   public int ConvertNumber(int num) {
      return num*8;
   }
}

class Hexadecimal implements NumberSystem  {
   public int ConvertNumber(int num) {
      return num*16;
   }
}
class Context {
   private NumberSystem strategy;

   public Context(NumberSystem strategy){
      this.strategy = strategy;
   }

   public int doStrategy(int num)
   {
      return strategy.ConvertNumber(num);
   }
}

public class StrategyMain {

    public static void main(String[] args) {
      Context context = new Context(new Binary());		
      System.out.println("Binary: " + context.doStrategy(10));

      context = new Context(new Octal());		
      System.out.println("Octal: " + context.doStrategy(20));  
    }
}
