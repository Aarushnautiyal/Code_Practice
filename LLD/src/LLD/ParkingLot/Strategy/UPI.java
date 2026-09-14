package LLD.ParkingLot.Strategy;

import LLD.ParkingLot.Entity.Ticket;

public class UPI implements PaymentStrategy{
    @Override
    public void pay(Ticket ticket) {
        System.out.println("paid using upi");
        ticket.setIsPaid(true);
    }
}
