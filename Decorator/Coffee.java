/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coffee;

    interface CoffeeInterface{
    String getDescription();
    double getCost();
}
    class PlainCoffee implements CoffeeInterface{
    public String getDescription(){
    return "Plain Coffee";
    }
    
    public double getCost(){
    return 200;
    }
}
    class CoffeeDecorator implements CoffeeInterface{
    protected CoffeeInterface decoreatedCoffee;
        
    CoffeeDecorator(CoffeeInterface decoreatedCoffee){
    this.decoreatedCoffee = decoreatedCoffee;
    }
    public String getDescription(){
    return decoreatedCoffee.getDescription();
    }
    public double getCost(){
    return decoreatedCoffee.getCost();
    }
}
    class SugarDecorator extends CoffeeDecorator{
    SugarDecorator(CoffeeInterface decoreatedCoffee){
    super(decoreatedCoffee);
    }
    public String getDescription(){
    return decoreatedCoffee.getDescription() + ", Sugar.";
    }
    public double getCost(){
    return decoreatedCoffee.getCost() + 100;
    }
}
    class MilkDecorator extends CoffeeDecorator{
    MilkDecorator(CoffeeInterface decoreatedCoffee){
    super(decoreatedCoffee);
    }
    public String getDescription(){
    return decoreatedCoffee.getDescription() + ", Milk.";
    }
    public double getCost(){
    return decoreatedCoffee.getCost() + 150;
    }
}

    public class Coffee {
    public static void main(String[] args) {
    CoffeeInterface coffee = new PlainCoffee();
    System.out.println("Name: "+coffee.getDescription());
    System.out.println("Cost: "+ coffee.getCost());

    CoffeeInterface sugarCoffee = new SugarDecorator(new SugarDecorator(new PlainCoffee()));
    System.out.println("Name: "+sugarCoffee.getDescription());
    System.out.println("Cost: "+ sugarCoffee.getCost());

    CoffeeInterface milksugarCoffee = new MilkDecorator(new SugarDecorator(new SugarDecorator(new PlainCoffee())));
    System.out.println("Name:"+milksugarCoffee.getDescription());
    System.out.println("Cost: "+ milksugarCoffee.getCost());

    }
}
