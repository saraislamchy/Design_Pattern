/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burger;

 interface BurgerInterface{
    String getDescription();
    double getCost();
}
 class NormalBurger implements BurgerInterface{
    public String getDescription(){
        return "Normal Burger";
    }
    public double getCost(){
        return 200;
    }
 }
    
 class ChickenBurger implements BurgerInterface{
    public String getDescription(){
        return "Chicken Burger";
    }
    public double getCost(){
        return 300;
    }
}

 class HamBurger implements BurgerInterface{
    public String getDescription(){
        return "Ham Burger";
    }
    public double getCost(){
        return 500;
    }
}
 class BurgerDecorator implements BurgerInterface{
    protected BurgerInterface decoreatedBurger;
    BurgerDecorator(BurgerInterface decoreatedBurger){
        this.decoreatedBurger = decoreatedBurger;
    }
    public String getDescription(){
        return decoreatedBurger.getDescription();
    }
    public double getCost(){
        return decoreatedBurger.getCost();
    }
}
class CheeseDecorator extends BurgerDecorator{
    CheeseDecorator(BurgerInterface decoreatedBurger){
        super(decoreatedBurger);
    }
    public String getDescription(){
        return decoreatedBurger.getDescription()+ ", with extra Cheese";
    }
    public double getCost(){
        return decoreatedBurger.getCost()+ 100;
    }
}


public class Burger {
    public static void main(String[] args) {
        BurgerInterface normalBurger = new NormalBurger();
        System.out.println("Name: " +normalBurger.getDescription());
        System.out.println("Price: TK "+normalBurger.getCost());
        
        BurgerInterface chikenBurger = new ChickenBurger();
        System.out.println("Name: " +chikenBurger.getDescription());
        System.out.println("Price: TK "+chikenBurger.getCost());
        
        BurgerInterface cheesyChikenBurger = new CheeseDecorator(new ChickenBurger());
        System.out.println("Name: " +cheesyChikenBurger.getDescription());
        System.out.println("Price: TK "+cheesyChikenBurger.getCost());
        
        BurgerInterface cheesyHamBurger = new CheeseDecorator(new HamBurger());
        System.out.println("Name: " +cheesyHamBurger.getDescription());
        System.out.println("Price: TK "+cheesyHamBurger.getCost());
        
        
        
    }
}
