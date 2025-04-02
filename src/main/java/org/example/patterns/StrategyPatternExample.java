package org.example.patterns;

/** The Strategy pattern defines a family of algorithms and makes them interchangeable.
 *  The strategy allows a client to choose the algorithm to use, decoupling the algorithm from the client code.
 *
 *  Use case: When you have different algorithms for a task and want to allow clients to select the appropriate one at runtime.
 *
 */
interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        strategy.pay(amount);
    }
}

public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.executePayment(100);  // Uses CreditCardPayment

        context = new PaymentContext(new PayPalPayment());
        context.executePayment(200);  // Uses PayPalPayment
    }
}

