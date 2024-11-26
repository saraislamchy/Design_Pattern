/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biryanimain;


    interface Biryani{
        String getDes();
        double getCost();
}

    class PlainBiryani implements Biryani{
        public String getDes(){
            return "Plain Biryani";
        }
        public double getCost(){
            return 200;
        }
    }
    
    class BiryaniDecorator implements Biryani{
        protected Biryani decoratedBiryani;
        BiryaniDecorator(Biryani decoratedBiryani){
            this. decoratedBiryani = decoratedBiryani;
        }
        public String getDes(){
            return decoratedBiryani.getDes();
        }
        public double getCost(){
            return decoratedBiryani.getCost();
        }
    }

    class ChickenDecorator extends BiryaniDecorator{
        public ChickenDecorator(Biryani decoratedBiryani){
            super(decoratedBiryani);
         }
        public String getDes(){
            return decoratedBiryani.getDes() + " with Chicken Roast";
        }
        public double getCost(){
            return decoratedBiryani.getCost() + 150;
        } 
     }

    class MuttonDecorator extends BiryaniDecorator{
        public MuttonDecorator(Biryani decoratedBiryani){
            super(decoratedBiryani);
         }
        public String getDes(){
            return decoratedBiryani.getDes() + " with Mutton Rezala";
        }
        public double getCost(){
            return decoratedBiryani.getCost() + 300;
        } 
     }

    class EggDecorator extends BiryaniDecorator{
        public EggDecorator(Biryani decoratedBiryani){
            super(decoratedBiryani);
         }
        public String getDes(){
            return decoratedBiryani.getDes() + " and Egg.";
        }
        public double getCost(){
            return decoratedBiryani.getCost() + 50;
        } 
     }

public class BiryaniMain {

    public static void main(String[] args) {
        Biryani b1 = new PlainBiryani();
        System.out.println("Description: " + b1.getDes());
        System.out.println("Cost: " + b1.getCost() +" TK");
        
        
        Biryani b2 = new EggDecorator(new ChickenDecorator(new PlainBiryani()));
        System.out.println("Description: " + b2.getDes());
        System.out.println("Cost: " + b2.getCost() +" TK");
    }
}
