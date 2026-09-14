package LLD.ParkingLot.Strategy;

import LLD.ParkingLot.Entity.Ticket;

public interface PaymentStrategy {
    void pay(Ticket ticket);
}
