/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paymentmain;

interface PaymentStrategy{
    String pay(double amount);
}
class CreditCardPayment implements PaymentStrategy{
    public String pay(double amount){
        return "Paid $" + amount +" using Credit Card";
    }
} 

class payPalPayment implements PaymentStrategy{
    public String pay(double amount){
        return "Paid $" + amount + " using  Pay Pal";
    }
}

class BankTransferPayment implements PaymentStrategy{
    public String pay(double amount){
        return "Paid $"+ amount + " using Bank Transfer";
    }
}

class PaymentProcessor{
    private PaymentStrategy paymentStrategy;
    PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public String doPayment(double amount){
        return paymentStrategy.pay(amount);
    }
}
public class PaymentMain {

    public static void main(String[] args) {
        PaymentProcessor p1 = new PaymentProcessor(new CreditCardPayment());
        System.out.println("Credit Card Payment: " + p1.doPayment(1000));
        
        PaymentProcessor p2 = new PaymentProcessor(new payPalPayment());
        System.out.println("PayPal Payment: " + p2.doPayment(30000));
    }
}
