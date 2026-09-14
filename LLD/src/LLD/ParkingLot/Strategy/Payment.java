package LLD.ParkingLot.Strategy;

import LLD.ParkingLot.Entity.Ticket;

public class Payment {
    PaymentStrategy paymentStrategy;
    public Payment(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(Ticket ticket, int money, int price){
        if(price!=money) throw new IllegalArgumentException("Money is not sufficient");
        paymentStrategy.pay(ticket);

    }
}
